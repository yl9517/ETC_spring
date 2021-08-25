package kr.or.kosta.day02;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.or.kosta.Sample3.MemberDTO;
import kr.or.kosta.Sample3.Person;

public class App6Test {

	public static void main(String[] args) {
		String path="classpath:app6.xml";
		ApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		Person p1 = ctx.getBean("person",Person.class);
		List<String> nicks = p1.getNicknames(); //list 받기
		for(String nick:nicks) {
			System.out.println(nick);
		}
		List<MemberDTO> friends =  p1.getFriends();		
		for(MemberDTO friend:friends) {
			System.out.println(friend);
		}
		System.out.println("---------------------");
		
		
		Person p2 = ctx.getBean("person2",Person.class);
		nicks = p2.getNicknames(); //list 받기
		for(String nick:nicks) {
			System.out.println(nick);
		}
		friends =  p2.getFriends();		
		for(MemberDTO friend:friends) {
			System.out.println(friend);
		}
		
	}

}
