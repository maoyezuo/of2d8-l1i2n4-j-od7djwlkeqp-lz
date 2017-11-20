package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import init.Initialize;

@SpringBootApplication
@EnableScheduling
//@EnableAutoConfiguration
//@PropertySource("classpath:applicationContext.xml")  
public class Application {
//	@Bean
//	JedisConnectionFactory jedisConnectionFactory() {
//	    JedisConnectionFactory jedisConFactory = new JedisConnectionFactory();
//	    jedisConFactory.setHostName("localhost");
//	    jedisConFactory.setPort(6379);
//	    return jedisConFactory;
//	}
//	 
//	@Bean
//	public RedisTemplate<String, Object> redisTemplate() {
//	    RedisTemplate<String, Object> template = new RedisTemplate<String, Object>();
//	    template.setConnectionFactory(jedisConnectionFactory());
//	    return template;
//	}

    public static void main(String[] args) {
    	try {
			Initialize.run();
			ApplicationContext ctx = SpringApplication.run(Application.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
//    	String[] beans = ctx.getBeanDefinitionNames();
//    	for(String b:beans) {
//    		ToString.println(b);
//    	}
    	
//    	ctx.getBean(Application.class);
//    	BBBB template = ctx.getBean(BBBB.class);
//    	ToString.println(template.aa);
    	
    }
}
