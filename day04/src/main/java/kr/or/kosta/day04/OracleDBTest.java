package kr.or.kosta.day04;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zaxxer.hikari.HikariDataSource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:oracledb.xml")
public class OracleDBTest { //2
//	@Autowired
//	private DriverManagerDataSource ds;
//	
//	@Test
//	public void test1() {
//		assertNotNull(ds);
//		assertEquals("hr", ds.getUsername());
//	}
	
	@Autowired
	private HikariDataSource ds;
	
	@Test
	public void test1() {
		assertNotNull(ds);
		assertEquals("hr", ds.getUsername());
	}
	
	
	
}
