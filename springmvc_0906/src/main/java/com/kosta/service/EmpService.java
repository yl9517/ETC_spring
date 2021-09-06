package com.kosta.service;

import java.util.List;

import com.kosta.dto.EmpDTO;

public interface EmpService {
	
	public int totalCount(String search, String searchtxt);
	public List<EmpDTO> emplist(String search, String searchtxt, int i, int j);

}
