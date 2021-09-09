package com.kosta.service;

import org.springframework.stereotype.Service;

@Service(value="s2")
public class Service2 {
	public void read() {
		System.out.println("service2-read");
	}
	public void write() {
		System.out.println("service2-write");
	}
	public void view() {
		System.out.println("service2-view");
	}
	public int read(String[] arr) throws ArrayIndexOutOfBoundsException{
		System.out.println("service...read... arg String[] arr!");
		
		return 10;
	}
}
