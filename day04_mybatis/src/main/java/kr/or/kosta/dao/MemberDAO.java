package kr.or.kosta.dao;

import java.util.List;

import kr.or.kosta.dto.MemberDTO;

public interface MemberDAO {
	public MemberDTO memberData(String name);
	public List<MemberDTO> getMembers();	 //전체 member
	public List<MemberDTO> memberAge(int nai); //age로 검색하는 내용 작성
	public int insertMember(MemberDTO dto);
	public int updateMember(int age); //모든 나이 자료 변경
	//파라미터 하나밖에 못받음
	public int updateMember2(MemberDTO dto); //그러므로 dto로 받기
	public int deleteMember(String irum); //삭제
}
