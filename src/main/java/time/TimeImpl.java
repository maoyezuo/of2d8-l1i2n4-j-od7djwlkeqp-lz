package time;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TimeImpl {
	public static TimeImpl getInstance() {
		return new TimeImpl();
	}
	
	public Date getTime() {
		return TimeData.gametime.getTime();
	}
	
	public Date getTime(GregorianCalendar gc) {
		return gc.getTime();
	}
	
	public void go1Day(GregorianCalendar gc) {
		gc.add(Calendar.DAY_OF_YEAR, 1);
	}
	
	public void go3Hour(GregorianCalendar gc) {
		gc.add(Calendar.HOUR, 3);
	}
	
	public void goHalfHour(GregorianCalendar gc) {
		gc.add(Calendar.MINUTE, 30);
	}
	
//	public static void main(String[] args) {
//		TimeData.init();
//		for (int i = 0; i < 15; i++) {
//			TimeImpl.getInstance().go1Day(TimeData.gametime);
//			ToString.println(TimeData.gametime.getTime());
//		}
//	}
	
	
	
}
