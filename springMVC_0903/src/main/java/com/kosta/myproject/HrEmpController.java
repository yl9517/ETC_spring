package com.kosta.myproject;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@RequestMapping("/list2")
	public String list2(Model model) {
		List<HashMap<String, Object>> list = service.list2();
		
		model.addAttribute("list",list);
		return("list2");
	}
	
	@RequestMapping("/insertform2")
	public String insertdata() {
		return "insertform";
	}
	
	@RequestMapping("/insertresult2")
	public String insertdata(@RequestParam HashMap<String, Object> hm) {
		service.insertEmp(hm);
		
		return "redirect:/list2";
	}
	
	@RequestMapping("/detail/{id}")
	public String detaildata(@PathVariable int id,Model model) {
		HashMap<String, Object> hm = service.detailEmp(id);
		model.addAttribute("data",hm);
		
		return "detail";
		
	}
}
