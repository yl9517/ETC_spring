package com.kosta.aspect1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class Advice2 {
	
	public Object around(ProceedingJoinPoint joinpoint) throws Throwable{
		StopWatch watch = new StopWatch();
		watch.start();
		System.out.println("start!");
		System.out.println("joinpoint......"+joinpoint);
		
		try {
			Object o = joinpoint.proceed();  //얘를 기준으로 위에는 전처리 아래는 후처리 
			return o;
		}finally {
			System.out.println("end!");
			watch.stop();
			System.out.println("처리시간..."+(watch.getTotalTimeMillis()));
		}
		
	}
}
