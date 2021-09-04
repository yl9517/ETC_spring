package com.kosta.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kosta.dto.HrEmpDTO;

@Mapper
public interface HrEmpMapper {
	public List<HrEmpDTO> list();
	public List<HashMap<String, Object>> list2();
}
