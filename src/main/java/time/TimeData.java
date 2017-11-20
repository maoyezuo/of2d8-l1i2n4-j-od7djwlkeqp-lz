package time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import redis.RedisData;

public class TimeData {
	public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
	public static GregorianCalendar gametime ;  
	
	public static void init() throws Exception {
		String time = RedisData.jedis.get("gametime");
		if(null != time) {
			gametime.setTime(sdf.parse(time));
		}
		if(null == gametime) {
			gametime =   (GregorianCalendar)Calendar.getInstance();  
			gametime.setTime(new GregorianCalendar(2018, 5, 29, 10, 0).getTime());
			RedisData.jedis.set("gametime", sdf.format(gametime.getTime()));
			
			
		}
		
	}
	
	public static void main(String[] args) {
		try {
			RedisData.init();
			init();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
