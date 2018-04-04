package ball.match;

import java.util.List;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import application.ApplicationContextHelper;
import dao.TMatchMapper;
import dao.pojo.TMatch;
import dao.pojo.TMatchExample;
import message.MessageId;
import netty.test2.ErrorCodeGame;
import user.info.User;
import user.login.Login;

public class MatchImpl implements IMatch {

	@Override
	public void todayMatchList(User user, JSONObject jsonRequest, JSONObject jsonResponse) {
		jsonResponse.put("msgid", MessageId.TODAY_MATCH_LIST_RESPONSE);
		String uuid = user.getUuid();
//		String uuid = jsonRequest.getString("uuid");
		long club_id = jsonRequest.getIntValue("club_id");
		if(StringUtils.isEmpty(uuid)) {
			jsonResponse.put("err_code", ErrorCodeGame.UUID_ERROR);
			return;
		}
//		User user = Login.get(uuid);
//		if(null == user) {
//			jsonResponse.put("err_code", ErrorCodeGame.USER_NOEXIST_ERROR);
//			return;
//		}
		TMatchMapper matchMapper = (TMatchMapper)ApplicationContextHelper.getInstance().getBean("TMatchMapper");
		TMatchExample example = new TMatchExample();
		dao.pojo.TMatchExample.Criteria criteria = example.createCriteria();
		criteria.andClubId1EqualTo(club_id);//没写完 这里可能不包含全部信息
		List<TMatch> list = matchMapper.selectByExample(example);
		JSONArray jsonArray = new JSONArray();
		for (int i = 0; i < list.size(); i++) {
			TMatch match = list.get(i);
			JSONObject json = new JSONObject();
			json.put("id", match.getId());
			json.put("time", match.getMatchTime());
			json.put("club_id2", match.getClubId1());
			json.put("club_id2", match.getClubId2());
			json.put("club_name1", match.getClubName1());
			json.put("club_name2", match.getClubName2());
			json.put("score_match", match.getScoreMatch());
			jsonArray.add(json);
		}
		jsonResponse.put("LIST", jsonArray.toString());
		jsonResponse.put("err_code", ErrorCodeGame.SUCCESS);
	}

}
