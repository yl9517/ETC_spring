package com.kosta.myapp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.kosta.config.DBConfig;
import com.kosta.config.EmpConfig;
import com.kosta.dto.EmpDTO;
import com.kosta.mapper.EmpMapper;
import com.kosta.service.EmpService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {EmpConfig.class, DBConfig.class})
//@ContextConfiguration("file:src\\main\\webapp\\WEB-INF\\spring\\root-context.xml")

// @Transactional // 동작처리 확인 하기 위한 ''test'이므로 test어노테이션이 있는 경우에만  => 동작 확인후 자동으로 롤백함. 실제 데이터 반영X
// 서비스 테스트는 서비스 메소드에 트랜잭션이 있으므로 여기서는 생략
public class ServiceTest {

//	@Autowired
//	private EmpMapper mapper;
	
//	@Test
//	public void test1() {
//		EmpDTO dto = new EmpDTO(2, "hong gil dong22", 1500);	
//		assertEquals(1,mapper.insertdata(dto));
//		
//		EmpDTO dto = new EmpDTO(3, "이하나", 5500.0f);	
//		assertEquals(1,mapper.insertdata(dto));
//	}
	
	@Resource(name="empservice")
	private EmpService service;
	
	@Test
	public void test2() {
		service.doing();
	}
	
}
