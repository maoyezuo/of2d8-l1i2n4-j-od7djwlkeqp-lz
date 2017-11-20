package ball.club;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ball.info.ClubInfo;
import tools.Clone;

public class LeagueImpl {
	public static LeagueImpl getInstance() {
		return new LeagueImpl();
	}
	
//	public static Map<Integer,List<ClubInfo>> map = new HashMap<Integer,List<ClubInfo>>();
//	
//	public void initClubList(int leagueId, List<ClubInfo> clubList) throws Exception {
//		map.put(leagueId, Clone.clone(clubList));
//	}
//	
//	public void addClub(int leagueId, ClubInfo club) throws Exception {
//		if(!map.containsKey(leagueId)) {
//			map.put(leagueId, new ArrayList<ClubInfo>());
//		}
//		map.get(leagueId).add(club);
//	}
	
	public static Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();
	
	public void addUser(int leagueId, String uuid) throws Exception {
		if(!map.containsKey(leagueId)) {
			map.put(leagueId, new ArrayList<String>());
		}
		map.get(leagueId).add(uuid);
	}
	
	
	
	

}
