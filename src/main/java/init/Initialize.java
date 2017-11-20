package init;

import ball.transfermarket.MarketData;
import redis.RedisData;
import time.TimeData;

public class Initialize {
	
	public static void run() throws Exception {
		OriginalData();
		RedisData.init();
		TimeData.init();
	}
	
	private static void OriginalData() throws Exception {
		MarketData.init();
		
		
	}
}
