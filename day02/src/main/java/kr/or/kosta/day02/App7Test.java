package kr.or.kosta.day02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.or.kosta.Sample4.Item;

public class App7Test {

	public static void main(String[] args) {
		String path ="classpath:map1/app7.xml";
		ApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		Item item = ctx.getBean("item",Item.class);
		item.prt();

	}

}
