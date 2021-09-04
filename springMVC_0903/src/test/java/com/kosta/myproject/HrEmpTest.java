package com.kosta.myproject;

import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Iterator;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
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
}
