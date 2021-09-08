package com.kosta.board;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kosta.dto.EmpDTO;
import com.kosta.dto.MakePage;
import com.kosta.service.EmpService;

@Controller
public class EmployeeController {

	@Resource(name="empservice")
	private EmpService service;
	
	@RequestMapping("/list")
	public String list(@RequestParam(required = false, defaultValue = "1") int currPage
					, @RequestParam(required = false, defaultValue = "") String search
					, @RequestParam(required = false, defaultValue = "") String searchtxt
					, Model model) {
		
		Pattern p = Pattern.compile("(^[0-9]*$)"); //0-9까지로 이루어진 숫자만 받아줄게 ▶ 사원번호와 부서코드
		
		if(search == "employee_id" || search.equals("employee_id")
		  || search == "department_id" || search.equals("department_id")
		) {
			
			Matcher m = p.matcher(searchtxt); //p패턴에 맞으면 true / 안맞으면 false
				if(m.find()) {
				
				}
				
				else {
					searchtxt=""; //숫자가 아닌 문자열이면 예외처리 하지않고 ""로 설정됨
				}
			}
			
			int totalcount = service.totalCount(search, searchtxt); //전체 자료수
			int pagesize = 10;
			int blocksize = 5;
			MakePage page = new MakePage(currPage,totalcount,pagesize,blocksize);
			
			List<EmpDTO> emplist = service.emplist(search,searchtxt, page.getStartRow(), page.getEndRow());
			
			model.addAttribute("list",emplist);
			model.addAttribute("page",page);
			model.addAttribute("search",search);
			model.addAttribute("searchtxt",searchtxt);
			
//			Logger logger = LoggerFactory.getLogger(EmployeeController.class);
//			logger.info("list....");
//			logger.info(emplist+"");
				
		
		return "emplist";
	}
}
