package user.login;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSONObject;

import ThreadPool.ExecutorServiceManager;
import application.ApplicationContextHelper;
import dao.TUserMapper;
import dao.pojo.TUser;
import dao.pojo.TUserExample;
import io.netty.channel.Channel;
import message.MessageId;
import netty.ToString;
import netty.test2.ErrorCodeGame;
import netty.test2.MyBusinessLogicHandler;
import user.info.User;

public class Login implements ILogin{
	private final static Logger logger = LoggerFactory.getLogger(Login.class);
	
	private static Map<String, User> uuidMap = new ConcurrentHashMap<String, User>();
	private static Map<Channel, User> channelMap = new ConcurrentHashMap<Channel, User>();
//	private static ConcurrentSkipListSet<String> nicknameMap = new ConcurrentSkipListSet<String>();//nickname不需要唯一，取消
	private static AtomicLong atomicLong = new AtomicLong();
	
	@Override
	public void login(Channel channel, JSONObject jsonRequest, JSONObject jsonResponse) {
		jsonResponse.put("msgid", MessageId.LOGIN_RESPONSE);
		logger.info("收到消息 "+jsonRequest.toString());
		String uuid = jsonRequest.getString("uuid");
		String account_name = jsonRequest.getString("name");
		String psw = jsonRequest.getString("psw");
		if(StringUtils.isEmpty(account_name) ) {
			jsonResponse.put("err_code", ErrorCodeGame.USER_NANE_ERROR);
			return;
		}
		User user = new User();
		if(StringUtils.isEmpty(uuid)) {
			if(StringUtils.isEmpty(psw) ) {
				jsonResponse.put("err_code", ErrorCodeGame.USER_PSW_ERROR);
				return;
			}
			TUserMapper userMapper = (TUserMapper)ApplicationContextHelper.getInstance().getBean("TUserMapper");
			TUserExample example = new TUserExample();
			dao.pojo.TUserExample.Criteria criteria = example.createCriteria();
			criteria.andIdnameEqualTo(account_name);
			
			List<TUser> list = userMapper.selectByExample(example);
			if(0 == list.size()) {
				jsonResponse.put("err_code", ErrorCodeGame.USER_NANE_ERROR);
				return;
			}
			criteria.andPasswordEqualTo(psw);
			list = userMapper.selectByExample(example);
			if(0 == list.size()) {
				jsonResponse.put("err_code", ErrorCodeGame.USER_PSW_ERROR);
				return;
			}
			TUser tUser = list.get(0);
			user.settUser(tUser);
			uuid = user.getUuid();
			uuidMap.remove(uuid);
		}else {
			if(uuidMap.containsKey(uuid)) {
				user = uuidMap.get(uuid);
				if(user.isLogin()) {
					jsonResponse.put("err_code", ErrorCodeGame.LOGIN_ERROR);
					return;
				}
			}else {
				TUserMapper userMapper = (TUserMapper)ApplicationContextHelper.getInstance().getBean("TUserMapper");
				TUserExample example = new TUserExample();
				dao.pojo.TUserExample.Criteria criteria = example.createCriteria();
				criteria.andUuidEqualTo(uuid);
				List<TUser> list = userMapper.selectByExample(example);
				if(0 == list.size()) {
					jsonResponse.put("err_code", ErrorCodeGame.UUID_ERROR);
					return;
				}
				TUser tUser = list.get(0);
				user.settUser(tUser);
			}
			if(!account_name.equals(user.gettUser().getIdname())) {// 前端要保存uuid和idname
				jsonResponse.put("err_code", ErrorCodeGame.USER_NANE_ERROR);
				return;
			}
		}
		if(!uuidMap.containsKey(uuid)) {
			user.setChannel(channel);
			uuidMap.put(uuid, user);
			channelMap.put(channel, user);
			jsonResponse.put("uuid", user.getUuid());
			heartStart(channel, user);
		}
		jsonResponse.put("err_code", ErrorCodeGame.SUCCESS);
	}

