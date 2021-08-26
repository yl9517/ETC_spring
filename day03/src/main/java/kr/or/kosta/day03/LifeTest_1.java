package kr.or.kosta.day03;

import org.springframework.context.support.GenericXmlApplicationContext;

import lifecycle.Doing;

public class LifeTest_1 {
	public static void main(String[] args) {
		
		String path="classpath:life.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		Doing d1 = ctx.getBean("l1", Doing.class);
		
		d1.prt();
		ctx.close();  //컨테이너 종료 -> destroy 호출
		
	}
}
