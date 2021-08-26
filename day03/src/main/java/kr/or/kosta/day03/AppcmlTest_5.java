package kr.or.kosta.day03;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import five.PersonList;
import kr.or.kosta.sample0.BeanSet;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:personapp_5.xml") //하나의 파일 받아와서
public class AppcmlTest_5 {
	
	@Autowired //byType ▶ 
	private PersonList persons;
	
	@Autowired
	private BeanSet item;
	
	@Test
	public void test1() {
		assertNotNull(persons);
		assertEquals("kim", persons.getPersonlist().get(1).getName());
	}
	
	@Test
	public void test2() {
		assertNotNull(item);
		assertEquals("hong", item.getItems().iterator().next());
	}
	
}
