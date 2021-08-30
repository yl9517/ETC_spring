package kr.or.kosta.day04_mybatis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zaxxer.hikari.HikariDataSource;

import kr.or.kosta.dao.MemberDAO;
import kr.or.kosta.dto.MemberDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:mybatis.xml")
public class MybatisTest {
//	@Autowired
//	private HikariDataSource ds;
	
//	@Autowired
//	private SqlSessionFactoryBean factory;
	
	@Autowired
	private SqlSessionTemplate sqlsession;
	
	@Test
	public void test1() {
	//	assertNotNull(ds);
	//	assertNotNull(factory);
		assertNotNull(sqlsession);	
	}
	
//	@Test
//	public void test2() {
//		MemberDAO dao = sqlsession.getMapper(MemberDAO.class);
//		
//		MemberDTO dto = dao.memberData("park");
//		assertEquals("park",dto.getName());
//		assertEquals(15, dto.getAge());
//	}
	
	@Test
	public void test3() {
		MemberDAO dao = sqlsession.getMapper(MemberDAO.class);
		List<MemberDTO> list = dao.getMembers();
		
		assertEquals(4, list.size());
		assertEquals("park", list.get(0).getName());
	}
	
	//나이가 20인 회원의 자료로 test
	@Test
	public void test4() {
		MemberDAO dao = sqlsession.getMapper(MemberDAO.class);
		
		List<MemberDTO> list = dao.memberAge(20);
		
		assertEquals(20, list.get(0).getAge());
		assertEquals(3, list.size());
		assertEquals("kang", list.get(1).getName());
	}
	
	
//	@Test
//	public void test5() {
//		MemberDAO dao =sqlsession.getMapper(MemberDAO.class);
//		MemberDTO dto = new MemberDTO();
//		
//		dto.setName("ha");
//		dto.setAge(5);
//		
//		int result = dao.insertMember(dto);
//		
//		assertEquals(1, result);
//	}
	
	@Test
	public void test6() {
		MemberDAO dao = sqlsession.getMapper(MemberDAO.class);
		dao.updateMember(10);
		
	}
	
	@Test
	public void test7() {
		MemberDAO dao = sqlsession.getMapper(MemberDAO.class);
		MemberDTO dto =new MemberDTO();
		dto.setName("kang");
		dto.setAge(13);
		
		dao.updateMember2(dto);	
	}
	
	@Test
	public void test8() {
		MemberDAO dao = sqlsession.getMapper(MemberDAO.class);
		
		int result = dao.deleteMember("ha");
		assertEquals(0, result);
	}
	
}
