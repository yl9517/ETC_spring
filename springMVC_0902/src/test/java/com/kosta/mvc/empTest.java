package com.kosta.mvc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kosta.mapper.MemberMapper;
import com.kosta.service.MemberService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src\\main\\webapp\\WEB-INF\\spring\\root-context.xml")
public class empTest {
	//db테스트
//	@Autowired
//	private SqlSessionTemplate template;
//	
//	@Test
//	public void test1() {
//		assertNotNull(template);
//	}
	
	//mapper 테스트
//	@Resource(name="memberMapper")
//	private MemberMapper mapper;
//	@Test
//	public void test2() {
//		assertNotNull(mapper);
//		assertEquals(4, mapper.getlist().get(0).getMember_no());
//	}
	
	//service 테스트
	@Resource(name="memberservice") //주입
	private MemberService service;
	
	@Test
	public void test3() {
		assertNotNull(service);
		assertEquals(4, service.memberList().get(0).getMember_no());
	}
	
	
	
}
