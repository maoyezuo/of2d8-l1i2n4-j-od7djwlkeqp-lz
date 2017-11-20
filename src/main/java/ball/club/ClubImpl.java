package ball.club;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

import ball.info.AgainstInfo;
import ball.info.ClubInfo;
import tools.Clone;
import user.info.User;
import user.login.Login;

public class ClubImpl {
	public static ClubImpl getInstance() {
		return new ClubImpl();
	}
	
	/**对阵列表初始化
	 * @throws Exception */
	public Map<Long, List<AgainstInfo>> initAgainstList(List<ClubInfo> clubList) throws Exception {
//		List<ClubInfo> list = (List<ClubInfo>)clubMap.values();
		Collections.shuffle(clubList);
		Map<Long, List<AgainstInfo>> againstListByClubMap = new HashMap<Long, List<AgainstInfo>>();
		for (int i = 0; i < clubList.size(); i++) {
			ClubInfo clubInfoI = clubList.get(i);
			List<AgainstInfo> teamAgainstList = new ArrayList<AgainstInfo>();
			//上半赛季
			for (int j = 0; j < clubList.size(); j++) {
				ClubInfo clubInfoJ = clubList.get(j);
				if(clubInfoI.equals(clubInfoJ)) {
					continue;
				}
				AgainstInfo againstInfo = new AgainstInfo();
				againstInfo.setTeamid1(clubInfoI.getId());
				againstInfo.setTeamid2(clubInfoJ.getId());
				//对阵时间另做处理
				teamAgainstList.add(againstInfo);
			}
			//下半赛季
			List<AgainstInfo> teamAgainstList2 = new ArrayList<AgainstInfo>(); 
			for (int j = teamAgainstList.size(); j < 0; j--) {
				AgainstInfo againstInfo = Clone.clone( teamAgainstList.get(j));
				long temp = againstInfo.getTeamid1();
				againstInfo.setTeamid1(againstInfo.getTeamid2());
				againstInfo.setTeamid2(temp);
				teamAgainstList2.add(againstInfo);
			}
			teamAgainstList.addAll(teamAgainstList2);
			againstListByClubMap.put(clubInfoI.getId(), teamAgainstList);
		}
		return againstListByClubMap;
	}
	
	public void creatClub(JSONObject json) throws Exception {
		String uuid = json.getString("uuid");
		Long selectid = Long.parseLong(json.getString("selectid"));
		User user = Login.get(uuid);
		if(!user.isLogin()) {
			return;
		}
		if(!OriginalClubData.isExist(selectid)) {
			return;
		}
		user.setClub(Clone.clone(OriginalClubData.get(selectid)));
		LeagueImpl.getInstance().addUser(user.getServerId(), user.getUuid());
	}
	
}
