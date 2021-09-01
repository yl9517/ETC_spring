package com.kosta.myapp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kosta.dao.EmpDAO;
import com.kosta.dto.EmpDTO;

@Controller
public class BoardController {
	
	@Resource(name="dao")
	private EmpDAO dao;
	
	@RequestMapping("/list")
	public String boardList(Model model ) {
		List<EmpDTO> emplist = dao.empList();
		
		model.addAttribute("list",emplist);
		return "emplist";
	}
}
