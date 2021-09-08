package com.kosta.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kosta.dto.UserDTO;

@RestController   //restController
public class UserController {

	@RequestMapping(value="/member", method = RequestMethod.GET
					, headers = {"accept=application/json"} )
	@ResponseBody
	public UserDTO getUser() {
		UserDTO dto = new UserDTO();
		dto.setEmployee_id(100);
		dto.setFirst_name("hong gil dong");
		dto.setSalary(10.2f);
		
		return dto;
	}
	
	@RequestMapping(value="/jsonview", method = RequestMethod.GET)
	@ResponseBody
	public List<UserDTO> listjson(){
		List<UserDTO> list = new ArrayList<UserDTO>();
		list.add(new UserDTO(10,"홍길동","2021-01-07",100));
		list.add(new UserDTO(11,"박영훈","2021-02-05",200));
		list.add(new UserDTO(12,"홍길순","2021-03-27",300));
		list.add(new UserDTO(13,"김하나","2021-05-17",400));
		return list;
	}
	
	@GetMapping("/getname")
	public String getName() {
		return "hong gil dong";
	}
	
	@GetMapping("/sample/{name}/{age}")
	public String getSample(@PathVariable("name") String irum,
							@PathVariable("age") int nai) {
		return "name:"+irum+" age :"+nai;
	}
	
	
}
