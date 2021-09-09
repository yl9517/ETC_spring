package com.kosta.aspect1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class Advice4 {

	@Around("execution(* com.kosta.service.*.*(..))") // 괄호 안 문자열이 pointcut
	public Object around(ProceedingJoinPoint joinpoint) throws Throwable{
		//전처리
		long start = System.currentTimeMillis();
		System.out.println("시작시간 : "+start);
		try {
			Object o = joinpoint.proceed();  //joinpoint 실행
			return o;
		}finally {
			//후처리
			long end = System.currentTimeMillis();
			System.out.println("종료시간 : "+end);
			System.out.println("!!!!!끝!!!!!!");
			System.out.println("처리시간 :::: "+(end-start));
		}
	}
}
