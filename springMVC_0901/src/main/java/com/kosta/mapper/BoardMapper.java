package com.kosta.mapper;

import java.util.List;

import com.kosta.dto.EmpDTO;

public interface BoardMapper {
	public List<EmpDTO> elist();
	public int empinsert(EmpDTO dto);
	public EmpDTO empDetail(int employee_id);
	public int empRemove(int employee_id);
	public int empModify(EmpDTO dto);
}
