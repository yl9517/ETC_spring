package kr.or.kosta.day01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.or.kosta.dto.MemberDTO;

public class MemberTest {

	public static void main(String[] args) {
		String path = "classpath:app.xml";
		
		ApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		//만들어놓은 객체를 갖다 쓰는것 (싱글톤)
		MemberDTO dto1 = ctx.getBean("ins", MemberDTO.class);
		MemberDTO dto2 = ctx.getBean("ins2", MemberDTO.class);
		MemberDTO dto3 = ctx.getBean("ins",MemberDTO.class);
		
		System.out.println(dto1);
		System.out.println(dto2);
		System.out.println(dto1==dto3);
	
	
	}
	
}