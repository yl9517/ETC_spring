package com.kosta.service;

import java.util.HashMap;
import java.util.List;

import com.kosta.dto.HrEmpDTO;

public interface HrEmpService {
 
	public List<HrEmpDTO> list();
	public List<HashMap<String, Object>> list2();
}
