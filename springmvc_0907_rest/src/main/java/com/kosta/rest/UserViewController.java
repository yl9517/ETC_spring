package com.kosta.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserViewController {
	@RequestMapping("/jsonparse")
	public String view() {
		return "json/jsonlist";
	}
}
