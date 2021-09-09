package com.kosta.aspect1;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component //객체 만들기 - aspect 구성하기 위해
@Aspect
public class Advice3 {

//	@Pointcut("execution(* com.kosta.service.*.*(..))")
//	private void point() {   //가져온 joinpoint가 위 패키지에서 포함되어있으면 pointcut으로 설정
//		
//	}
//		
//	@Before("point()")  //위 pointcut과 해당 advice를 연결 ...▶ 바로 pointjoin 써줘도 됨. Advice4 클래스 참고
//	public void before() {
//		System.out.println("before!!");
//	}
	
//	 //within : 클래스단위로 선언
//	@After("within(com.kosta.service.Service2)") //해당 클래스에 해당되는 메소드들의 후 처리
//	public void after() {
//		System.out.println("!~After~!");
//	}
//	
//	@AfterReturning(pointcut ="execution(* com.kosta.service.Service3.*(..))"
//					, returning = "o")
//	public void after(Object o) {
//		System.out.println("after returning..."+o);
//	}
//	
//	@AfterThrowing(pointcut = "execution(* com.kosta.service.Service3.*(..))"
//					, throwing = "ex")	
//	public void after(Throwable ex) {
//		System.out.println("after ......"+ex);
//	}
//	
}
