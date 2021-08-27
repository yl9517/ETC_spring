package kr.or.kosta.day04_mybatis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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
	
	@Test
	public void test2() {
		MemberDAO dao = sqlsession.getMapper(MemberDAO.class);
		
		MemberDTO dto = dao.MemberData("park");
		assertEquals("park",dto.getName());
		assertEquals(15, dto.getAge());
	}
	
	
}
