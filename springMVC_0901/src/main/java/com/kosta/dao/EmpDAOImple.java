package com.kosta.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kosta.dto.EmpDTO;
import com.kosta.mapper.BoardMapper;

@Repository("dao") //DB연결객체
public class EmpDAOImple implements EmpDAO {

	@Resource(name="sqlsession")
	private SqlSessionTemplate session;
	
	@Override
	public List<EmpDTO> empList() {
		
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		List<EmpDTO> list  = mapper.elist();
		
		return list;
	}

	@Override
	public int empInsert(EmpDTO dto) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		
		return mapper.empinsert(dto);
		
	}

	@Override
	public EmpDTO empDetail(int employee_id) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		EmpDTO dto = mapper.empDetail(employee_id);
		return dto;
	}

	@Override
	public int empRemove(int employee_id) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		int result = mapper.empRemove(employee_id);
		
		return result;
	}

	@Override
	public int empModify(EmpDTO dto) {
		
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		int result = mapper.empModify(dto);
		return result;
	}

}
