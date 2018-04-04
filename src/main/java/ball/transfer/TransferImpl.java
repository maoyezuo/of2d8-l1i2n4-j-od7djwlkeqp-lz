package ball.transfer;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import application.ApplicationContextHelper;
import ball.player.PlayerInfo;
import ball.transfermarket.MarketData;
import dao.TBallPlayerMapper;
import dao.TTransferMapper;
import dao.pojo.TBallPlayer;
import dao.pojo.TBallPlayerExample;
import dao.pojo.TTransfer;
import dao.pojo.TTransferExample;
import message.MessageId;
import netty.test2.ErrorCodeGame;
import user.info.User;

public class TransferImpl implements ITransfer {

	@Override
	public void top3(User user, JSONObject jsonRequest, JSONObject jsonResponse) {
		jsonResponse.put("msgid", MessageId.TRANSFER_TOP3_RESPONSE);
		TTransferMapper mapper = (TTransferMapper)ApplicationContextHelper.getInstance().getBean("TTransferMapper");
		TTransferExample example = new TTransferExample();
		dao.pojo.TTransferExample.Criteria criteria = example.createCriteria();
		example.setOrderByClause("`price` asc limit 3");
		List<TTransfer> list = mapper.selectByExample(example);
		JSONArray jsonArray = new JSONArray();
		for (int i = 0; i < list.size(); i++) {
			TTransfer ttransfer = list.get(i);
			JSONObject json = new JSONObject();
			json.put("id", ttransfer.getId());
			json.put("player_id", ttransfer.getPlayerId());
			json.put("player_name", ttransfer.getPlayerName());//待写
			json.put("head_ico", ttransfer.getHeadIco());
			json.put("price", ttransfer.getPrice());
			jsonArray.add(json);
		}
		jsonResponse.put("LIST", jsonArray.toString());
		jsonResponse.put("err_code", ErrorCodeGame.SUCCESS);
	}

	@Override
	public void searchPlayer(User user, JSONObject jsonRequest, JSONObject jsonResponse) {
		jsonResponse.put("msgid", MessageId.TRANSFER_SEARCH_RESPONSE);
		String uuid = user.getUuid();
//		String uuid = jsonRequest.getString("uuid");
		long player_id = jsonRequest.getLongValue("player_id");
		long club_id = jsonRequest.getLongValue("club_id");
//		String club_name = jsonRequest.getString("club_name");
		String player_name = jsonRequest.getString("player_name");
		if(StringUtils.isEmpty(uuid) ) {
			jsonResponse.put("err_code", ErrorCodeGame.USER_NANE_ERROR);
			return;
		}
//		if(StringUtils.isEmpty(uuid) ) {
		PlayerInfo playerInfo = null;
		JSONArray jsonArray = new JSONArray();
		List<TBallPlayer> list = null;
//		if(0 != player_id) {
//			playerInfo = MarketData.get(player_id);
//			if(null == playerInfo) {
//				jsonResponse.put("err_code", ErrorCodeGame.PLAYER_NOEXIST_ERROR);
//				return;
//			}
//			list = new ArrayList<>();
//		}else {
//	}
		TBallPlayerMapper mapper = (TBallPlayerMapper)ApplicationContextHelper.getInstance().getBean("TBallPlayerMapper");
		TBallPlayerExample example = new TBallPlayerExample();
		dao.pojo.TBallPlayerExample.Criteria criteria = example.createCriteria();
		if(0 != player_id) {
			criteria.andIdEqualTo(player_id);
		}
		if(0 != club_id ) {
			criteria.andClubIdEqualTo(club_id);
		}
		if(!StringUtils.isEmpty(player_name) ) {
			criteria.andNameLike(player_name);
		}
		list = mapper.selectByExample(example);
		
		for (TBallPlayer player:list) {
			JSONObject json = new JSONObject();
			json.put("id", player.getId());
			json.put("name", player.getName());
			json.put("ca", player.getCa());
			json.put("ca", player.getPa());				
			json.put("price", player.getPrice());
			jsonArray.add(json);
		}
		jsonResponse.put("LIST", jsonArray.toString());
		jsonResponse.put("err_code", ErrorCodeGame.SUCCESS);
	}

	
}
