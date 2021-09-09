package com.kosta.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CommonExceptionHandler2 {
	
	//NoFileException 클래스가 발생되면 해당 메소드 실행
//	@ExceptionHandler(NoFileException.class)
//	public String h2() {
//		return "error/custom";
//	}
	
	//위 처럼 말고 경로를 잘못입력하기만 하면 exception발생하게 하고 싶음
	@ExceptionHandler(Exception.class)   //NoFileException도 exception을 상속받은 클래스 이므로..
	public String h3() {
		return "error/custom";
	}
	
}
