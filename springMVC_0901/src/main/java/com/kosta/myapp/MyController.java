package com.kosta.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/res1")
	public String h1() {
		return "redirect:/re2/hong/23";  //redirect 방식  -> 해당 메소드
	}
	
	@RequestMapping("/re2/{name}/{age}")   // 중괄호를 이용해서 매개변수 받음
	public String h2(@PathVariable String name,@PathVariable int age, Model model) {   //@PathVariable : 변수
		model.addAttribute("name",name);
		model.addAttribute("age",age);
		
		return "board/re2";
	}
	
}
