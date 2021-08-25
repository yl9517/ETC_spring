package kr.or.kosta.day02;

import java.util.Iterator;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.or.kosta.Sample5.Man;
import kr.or.kosta.Sample5.ManSet;

public class App8Test {

	public static void main(String[] args) {
		
		String path = "classpath:app8.xml";
		ApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		//getter로 값 출력
		ManSet ms = ctx.getBean("ins",ManSet.class);
		
//		Set<Man> s = ms.getS1();   => s.iterator();
		
		Iterator<Man> ita = ms.getS1().iterator();
		
		while(ita.hasNext()) {
			Man m = ita.next();
			System.out.println(m.getName());
		}
		
	}

}
