package com.kosta.myproject;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@RequestMapping("/form1")
	public String myform() {
		return "board/form";
	}
	
	@RequestMapping("/fresult")
	public String result(@RequestParam HashMap<String, Object> map,Model model) {
		
		model.addAttribute("result",map);
		return "board/result";
	}
}
