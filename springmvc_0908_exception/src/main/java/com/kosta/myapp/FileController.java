package com.kosta.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.kosta.exception.NoFileException;

@Controller
public class FileController {
	
	@GetMapping("file/{f}")
	public String f1(@PathVariable String f,Model model) throws NoFileException{
		if(f.equals("aaa"))
			throw new NoFileException();
		
		model.addAttribute("filename",f);
		return "filetest";
	}
}
