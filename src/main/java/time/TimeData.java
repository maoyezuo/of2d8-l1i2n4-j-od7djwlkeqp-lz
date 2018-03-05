package time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import netty.ToString;
import redis.RedisData;

public class TimeData {
	public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
	public static GregorianCalendar gametime = (GregorianCalendar)Calendar.getInstance();  ;  
	
	public static void init() throws Exception {
		String time = RedisData.jedis.get("gametime");
		if(null != time) {
			gametime.setTime(sdf.parse(time));
		}
		if(null == gametime) {
			gametime.setTime(new GregorianCalendar(2018, 5, 29, 10, 0).getTime());
			RedisData.jedis.set("gametime", sdf.format(gametime.getTime()));
		}
		ToString.println(time);
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
