package com.kosta.mvc;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kosta.dto.MemberDTO;
import com.kosta.service.MemberService;

@Controller
public class MemberController {
	
	@Resource(name="memberservice")
	private MemberService service;
	
	@RequestMapping("/memberlist")
	public String list(Model model) {
		List<MemberDTO> list = service.memberList();
		model.addAttribute("list",list);
		return "member/memberlist";
	}
	
	@RequestMapping("/memberinsert")
	public String memberinsertform() {
		
		return "member/memberinsertform";
	}
	
}
