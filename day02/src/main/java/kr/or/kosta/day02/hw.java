package kr.or.kosta.day02;

import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.or.kosta.HW.BeanSet;

public class hw {

	public static void main(String[] args) {
		String path = "classpath:hw.xml";
		ApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		BeanSet ins = ctx.getBean("bs",BeanSet.class);
		
		Iterator<String> ita = ins.getItems().iterator();
		
		while(ita.hasNext()) {
			System.out.println(ita.next());
		}
		
	}

}
