package kr.or.kosta.day03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.or.kosta.sample0.BeanSet;

public class app0Test {

	public static void main(String[] args) {
		ApplicationContext ctx =new ClassPathXmlApplicationContext("app0.xml");
		BeanSet bs = ctx.getBean("ins",BeanSet.class);    //	BeanSet bs = (BeanSet) ctx.getBean("ins");
		
		System.out.println(bs);
	
	}

}
