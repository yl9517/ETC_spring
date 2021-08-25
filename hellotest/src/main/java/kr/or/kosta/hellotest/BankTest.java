package kr.or.kosta.hellotest;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.bank.Account;


public class BankTest {

	Account acc;
	
	@Before  //테스트 전 동작
	public void b1() {
		acc= new Account(100);
	}
	
	@Test
	public void doing1() {		
		acc.desposit(10); //10 입금  (원래 금액 + 10)
//		assertEquals(110, acc.getBalance());  // 110이라는 값과 들어있는 돈이 같은지
	}
	@Test
	public void doing2() {		
		acc.withdraw(10); //10 인출 (원래금액 - 10)
		assertEquals(90, acc.getBalance());  // 90이라는 값과 들어있는 돈이 같은지
	}
	
	@After //테스트 후 동작
	public void a1() {
		
	}
}
