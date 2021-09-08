package com.kosta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kosta.dto.MemberDTO;
import com.kosta.mapper.EmpMapper;

@Service("memberservice")
public class MemberServiceImple implements MemberService{

	@Autowired
	private EmpMapper mapper;
	
	@Override
	public List<MemberDTO> getMembers() {
		
		return mapper.getMembers();
	}

	@Override
	public MemberDTO getMember(int id) {
		return mapper.getMember(id);
	}

	@Override
	public boolean insertMember(MemberDTO member) {
		int result = mapper.insertMember(member);
		boolean boo = false;

		if(result >= 1) 
			boo = true;
		
		return boo;
	}

	@Override
	public boolean modifyMember(MemberDTO member) {
		int result = mapper.modifyMember(member);
		boolean boo = false;

		if(result >= 1) 
			boo = true;
		
		return boo;
	}

	@Override
	public boolean deleteMember(int id) {
		int result = mapper.deleteMember(id);
		boolean boo = false;

		if(result >= 1) 
			boo = true;
		
		return boo;
	}

}
