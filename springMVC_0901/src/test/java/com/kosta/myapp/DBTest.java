package com.kosta.myapp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src\\main\\webapp\\WEB-INF\\spring\\root-context.xml")
public class DBTest {
	
//	@Autowired @Qualifier("dbconf")
//	private HikariConfig conf;
//
//	@Test
//	public void test1() {
//		assertNotNull(conf);
//		assertEquals("hr",conf.getUsername());
//	}
//	@Resource(name="ds")
//	private HikariDataSource ds;
	
	@Resource(name="sqlsession")
	private SqlSessionTemplate template;
	
	@Test
	public void test2() {
		assertNotNull(template);
	}
	
}
