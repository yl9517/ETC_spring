package com.kosta.mapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kosta.dto.EmpDTO;

@Mapper
public interface EmpMapper {
	public List<EmpDTO> list();
	public int insertdata(EmpDTO dto);
	public int updatedata(EmpDTO dto);
	public int deletedata(int empno);
	
	public EmpDTO detaildata(int empno);
}
