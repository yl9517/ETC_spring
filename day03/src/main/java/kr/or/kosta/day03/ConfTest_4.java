package kr.or.kosta.day03;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import conf.BeanConf1;
import dto.MemberDTO;
import lifecycle.Doing;

@RunWith(SpringJUnit4ClassRunner.class) //test
@ContextConfiguration(classes= {BeanConf1.class})
public class ConfTest_4 { //four 패키지에 있는 component까지 가져와서 테스트
	
	@Resource(name="bean_d1")  //byName
	private Doing d1;
	
	@Autowired @Qualifier("m2")  //byType
	private MemberDTO dto;
	
	@Test
	public void test1() {
		assertNotNull(d1); //null이 아닌지 확인
	}
	@Test
	public void test2() {
		assertNotNull(dto); //[확인방법1] null이 아닌지 확인
		assertEquals("hong", dto.getName());  //[확인방법2] dto의 name이 "hong"과 같은지
		assertEquals(10,dto.getAge()); //Junit에서 에러남
	}

}
