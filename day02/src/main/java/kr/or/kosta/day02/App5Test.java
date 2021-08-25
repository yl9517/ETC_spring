package kr.or.kosta.day02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.or.kosta.Sample2.T1;

public class App5Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app5.xml");
		
		T1 ins =ctx.getBean("ins",T1.class); //st
			ins.doing();
		T1 ins2 =ctx.getBean("ins2",T1.class); //st
			ins2.doing();
		T1 ins3 =ctx.getBean("ins3",T1.class); //man
			ins3.doing();
		
	}

}
