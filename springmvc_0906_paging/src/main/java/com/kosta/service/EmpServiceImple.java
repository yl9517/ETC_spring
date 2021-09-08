package com.kosta.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kosta.dto.EmpDTO;
import com.kosta.mapper.BoardMapper;

@Service(value="empservice")
public class EmpServiceImple implements EmpService {

	@Autowired
	private BoardMapper mapper;
	

	@Override
	public int totalCount(String search, String searchtxt) {
		 // mapper에서 매개변수 여러개를 한번에 못보내므로 dto 만들필요 없이 HashMap로 넘겨주기
		HashMap<String, Object> hm = new HashMap<String, Object>();
		hm.put("search",search);
		hm.put("searchtxt",searchtxt);
		
		int result = mapper.totalCount(hm);
		return result;
	}

	@Override
	public List<EmpDTO> emplist(String search, String searchtxt, int startRow, int endRow) {
		HashMap<String, Object> hm = new HashMap<String, Object>();
		hm.put("search",search);
		hm.put("searchtxt",searchtxt);
		hm.put("startrow",startRow);
		hm.put("endrow",endRow);
		
		return mapper.list(hm);
	}

}
