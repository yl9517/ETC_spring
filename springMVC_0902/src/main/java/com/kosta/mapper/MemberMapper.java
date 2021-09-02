package com.kosta.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kosta.dto.MemberDTO;

@Mapper //이 자료가 mapper정보들이야. (매번 mapper연결 해주기 귀찮으니까)
public interface MemberMapper {
	public List<MemberDTO> getlist();
}
