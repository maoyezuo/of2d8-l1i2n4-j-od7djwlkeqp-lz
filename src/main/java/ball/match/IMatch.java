package ball.match;

import com.alibaba.fastjson.JSONObject;

import user.info.User;

public interface IMatch {
	public static IMatch getInstance() {
		return new MatchImpl();
	}
	/** 今日比赛列表  
	 * @param user */
	void todayMatchList(User user, JSONObject jsonRequest, JSONObject jsonResponse);

}
