package com.kosta.dao;

import java.util.List;

import com.kosta.dto.EmpDTO;

public interface EmpDAO {  //결합도를 낮추기 위해 인터페이스로생성

	public List<EmpDTO> empList();
	public int empInsert(EmpDTO dto);
	public EmpDTO empDetail(int employee_id);
	public int empRemove(int employee_id);
	public int empModify(EmpDTO dto);
}
