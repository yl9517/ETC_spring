package kr.or.kosta.day01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.or.kosta.dto.Man;
import kr.or.kosta.dto.Person;

public class CompXmlTest {
	public static void main(String[] args) {
		
		String path="classpath:app1.xml";
		
		ApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		Person p1 = ctx.getBean("person",Person.class);
		Man man = ctx.getBean("m1", Man.class);
		
		System.out.println(p1);
		System.out.println(man);
	}
	
}
