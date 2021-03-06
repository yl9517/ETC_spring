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

import com.kosta.dto.MemberDTO;
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
	
//	@Test
//	public void test3() {
//		assertNotNull(service);
//		assertEquals(4, service.memberList().get(0).getMember_no());
//	}
	
	//키값 insert 테스트
//	@Test
//	public void test4() {
//		MemberDTO dto = new MemberDTO();
//		dto.setMember_id("hello15");
//		dto.setMember_name("이1아름");
//		dto.setMember_age(132);
//		dto.setMember_addr("서울");
//		service.insertmember(dto);
//		
//		assertEquals(32,dto.getMember_no());
//	}
	
	//delete 테스트
//	@Test
//	public void test5() {
//		int result =service.memberdelete(36);
//		assertEquals(1, result);
//	}
	
	//detail 테스트
//	@Test
//	public void test6() {
//		assertEquals(132, service.memberDetail(23).getMember_age());
//	}
	
	//update 텟트ㅡ
	@Test
	public void test7() {
		MemberDTO dto = service.memberDetail(32);
		dto.setMember_id("myid");
		dto.setMember_name("유르스윌리스");
		dto.setMember_age(50);
		dto.setMember_addr("제주");
		service.memberModify(dto);
		assertEquals(50, service.memberDetail(32).getMember_age());
	}
}
