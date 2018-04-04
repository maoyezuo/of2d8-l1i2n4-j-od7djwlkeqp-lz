package init;

import ThreadPool.ExecutorServiceManager;
import ball.transfermarket.MarketData;
import redis.RedisData;
import time.TimeData;

public class Initialize {
	
	public static void run() throws Exception {
		OriginalData();
		RedisData.init();
		TimeData.init();
		ExecutorServiceManager.getInstance().initExecutorService();
	}
	
	private static void OriginalData() throws Exception {
		MarketData.init();
		
	}
}
