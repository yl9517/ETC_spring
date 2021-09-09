package com.kosta.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CommonExceptionHandler {
	
	@ExceptionHandler(RuntimeException.class)
	public String ex1() {
		return "error/exception";
	}
}
