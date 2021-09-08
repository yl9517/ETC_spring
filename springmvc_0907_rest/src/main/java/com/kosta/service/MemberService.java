package com.kosta.service;

import java.util.List;

import com.kosta.dto.MemberDTO;

public interface MemberService {

	List<MemberDTO> getMembers();

	MemberDTO getMember(int id);

	boolean insertMember(MemberDTO member);

	boolean modifyMember(MemberDTO member);

	boolean deleteMember(int id);

}
