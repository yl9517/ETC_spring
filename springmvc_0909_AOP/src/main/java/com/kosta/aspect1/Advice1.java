package com.kosta.aspect1;

public class Advice1 {
	public void b() {
		System.out.println("before");
	}
	public void after() {
		System.out.println("after");
	}
	public void before() {
		System.out.println("advice new before");
	}
	
	public void after1(Throwable ex) {
		System.out.println("after throwing");
		System.out.println(ex);
	}
	public void after2(Object o) {
		System.out.println("after returning advice");
		System.out.println(o);
	}
}
