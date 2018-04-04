package ball.favorite;

import java.util.List;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import application.ApplicationContextHelper;
import ball.club.OriginalClubData;
import ball.player.PlayerInfo;
import ball.transfermarket.MarketData;
import dao.TFavoritePlayerMapper;
import dao.pojo.TFavoritePlayer;
import dao.pojo.TFavoritePlayerExample;
import dao.pojo.TFavoritePlayerExample.Criteria;
import message.MessageId;
import netty.test2.ErrorCodeGame;
import user.info.User;
import user.login.Login;

public class FavoriteImpl implements IFavorite {

	@Override
	public void favoritePlayerList(User user, JSONObject jsonRequest, JSONObject jsonResponse) throws Exception {
		jsonResponse.put("msgid", MessageId.FAVORITE_PLAYER_RESPONSE);
//		String uuid = jsonRequest.getString("uuid");
//		if(StringUtils.isEmpty(uuid)) {
//			jsonResponse.put("err_code", ErrorCodeGame.UUID_ERROR);
//			return;
//		}
//		User user = Login.get(uuid);
//		if(null == user) {
//			jsonResponse.put("err_code", ErrorCodeGame.USER_NOEXIST_ERROR);
//			return;
//		}
		String uuid = user.getUuid();
		TFavoritePlayerMapper favoritePlayerMapper = (TFavoritePlayerMapper)ApplicationContextHelper.getInstance().getBean("TFavoritePlayerMapper");
		TFavoritePlayerExample example = new TFavoritePlayerExample();
		Criteria criteria = example.createCriteria();
		criteria.andUuidEqualTo(uuid);
		List<TFavoritePlayer> favoritePlayers = favoritePlayerMapper.selectByExample(example);
		JSONArray jsonArray = new JSONArray();
		for (int i = 0; i < favoritePlayers.size(); i++) {
			TFavoritePlayer tfavoritePlayer = favoritePlayers.get(i);
			PlayerInfo info = MarketData.get(tfavoritePlayer.getPlayerId());
			JSONObject json = new JSONObject();
			json.put("id", info.getId());
			json.put("name", info.getName());
			json.put("club_id", info.getClubId());
			json.put("club_name", OriginalClubData.get(info.getClubId()));
			json.put("position", info.getPosition());
			jsonArray.add(json);
		}
//		List<PlayerInfo> list = user.getFavoritePlayersList();
//		JSONArray jsonArray = new JSONArray();
//		PlayerInfo info = null;
//		for (int i = 0; i < list.size(); i++) {
//			JSONObject json = new JSONObject();
//			info = list.get(i);
//			json.put("id", info.getId());
//			json.put("name", info.getName());
//			json.put("club_id", info.getClubId());
//			json.put("club_name", OriginalClubData.get(info.getClubId()));
//			json.put("position", info.getPosition());
//			jsonArray.add(json);
//		}
		jsonResponse.put("LIST", jsonArray.toString());
		jsonResponse.put("err_code", ErrorCodeGame.SUCCESS);
	}


}
