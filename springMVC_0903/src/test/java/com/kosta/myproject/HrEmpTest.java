package com.kosta.myproject;

import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Iterator;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kosta.service.HrEmpService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src\\main\\webapp\\WEB-INF\\spring\\root-context.xml")
public class HrEmpTest {
	
	@Resource(name="hrEmpServiceImple")
	private HrEmpService service;
	
	@Test
	public void test() {
		assertNotNull(service);
	}

	@Test
	public void test2() {
		HashMap<String, Object> hm = service.list2().get(0);
		
		Iterator<String> ita = hm.keySet().iterator();
		while(ita.hasNext()) {
			String key = ita.next();
			System.out.println(key);
		}
	}
	
	//디테일 테스트
	Logger logger = LoggerFactory.getLogger(HrEmpTest.class);
	@Test
	public void test3() {
		HashMap<String, Object> hm = service.detailEmp(100);
		
		logger.info("employee_id"+hm.get("EMPLOYEE_ID"));
		logger.info("FIRST_NAME"+hm.get("FIRST_NAME"));
		logger.info("HIRE_DATE"+hm.get("HIRE_DATE"));
		logger.info("DEPARTMENT_NAME"+hm.get("DEPARTMENT_NAME"));
		
		
	}
}
