package com.kosta.rest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kosta.config.BoardConfig;
import com.kosta.config.DBConfig;
import com.kosta.dto.MemberDTO;
import com.kosta.service.MemberService;
import com.kosta.service.MemberServiceImple;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = {BoardConfig.class,DBConfig.class})
@ContextConfiguration("file:src\\main\\webapp\\WEB-INF\\spring\\root-context.xml")  //xml이 config패키지를 담고있으므로
public class BussinessTest {

	@Autowired
	private MemberService service;
	
//	@Test
//	public void test1() {
//		assertNotNull(service.getMembers());
//		assertEquals(101, service.getMembers().get(0).getEmployee_id());
//	}
//	
//	@Test
//	public void test2() {
//	
//		assertEquals("Matthew",service.getMember(120).getFirst_name());
//	}
//	
//	@Test
//	public void test3() {
//		MemberDTO member = new MemberDTO(0,"hong", "2021-09-08", 4500, 100);
//		assertEquals(true, service.insertMember(member));
//	}
//	
//	@Test
//	public void test4() {
//
//		MemberDTO member = new MemberDTO(101,"리려름", "2021-01-01", 5000, 123);
//		assertEquals(true, service.modifyMember(member));
//	}
	
	@Test
	public void test5() {
		assertEquals(true,service.deleteMember(41));
	}
	
	
}
