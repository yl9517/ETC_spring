package kr.or.kosta.Sample1;

import java.util.List;

public class Member1 {
	private String name;
	private int age;
	private List<String> items;
	private Jumsu jumsu;
	
	public Member1(String name, int age, Jumsu jumsu) {
		super();
		this.name = name;
		this.age = age;
		this.jumsu = jumsu;
	}
	public Member1(List<String> items) {
		super();
		this.items = items;
	}
	
	//item 출력
	public void prt1() {
		for(String item:items) {
			System.out.println(item);
		}
	}
	//item외의 자료를 출력
	public void prt2() {
		System.out.println("name : "+name);
		System.out.println("age : "+age);
		System.out.println("kor : "+jumsu.getKor());
		System.out.println("kor : "+jumsu.getEng());
		System.out.println("kor : "+jumsu.getMath());
	}
}
