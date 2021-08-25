package com.bank;

public class Account {
	private int balance;
		
	public Account(int balance) {
		this.balance=balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void desposit(int money) {
		this.balance+=money;
	}
	
	public void withdraw(int money) {
		if(this.balance<money) {
			throw new ArithmeticException("잔고부족");
		}
		this.balance-=money;
	}
	
	
	
}
