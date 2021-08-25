package kr.or.kosta.hellotest;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class) //junit4에 관련된 애들로 테스트할거야
public class SampleTest2 {

	@Test
	public void prt() {
		byte[] b1 = "hello".getBytes();
		byte[] b2 = "hello".getBytes();
		
		assertArrayEquals(b1, b2);
	}
	
	@Test
	public void prt2() {
		int[] arr1 = {10,20,30,40};
		int[] arr2 = {10,20,30,40};
		assertArrayEquals(arr1, arr2);
	}
	
	@Test
	public void t3() {
		assertEquals("fail data!!", 10,15);
	}
	
	@Test
	public void t4() {
		String name="hong gil dong";
	//	String name=null;
		assertNull(name); //null 이니?  ->  아니라고 뜨며 오류
	//	assertNotNull(name);
				
	}
	
	@Test
	public void t5() {
		String[] irum= {"hong","kim","lee"};
		String[] name= {"hong","park","lee"};
		
		assertArrayEquals(irum, name);
	}
	
	
}

