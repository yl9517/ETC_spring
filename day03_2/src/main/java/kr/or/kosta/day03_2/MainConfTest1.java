package kr.or.kosta.day03_2;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.or.kosta.conf.MainConf;
import kr.or.kosta.data.MemberList;
import kr.or.kosta.dto.MemberDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MainConf.class})
public class MainConfTest1 {
	
	
	//resource 혹은 autowired는 Qulifier 포함해서 주입
	@Autowired @Qualifier("m1")
	private MemberDTO ins;
	
	@Resource
	private MemberDTO dto;
	
	@Resource(name="m2")
	private MemberDTO dto2;
	
	@Autowired
	private List<MemberDTO> item;
	
	@Autowired
	private MemberList members;
	
	@Test
	public void test1() {
		assertNotNull(ins);  // 주입 확인
		assertNotNull(dto);
		assertNotNull(dto2);
		assertNotNull(item);
		assertNotNull(members);
	}
	
	
}
