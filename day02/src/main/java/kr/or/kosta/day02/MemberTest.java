package kr.or.kosta.day02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.or.kosta.dto.MemberDTO;

public class MemberTest {

	public static void main(String[] args) {
		String path ="classpath:app.xml";  //경로설정
		ApplicationContext ctx = new GenericXmlApplicationContext(path); //해당 경로의 객체(내용)받아오기
		
		MemberDTO dto = ctx.getBean("ins",MemberDTO.class);
		System.out.println(dto);
		
		MemberDTO dto2 = ctx.getBean("ins2",MemberDTO.class);
		System.out.println(dto2);
		
		//------------------------------------------------------------------------------------------------
		
		String path2 ="classpath:app2.xml";  //경로설정
		ApplicationContext ctx2 = new GenericXmlApplicationContext(path2); //해당 경로의 객체(내용)받아오기
		
		MemberDTO dto3 = ctx2.getBean("ins1",MemberDTO.class);
		System.out.println(dto3);
		
		MemberDTO dto4 = ctx2.getBean("ins2",MemberDTO.class);
		System.out.println(dto4);
		
		
	}

}
