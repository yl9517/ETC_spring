package com.kosta.service;

import java.util.List;

import com.kosta.dto.MemberDTO;

public interface MemberService {
	public List<MemberDTO> memberList();

	public int insertmember(MemberDTO dto);

	public int memberdelete(int no);

	public MemberDTO memberDetail(int no);

	public int memberModify(MemberDTO dto);
}
