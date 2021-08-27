package kr.or.kosta.day04;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.or.kosta.conf.ConnectProvider;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:confapp1.xml")
public class ConfTest { //1
	@Autowired
	private ConnectProvider pro;
	
	@Test
	public void t1() {
		assertNotNull(pro);
//		assertEquals("db", pro.getDriver());
//		assertEquals("oracle", pro.getUrl());
//		assertEquals("hr", pro.getUser());
//		assertEquals("123", pro.getPwd());
		
		
		assertEquals("db2", pro.getDriver());
		assertEquals("mysql", pro.getUrl());
		assertEquals("hello", pro.getUser());
		assertEquals("123", pro.getPwd());
	}
}
