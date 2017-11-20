package redis;

import redis.clients.jedis.Jedis;

public class RedisData {
	
	public static Jedis jedis;
	public static void init() {
		  jedis = new Jedis("localhost",6379);
	}
	
	
}
