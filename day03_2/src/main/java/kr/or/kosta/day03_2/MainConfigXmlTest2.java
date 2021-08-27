package kr.or.kosta.day03_2;

import static org.junit.Assert.assertNotNull;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.or.kosta.data.MemberList;
import kr.or.kosta.dto.MemberDTO;
import kr.or.kosta.dto.SungjuckDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:sample1/confmain2.xml")
public class MainConfigXmlTest2 {
	@Resource
	private MemberDTO m1;
	
	@Autowired @Qualifier("m2")
	private MemberDTO m2;
	
	@Resource(name="ins")
	private MemberList members;
	
	@Autowired
	private SungjuckDTO sungjuck;
	
	@Test
	public void test1() {
		assertNotNull(m1);
		assertNotNull(m2);
		assertNotNull(members);
		assertNotNull(sungjuck);
	}

}
