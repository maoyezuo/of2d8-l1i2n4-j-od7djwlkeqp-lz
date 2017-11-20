package user.clue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

import ball.club.OriginalClubData;
import ball.info.ClubInfo;
import user.info.User;
import user.login.Login;

public class UserClubImpl {
	private static Map<Long, ClubInfo> clubMap = new HashMap<Long, ClubInfo>();
	public static synchronized void add(ClubInfo clubInfo) {
		clubMap.put(clubInfo.getId(), clubInfo);
	}
	
	public static synchronized void remove(Long clubId) {
		clubMap.remove(clubId);
	}
	
	public static synchronized ClubInfo get(Long clubId) {
		return clubMap.get(clubId);
	}
	
	public static synchronized List<ClubInfo> getList() {
		return (List<ClubInfo>) clubMap.values();
	}
	
	public static synchronized boolean isExist(Long id) {
		return clubMap.containsKey(id);
	}
	
	public void creatClub(JSONObject json) throws Exception {
		String uuid = json.getString("uuid");
		Long selectid = Long.parseLong(json.getString("selectid"));
		User user = Login.get(uuid);
		if(!user.isLogin()) {
			return;
		}
		if(!isExist(selectid)) {
			return;
		}
		ClubInfo clubInfo = OriginalClubData.get(selectid).deepClone();
		user.setClub(clubInfo);
		add(clubInfo);
	}
	
	public static UserClubImpl getInstance() {
		return new UserClubImpl();
	}
	
	

}
