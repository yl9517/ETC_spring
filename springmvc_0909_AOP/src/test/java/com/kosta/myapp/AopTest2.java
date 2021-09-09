package com.kosta.myapp;

import java.io.IOException;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kosta.service.Service1;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:aop/aopapp1.xml")
@Log4j
public class AopTest2 {
	
	@Resource(name="s1")
	public Service1 ins;
	
	@Test
	public void test1() {
	//	ins.prt();
	//	ins.view();
	
			try {
				ins.show(-10);
			} catch (IOException e) {
				System.out.println("test......"+e);
			}

	}
}
