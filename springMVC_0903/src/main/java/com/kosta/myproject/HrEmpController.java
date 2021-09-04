package com.kosta.myproject;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kosta.dto.HrEmpDTO;
import com.kosta.service.HrEmpService;

@Controller
public class HrEmpController {

	@Resource(name="hrEmpServiceImple")
	private HrEmpService service;
	
	@RequestMapping("/list")
	public String list(Model model) {
		List<HrEmpDTO> list = service.list();
		model.addAttribute("list",list);
		return "list";
	}
}
