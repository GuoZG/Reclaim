package com.example.thread;

import java.util.concurrent.Executor;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;


@SpringBootConfiguration
@EnableAsync//注解开启对异步任务的支持
public class ThreadPool implements AsyncConfigurer  {

	@Override
	public Executor getAsyncExecutor() {
		ThreadPoolTaskExecutor threadPoolTaskExecutor=new ThreadPoolTaskExecutor();
		threadPoolTaskExecutor.setCorePoolSize(5);//设置线程池的核心线程大小
		threadPoolTaskExecutor.setMaxPoolSize(10);//设置线程池的最大线程
		threadPoolTaskExecutor.setQueueCapacity(1000);//设置线程池的队列最大长度 
		threadPoolTaskExecutor.setKeepAliveSeconds(300);//线程池维护线程所允许的空闲时间
		threadPoolTaskExecutor.initialize();//初始化开始
		System.out.println("活动线程："+threadPoolTaskExecutor.getActiveCount());
		return threadPoolTaskExecutor;
	}

	@Override
	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		// TODO Auto-generated method stub
		return null;
	}

}
