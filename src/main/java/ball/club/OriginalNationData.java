package ball.club;

import java.util.HashMap;
import java.util.Map;

import ball.info.NationInfo;

public class OriginalNationData {
	private static Map<Integer, NationInfo> nationMap = new HashMap<Integer, NationInfo>();
	public static synchronized void add(NationInfo nationInfo) {
		nationMap.put(nationInfo.getId(), nationInfo);
	}
	
	public static synchronized void remove(Integer nationId) {
		nationMap.remove(nationId);
	}
	
	public static synchronized NationInfo get(Integer nationId) {
		return nationMap.get(nationId);
	}
}
