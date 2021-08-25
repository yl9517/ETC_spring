package kr.or.kosta.day02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.or.kosta.Sample1.Member1;

public class Member1Test {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app4.xml");
		Member1 ins = ctx.getBean("m1",Member1.class);
//		ins.prt1(); 
		//list 출력
		ins.prt2(); //모두 출력
		System.out.println("--------------");
		
		
		Member1 ins2 = ctx.getBean("m2",Member1.class);
//		ins2.prt1(); //list 출력
		ins2.prt2(); //모두 출력
		System.out.println("--------------");
		
		Member1 ins3 = ctx.getBean("m3",Member1.class);
		ins3.prt1(); //list 출력
//		ins3.prt2(); //모두 출력
		System.out.println("--------------");
		
	}
}
