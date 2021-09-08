package com.kosta.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kosta.dto.MemberDTO;


@Mapper
public interface EmpMapper {
	public List<MemberDTO> getMembers();
	public MemberDTO getMember(int id);
	public int insertMember(MemberDTO member);
	public int modifyMember(MemberDTO member);
	public int deleteMember(int id);
}
