package hello.aaa.bbb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import netty.ToString;


@Component
public class BBBB {
  @Value(value = "234") 
  public int aa = 1999;
  @Scheduled(fixedRate = 2000)
  public void myTest(){  
	  ToString.println("进入测试");
  }
  
  
}
