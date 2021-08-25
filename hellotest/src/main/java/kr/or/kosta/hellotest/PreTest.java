package kr.or.kosta.hellotest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PreTest {
	
	@Before
	public void p1() {
		System.out.println("test 전");
	}
	
	//테스트 전용
	@Test
	public void t1() {
		System.out.println("test1");
		assertEquals(10, 11);
	}
	@Test
	public void t2() {
		System.out.println("test2");
		assertEquals(10, 10);
	}
	
	@After
	public void p2() {
		System.out.println("test 후");
	}
	
}
