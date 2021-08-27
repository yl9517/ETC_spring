package kr.or.kosta.day04;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zaxxer.hikari.HikariDataSource;

import kr.or.kosta.dbconf.OracleConf;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {OracleConf.class})
public class OracleConfigTest { //3
	@Autowired
	private HikariDataSource ds;
	
	@Test
	public void test1() {
		assertNotNull(ds);
		assertEquals("hr", ds.getUsername());
	}
}
