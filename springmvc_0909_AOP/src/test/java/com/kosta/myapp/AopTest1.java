package com.kosta.myapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kosta.target.Target1;
import com.kosta.target.Target2;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:aop/aopapp1.xml")
@Log4j
public class AopTest1 {
	@Autowired
	private Target1 ins;
	
	@Autowired
	private Target2 ins2;
	
	@Test
	public void t1() {
		ins.target1_prt1();
		ins.target1_prt2();
		
		log.info("==============");
		
		ins2.target2_prt1();
		ins2.target2_prt2();
	}
	
	
}
