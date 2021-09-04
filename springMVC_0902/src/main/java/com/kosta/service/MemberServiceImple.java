package com.kosta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.kosta.dto.MemberDTO;
import com.kosta.mapper.MemberMapper;

@Service("memberservice") //안정해주면 클래스명 (맨앞 소문자)
public class MemberServiceImple implements MemberService {

	//mapper 한번에 가져오기 (주입)
	@Autowired @Qualifier("memberMapper")
	private MemberMapper mapper;
	
	@Override
	public List<MemberDTO> memberList() {
		return mapper.getlist();
	}

	@Override
	public int insertmember(MemberDTO dto) {
		return mapper.insertmember(dto);
	}

	@Override
	public int memberdelete(int no) {
		int result = mapper.deletemember(no);
		return result;
	}

	@Override
	public MemberDTO memberDetail(int no) {
		
		return mapper.memberdetail(no);
	}

	@Override
	public int memberModify(MemberDTO dto) {
		return mapper.memberModify(dto);
	}

}
