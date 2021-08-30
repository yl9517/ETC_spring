package kr.or.kosta.day05_mybatis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import kr.or.kosta.dao.empDAO;
import kr.or.kosta.dto.empDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:mybatis.xml")
public class empTest {
	@Autowired
	private SqlSessionTemplate template;
	
//	@Resource(name="sqlsessionFactory")
//	private SqlSessionFactory factory;
//	
//	@Test
//	public void test1() {
//		assertNotNull(template);	
//		assertNotNull(factory);	
//	}
	
	@Test
	public void test2() {
		empDAO dao = template.getMapper(empDAO.class);
		
		List<empDTO> list = dao.getEmpList();
		assertEquals(100, list.get(0).getEmpid());
		assertEquals(107, list.size());
		
	}
	
	@Test
	public void test3() {
		empDAO dao = template.getMapper(empDAO.class);
		
		assertEquals("Steven", dao.getDataByNum(100).getName());
	}
	
	@Test
	public void test6() {
		empDAO dao = template.getMapper(empDAO.class);
		List<empDTO> list = dao.getListBydno(110);
		
		assertEquals(2, list.size());
	}
	
	@Test
	public void test7() {
		empDAO dao = template.getMapper(empDAO.class);
		empDTO dto = new empDTO();
		dto.setEmpid(1);
		dto.setName("summer");
		dto.setSal(3500);
		dto.setDno(90);
		
		int result = dao.insertData(dto);
		assertEquals(1, result);
	}
	
	@Test
	public void test8() {

		empDAO dao = template.getMapper(empDAO.class);
		empDTO dto = new empDTO();
		dto.setEmpid(1);
		dto.setName("kangg");
		dto.setSal(500);
		dto.setDno(100);
		
		
		int result = dao.updateData(dto);
		assertEquals(1, result);
	}
	
}
