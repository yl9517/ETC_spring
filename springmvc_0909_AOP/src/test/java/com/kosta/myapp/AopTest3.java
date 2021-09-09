package com.kosta.myapp;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kosta.service.Service1;
import com.kosta.service.Service3;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:aop/aopapp1.xml")
@Log4j
public class AopTest3 {
	
	@Resource(name="s3")
	public Service3 service;
	
	@Test
	public void test1() {
	//	assertNotNull(service);
	//	service.write();
		service.read(new String[] {"a1","a2","a3"});
	}
}
