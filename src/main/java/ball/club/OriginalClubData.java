package ball.club;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import ball.info.ClubInfo;

public class OriginalClubData {
	private static Map<Long, ClubInfo> clubMap = new ConcurrentHashMap<Long, ClubInfo>();
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
}
