package com.kosta.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kosta.dto.PersonDTO;

@Controller
public class FormController {
	
	@GetMapping("/form")
	public String form() {	
		return "form";
	}
	
	@PostMapping("/result")
	public String result(@ModelAttribute("member") PersonDTO dto) {
		return "result";
	}

}
