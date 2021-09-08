package com.kosta.rest;

import static org.junit.Assert.assertNotNull;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kosta.config.BoardConfig;
import com.kosta.config.DBConfig;
import com.zaxxer.hikari.HikariDataSource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DBConfig.class})
public class DBTest {
	
	@Autowired   //@Resource(name="oracledb")
	private HikariDataSource ds;
	@Autowired
	private SqlSessionFactory factory;
	
	@Test
	public void test1() {
		assertNotNull(ds);
		assertNotNull(factory);
	}
}
