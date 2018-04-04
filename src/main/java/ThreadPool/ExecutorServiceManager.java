package ThreadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


/**
 * 整个服的线程池工具类
 * 
 */
public class ExecutorServiceManager {
	
	private static ExecutorServiceManager serviceManager = new ExecutorServiceManager();
	/** 线程池 */
	private ScheduledExecutorService executor;

	private ExecutorServiceManager() {
	}

	public static ExecutorServiceManager getInstance() {
		return serviceManager;
	}

	/**
	 * 初始化线程池
	 */
	public void initExecutorService() {
//		executor =  Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors()*2+1);//综合考虑还是选择固定线程池适合业务
		executor =  Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()*2+1);
	}
	
	/**
	 * 得到线程池对象
	 * 
	 * @return
	 */
	public ScheduledExecutorService getExecutorService() {
		return executor;
	}

	/**
	 * 关闭线程池
	 * 
	 * @throws InterruptedException
	 */
	public void stop() throws InterruptedException {
		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.SECONDS);
	}

}
