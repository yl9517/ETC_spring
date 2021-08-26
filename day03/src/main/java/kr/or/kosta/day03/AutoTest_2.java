package kr.or.kosta.day03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import auto.Wire;

public class AutoTest_2 {

	public static void main(String[] args) {
		String path = "classpath:wire.xml";
		ApplicationContext ctx = new GenericXmlApplicationContext(path);
		
//		Wire b1 = ctx.getBean("byname", Wire.class);
		Wire b2 = ctx.getBean("bytype", Wire.class);
//		Wire b3 = ctx.getBean("constructor", Wire.class);

//		byname = 디폴트 이름 호출 후 연결된 '빈 이름'과 동일한 이름을 가진 set 호출  (bean 이름이 info2일시 setInfo2 메소드 호출) - 빈이름이 set
//		bytype = 디폴트 이름 호출 후 연결된 빈의 '클래스'의 set메소드의 같은 매개변수 타입 호출 - 클래스의 매개변수가 info를 가지고 있는
//		constructor = 생성자 파라미터 타입과 같은 타입을 갖는 생성자 호출
		
	}
}
