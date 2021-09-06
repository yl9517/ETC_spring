package com.kosta.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kosta.dto.HrEmpDTO;
import com.kosta.mapper.HrEmpMapper;

@Service
public class HrEmpServiceImple implements HrEmpService {

	@Autowired
	private HrEmpMapper mapper;
	
	@Override
	public List<HrEmpDTO> list() {
		return mapper.list();
	}

	@Override
	public List<HashMap<String, Object>> list2() {
		// TODO Auto-generated method stub
		return mapper.list2();
	}

	@Override
	public void insertEmp(HashMap<String, Object> hm) {
		mapper.insertEmp(hm);
	}

	@Override
	public HashMap<String, Object> detailEmp(int id) {
		return mapper.detailEmp(id);
		
	}

}
