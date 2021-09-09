package com.kosta.myapp;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kosta.service.Service1;
import com.kosta.service.Service2;
import com.kosta.service.Service3;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:aop/aopapp2.xml")
@Log4j
public class AopTest4 {
	
//	@Autowired @Qualifier(value="s1")
//	private Service1 service;
//	
//	@Test
//	public void test() {
//		service.view();
//	}
//	
//	@Resource(name = "s2")
//	private Service2 ins2;
//	
//	@Test
//	public void test2() {
//		ins2.read();
//	}
//	
	@Resource(name="s3")
	private Service3 ins3;
	
	@Test
	public void test3() {
		ins3.read(new String[] {"a1","a2","a3","a4"});
	//	ins3.read(new String[] {"a1","a2"});
	}
	
	
}
