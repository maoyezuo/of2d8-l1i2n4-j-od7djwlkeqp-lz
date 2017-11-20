package tools;

public class StringName {
	public static String getRandomString(int length) { // length琛ㄧず鐢熸垚瀛楃涓茬殑闀垮害
		String base = "abcdefghijklmnopqrstuvwxyz0123456789";
		StringBuffer sb = new StringBuffer();
		int type = RandomTool.random.nextInt(2);// 0瀛楁瘝鎵嬫満鍙峰悗鍥涗綅锛�1瀹屽叏闅忔満
		sb.append(base.charAt(RandomTool.random.nextInt(26)));// 棣栦綅
		if (0 == type) {
			for (int i = 0; i < length - 5; i++) {
				sb.append(base.charAt(RandomTool.random.nextInt(base.length())));
			}
			for (int i = 0; i < 4; i++) {
				sb.append(base.charAt(26 + RandomTool.random.nextInt(10)));
			}
		} else {
			for (int i = 0; i < length - 1; i++) {
				sb.append(base.charAt(RandomTool.random.nextInt(base.length())));
			}
		}
		return sb.toString();
	}
}
