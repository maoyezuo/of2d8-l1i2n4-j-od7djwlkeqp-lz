package user.login;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import com.alibaba.fastjson.JSONObject;

import user.info.User;

public class Login {
	private static Map<String, User> uuidMap = new HashMap<String, User>();
//	private static ConcurrentSkipListSet<String> nicknameMap = new ConcurrentSkipListSet<String>();//nickname不需要唯一，取消
	private static AtomicLong atomicLong;
	
	public int login(JSONObject json) {
		String uuid = json.getString("uuid");
		String psw = json.getString("psw");
		if(!uuidMap.containsKey(uuid)) {
			return 4;//没注册
		}
		User user = uuidMap.get(uuid);
		if(!user.getPassword().equals(psw)) {
			return 3;//密码不正确
		}
		if(user.isLogin()) {
			return 2;//已登录
		}
		user.setLogin(true);
		return 1;
	}
	
	public int register(JSONObject json) {
		String serverId = json.getString("serverId");
		String nickname = json.getString("nickname");
		String psw = json.getString("psw");
		long id = atomicLong.incrementAndGet();
		StringBuffer strb = new StringBuffer();
		strb.append(id);
		strb.append("-");
		strb.append(serverId);
		strb.append("-");
		strb.append(nickname);
		String uuid = strb.toString();
//		if(isExistNickName(nickname)) {
//			return 2;//昵称已注册
//		}
		if(uuidMap.containsKey(uuid)) {
			return 1;//已注册
		}
		User user = new User();
		user.setUuid(uuid);
		user.setPassword(psw);
		uuidMap.put(uuid, user);
//		nicknameMap.add(nickname);
		return 0;
	}

//	public boolean isExistNickName(String nickname) {
//		return nicknameMap.contains(nickname);
//	}
	
	public static Login getInstance() {
		return new Login();
	}
	
	public static User get(String uuid) {
		return uuidMap.get(uuid);
	}
	
	public boolean isLogin(String uuid) {
		return uuidMap.get(uuid).isLogin();
	}
	
	
}
