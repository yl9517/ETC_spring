package com.kostsa.myapp;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController2 {
	
	@RequestMapping("/myform")
	public String form() {
		return "form";
	}
	
//	@RequestMapping("result")
//	public String result(HttpServletRequest request, Model model) throws UnsupportedEncodingException {
//		//인코딩필터 -> main-webapp-web.xml에서 작성
//		String name = request.getParameter("name");
//		int age = Integer.parseInt(request.getParameter("age"));
//		
//		model.addAttribute("name",name);
//		model.addAttribute("age",age);
//		return "result";
//	}
	
	
	/*
	 *	@RequestParam : 단일 http 요청 파라미터를 메서드 파라미터에 넣어주는 어노테이션
	 *	(@RequestParam String id, RequestParam("pwd") String password)
	 * 
	 */
	@RequestMapping("/result")
	public String result2(@RequestParam String name,@RequestParam int age,Model model) {
		
		model.addAttribute("name",name);
		model.addAttribute("age",age);
		return "result";
	}
	
	
}
