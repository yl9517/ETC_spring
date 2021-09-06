package com.kosta.board;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kosta.config.BoardConfig;
import com.kosta.config.DBConfig;
import com.kosta.service.EmpService;
import com.zaxxer.hikari.HikariDataSource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DBConfig.class, BoardConfig.class})
public class DBTest {
	@Resource(name="oracledb")
	private HikariDataSource ds;
	@Resource(name="sqlsession")
	private SqlSessionFactory factory;
	
	@Test
	public void test1() {
		assertNotNull(ds);
		assertNotNull(factory);
	}
	
	@Autowired
	private EmpService service;
	
	@Test
	public void test2() {
		int count = service.totalCount("employee_id", "100");
		assertEquals(1, count);
		assertEquals(6, service.totalCount("department_id", "100"));
		assertEquals(10, service.totalCount("first_name", "a"));
	}
}
