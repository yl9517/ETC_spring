package kr.or.kosta.day02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.or.kosta.dto2.Person;

public class PersonTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app3.xml"); //해당 클래스 경로 받아옴
		
		Person p1 = ctx.getBean("person",Person.class);
		System.out.println(p1);
		
		
	}

}