	public void register(Channel channel, JSONObject json, JSONObject jsonResponse) {
		jsonResponse.put("msgid", MessageId.REGISTER_RESPONSE);
		String account_name = json.getString("name");
		String psw = json.getString("psw");
		if(StringUtils.isEmpty(account_name)) {
			jsonResponse.put("err_code", ErrorCodeGame.USER_NANE_ERROR);
			return;
		}
		if(StringUtils.isEmpty(psw) ) {
			jsonResponse.put("err_code", ErrorCodeGame.USER_PSW_ERROR);
			return;
		}
		TUserMapper userMapper = (TUserMapper)ApplicationContextHelper.getInstance().getBean("TUserMapper");
		TUserExample example = new TUserExample();
		dao.pojo.TUserExample.Criteria criteria = example.createCriteria();
		criteria.andIdnameEqualTo(account_name);
		List<TUser> list = userMapper.selectByExample(example);
		if(0 < list.size()) {
			jsonResponse.put("err_code", ErrorCodeGame.USER_NOEXIST_ERROR);
			return;
		}
		TUser tuser = new TUser();
		tuser.setIdname(account_name);
		tuser.setPassword(psw);
		tuser.setMoney(0);
		tuser.setNickname("");
		tuser.setServerId(1);
		userMapper.insert(tuser);
		tuser.setUuid(tuser.getServerId()+"_"+tuser.getId());
//		userMapper.updateByExample(tuser, example);//ByPrimaryKey(tuser);
		userMapper.updateByPrimaryKey(tuser);
		jsonResponse.put("uuid", tuser.getUuid());
		
		User user = new User();
		user.setChannel(channel);
		uuidMap.put(tuser.getUuid(), user);
		channelMap.put(channel, user);
		jsonResponse.put("err_code", ErrorCodeGame.SUCCESS);
	}
	
	/** 心跳包间隔时间 */
	private static final long heart_gap_time = 7000;
	/** 心跳包断开时间 */
	private static final long heart_offline_time = 30000;
	public void heartStart(Channel channel, User user) {
		user.setLastHeartTime(System.currentTimeMillis());
		ExecutorServiceManager.getInstance().getExecutorService().scheduleAtFixedRate(
				()->{
						if(0 != user.getLastHeartTime() && (System.currentTimeMillis()-user.getLastHeartTime()) >= heart_offline_time) {
							user.offline();
						}else {
							logger.info("----心跳 "+user.getUuid());
							JSONObject jsonResponse = new JSONObject();
							jsonResponse.put("msgid", MessageId.HEART_RESPONSE);
							MyBusinessLogicHandler.send(channel, jsonResponse.toString());
						}
					}
				, 0, heart_gap_time, TimeUnit.MILLISECONDS);
	}

//	public boolean isExistNickName(String nickname) {
//		return nicknameMap.contains(nickname);
//	}

	@Override
	public void heartResponse(User user) {
		user.setLastHeartTime(System.currentTimeMillis());
	}

	public static Login getInstance() {
		return new Login();
	}
	
	public static User get(String uuid) {
		return uuidMap.get(uuid);
	}
	public static User get(Channel channel) {
		return channelMap.get(channel);
	}
	
	public static boolean removeByUuid(String uuid) {
		User user1 = uuidMap.remove(uuid);
		User user2 = channelMap.remove(uuidMap.get("uuid").getChannel());
		return null != user1 &&  null != user2;
	}
	
	public boolean isLogin(String uuid) {
		return uuidMap.get(uuid).isLogin();
	}

	public static User getUuidMap(String uuid) {
		if(StringUtils.isEmpty(uuid)) {
			return null;
		}
		if(!uuidMap.containsKey(uuid)) {
			return null;
		}
		User user = uuidMap.get(uuid);
		if(null == user.getChannel()) {
			return null;
		}
		return user;
	}
	
	
}
