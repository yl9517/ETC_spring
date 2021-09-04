package com.kosta.mvc;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	
	@GetMapping("/memberinsertresult")
	public String memberins2(MemberDTO dto) {
		int result = service.insertmember(dto);
		System.out.println(result);
		return "redirect:/memberlist";
	}
	
//	@PostMapping("/memberinsertresult")
//	public String memberinsertresult() {
//		
//		
//		return "member/memberinsertresult";
//	}
	
	@GetMapping("/memberdelete/{no}")
	public String memberdel(@PathVariable int no,Model model) {
		
		int result = service.memberdelete(no);
		model.addAttribute("result",result);
		
		return "member/memberdelete";
	}
	
	@GetMapping("/membermodify/{member_no}")
	public String modifyMemberfrom(@PathVariable(name = "member_no") int no,Model model) { //경로변수와 맞춰주기
		System.out.println("no......."+no);
		
		MemberDTO dto = service.memberDetail(no);
		
		model.addAttribute("dto", dto);
		return "member/membermodifyform";
	}
	
	@PostMapping("/membermodifyresult")
	public String modifyMemberResult(MemberDTO dto) {
		int result = service.memberModify(dto);
		return "redirect:/memberlist";
	}
	
}
