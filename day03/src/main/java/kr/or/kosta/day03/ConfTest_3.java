package kr.or.kosta.day03;

import static org.junit.Assert.assertNotNull;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import conf.BeanConf1;
import dto.MemberDTO;
import lifecycle.Doing;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BeanConf1.class}) //BeanConf1에 등록된 Bean 가져오기
public class ConfTest_3 { 
	
	@Resource  //@Resource : byName과 같음   
	private Doing d1; //BeanConf1에서 d1이란 bean을 찾아서 Doing d1에 연결
	
	@Resource(name="bean_d1") //BeanConf1의 bean_d1을 찾아서 d2와 연결
	private Doing d2;
	
	@Test
	public void t1() {
		assertNotNull(d1);
		d1.prt();
	}
	@Test
	public void t2() {
		assertNotNull(d2);
	}
	
	
	//--------------------------------
	
	@Autowired	@Qualifier("m2") //@Autowired : byType과 같음 (▶ 해당 타입으로 선언된 빈이 1개일 경우 가능) 
			      // 빈이 여러개일 경우  @Autowired  @Qualifier("빈이름") : 어떤 빈으로 주입을 할 것인지
	private MemberDTO ins;  //BeanConf1의 MemberDTO 타입과 ins 연결
	
	@Test
	public void t3() {
		assertNotNull(ins);
		System.out.println("sample : "+ins);
	}
	
	
	
}
