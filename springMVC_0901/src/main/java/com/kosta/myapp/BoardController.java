package com.kosta.myapp;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kosta.dao.EmpDAO;
import com.kosta.dto.EmpDTO;

@Controller
public class BoardController {
	
	@Resource(name="dao")
	private EmpDAO dao;
	
	@RequestMapping("/list") //리스트
	public String empList(Model model ) {
		List<EmpDTO> emplist = dao.empList();
		
		model.addAttribute("list",emplist);
		return "emplist";
	}
	
	@RequestMapping("/insert") // 슬래시 붙이면 절대경로 //삽입 폼
	public String empInsert() {
		return "empinsertform";
	}
	
	@PostMapping("/insertresult")
	public String empInsertResult(EmpDTO dto) {
		int result = dao.empInsert(dto);
		
		return "redirect:/list";  //redirect 방식
	}
	
	@RequestMapping("/detail/{employee_id}")
	public String empDetail(@PathVariable int employee_id,Model model) {
		EmpDTO dto = dao.empDetail(employee_id);
		
		model.addAttribute("empdto",dto);
		return "empdetail";
	}
	
	@RequestMapping("/remove/{employee_id}")
	public String empDelete(@PathVariable int employee_id) {
		
		int result = dao.empRemove(employee_id);
		
		return "redirect:/list";
	}
	
	@RequestMapping("/modify/{employee_id}")
	public String empModify(@PathVariable int employee_id,Model model) {
		EmpDTO dto = dao.empDetail(employee_id);
		
		model.addAttribute("empdto",dto);
		
		return "modifyform";
	}
	
	@RequestMapping("modifyresult")
	public String empModifyResult(@RequestParam int employee_id
								, @RequestParam(required = false) String first_name
								, @RequestParam(required = false, defaultValue = "0") float salary
								, @RequestParam(required = false, defaultValue = "0") int department_id
								, Model model
			) {
		EmpDTO dto = new EmpDTO();
		dto.setEmployee_id(employee_id);
		dto.setFirst_name(first_name);
		dto.setSalary(salary);
		dto.setDepartment_id(department_id);
		
		int result = dao.empModify(dto);
		model.addAttribute("result",result);
		model.addAttribute("employee_id",employee_id);
		
		return "modifyresult";
	}
}
