package kr.or.kosta.dao;
import java.util.List;

import kr.or.kosta.dto.empDTO;

public interface empDAO {
	public List<empDTO> getEmpList();
	public empDTO getDataByNum(int empid);//사원 번호로 검색
	public List<empDTO> getListBydno(int dno); //부서코드별로 검색
	
	public int insertData(empDTO dto); //삽입
	
	public int updateData(empDTO dto); //추가
}
