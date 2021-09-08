package com.kosta.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kosta.dto.MemberDTO;
import com.kosta.service.MemberService;
/*

 * @Controller를 사용할 경우 @ResponseBody와 같이 사용하도록!!
 * @RestController는 그 자체로 사용 가능
	
	@ResponseBody : 응답해서 보여줄 것
	@RequestBody : 내가 요청받은 것

 */
//@RestController
@Controller
public class MemberController {
	
	@Resource(name="memberservice")
	private MemberService service;
	
	@GetMapping("/members")
	public @ResponseBody Map<String, Object> getMembers() {
		
		List<MemberDTO> list = service.getMembers();
		HashMap<String, Object> result = new HashMap<String, Object>();
		
		result.put("emplist", list);
		result.put("size", list.size());
		result.put("result", true);
		
		return result;
	}
	
	@GetMapping("/member/{id}")
	public @ResponseBody MemberDTO getMember(@PathVariable int id) {
		MemberDTO dto = service.getMember(id);
		
		return dto;
	}
	
	//@RequestMapping(value="/member",method = RequestMethod.POST)
	@PostMapping("/member")
	public @ResponseBody Map<String,Object> insertMember(@RequestBody MemberDTO member) {
		boolean result = false;
		if(member!=null)
			result=service.insertMember(member);
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("result", result);
		return map;
	}
	//@RequestMapping(value="/member",method = RequestMethod.PUT)
	@PutMapping("/member")
	public @ResponseBody Map<String,Object> updateMember(@RequestBody MemberDTO member) {
		boolean result = false;
		
		if(member!=null)
			result=service.modifyMember(member);
		
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("result", result);
		return map;
	}
	
	@DeleteMapping("/member/{id}")
	@ResponseBody
	public Map<String, Object> deleteMember(@PathVariable int id) {
		boolean r = service.deleteMember(id);
		
		Map<String,Object> result = new HashMap<String, Object>();
		result.put("result", r);
		
		return result;
	}
	
	
}
