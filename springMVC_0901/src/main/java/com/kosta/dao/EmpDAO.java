package com.kosta.dao;

import java.util.List;

import com.kosta.dto.EmpDTO;

public interface EmpDAO {  //결합도를 낮추기 위해 인터페이스로생성

	public List<EmpDTO> empList();
}
