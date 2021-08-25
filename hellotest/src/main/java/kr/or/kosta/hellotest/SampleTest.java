package kr.or.kosta.hellotest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SampleTest {
	/*
	 * 		@Test
	 	    @Before : @Test가 동작하기전
			@After : @Test가 동작 한 후
			
			@BeforeClass
			@AfterClass

	 */
	
	@BeforeClass
	public static void t1() {  //static 붙이기 
		System.out.println("before-class"); //맨 처음 클래스 시작시
	}
	
	@Before
	public void t2() {
		System.out.println("before");
	}
	
	@Test
	public void p3() {
		System.out.println("test1");
	}
	
	@Test
	public void p4() {
		System.out.println("test2");	
	}
	
	@After
	public void p5() {
		System.out.println("after");
	}
	
	@AfterClass
	public static void p6() { //static 붙이기
		System.out.println("after-class"); //맨 마지막 클래스 종료시
	}
	
}
