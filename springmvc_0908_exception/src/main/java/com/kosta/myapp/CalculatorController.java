package com.kosta.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kosta.exception.CommonExceptionHandler;

@Controller
public class CalculatorController {
	
	@GetMapping("/cal")
	public String form() {
		return "cal";
	}
	
	@PostMapping("/result")
	public String result(@RequestParam int su1, @RequestParam int su2,Model model) {
		
		model.addAttribute("result",su1/su2);
		
		return "result";
	}
}
