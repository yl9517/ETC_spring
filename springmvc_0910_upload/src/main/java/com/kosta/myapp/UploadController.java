package com.kosta.myapp;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.kosta.vo.FileVo;

@Controller
public class UploadController {
	private String path = "WEB-INF/temp";
	
	@RequestMapping("/form")
	public String form() {
		return "form";
	}
	
	@RequestMapping("/result")
	public String result(HttpServletRequest request, FileVo vo, Model model) {
		MultipartFile multi = vo.getFile1();
			
		String uploadpath = request.getSession().getServletContext().getRealPath(path);
		try {
			if(!multi.isEmpty()) {
				File file = new File(uploadpath, multi.getOriginalFilename());
				multi.transferTo(file);
				
				model.addAttribute("title",vo.getFilename());
				model.addAttribute("filename", vo.getFile1().getOriginalFilename());
				model.addAttribute("uploadpath",uploadpath);
			}
		}catch (Exception e) {
			System.out.println(e);
		}
			return "formlist";
		
	}
}
