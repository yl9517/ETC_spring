package com.kosta.myapp;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kosta.mapper.EmpMapper;
import com.zaxxer.hikari.HikariDataSource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src\\main\\webapp\\WEB-INF\\spring\\root-context.xml")
public class DBTest {
	
	@Autowired
	private HikariDataSource ds;
	
	@Autowired
	private EmpMapper mapper;
	
	@Test
	public void test1() {
		assertNotNull(ds);
		assertNotNull(mapper);
	}
}
