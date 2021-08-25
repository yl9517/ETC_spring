package kr.or.kosta.hellotest;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SampleTest3 {
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void t1() {
		new ArrayList<String>().get(0);  //원래라면 indexout에러가 뜨며 실패하지만, indexout 에러가 뜨길 기대하기 때문에 성공
	}
	
	
	@Test
	public void t2() {
		String name="hong";
		String name2=new String("hong");
		
		assertEquals(name, name2); //name.equals(name2) => 성공
		assertSame(name, name2);  //name == name2   => 실패		
	}
	
	// 레퍼런스 - http://hamcrest.org/JavaHamcrest/tutorial
	@Test
	public void t3() {
	//	assertThat(Arrays.asList(new String[] {"fun","sun","berry"}), hasItems("fun"));  //hasItems : fun이 포함 되었는지?
	//	assertThat(Arrays.asList(new String[] {"fun","sun","berry"}), everyItem(containsString("n")));  // everyItem : 모든문자가 / containsString : n이 포함되었는지
		assertThat(10, equalTo(10));
	}
	
	
}
