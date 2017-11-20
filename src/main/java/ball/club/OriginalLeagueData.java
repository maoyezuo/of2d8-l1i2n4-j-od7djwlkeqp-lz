package ball.club;

import java.util.HashMap;
import java.util.Map;

import ball.info.LeagueInfo;

public class OriginalLeagueData {
	private static Map<Integer, LeagueInfo> leagueMap = new HashMap<Integer, LeagueInfo>();
	public static synchronized void add(LeagueInfo nationInfo) {
		leagueMap.put(nationInfo.getId(), nationInfo);
	}
	
	public static synchronized void remove(Integer nationId) {
		leagueMap.remove(nationId);
	}
	
	public static synchronized LeagueInfo get(Integer nationId) {
		return leagueMap.get(nationId);
	}
}
