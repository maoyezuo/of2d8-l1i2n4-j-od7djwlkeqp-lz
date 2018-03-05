package ball.club;

import java.util.Timer;
import java.util.TimerTask;

import netty.ToString;

public class Test {
	public static void main(String[] args) {
		
		f(()->
			{
			Timer timer2 = new Timer();
			TimerTask task = new TimerTask() {
				@Override
				public void run() {
					System.out.println("OK");
					timer2.cancel();
		            System.out.println("#### 程序结束 ####");
				}
			};
			timer2.schedule(task, 500);
			}
			,1
		);
		
	}
	
	 public static void f(VoidTest v, int a){  
		 ToString.println(a);
		v.f();  
		 ToString.println("----end");
     }  
}

interface VoidTest{  
    public void f();  
}  
