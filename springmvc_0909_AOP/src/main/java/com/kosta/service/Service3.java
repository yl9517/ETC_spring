package com.kosta.service;

import org.springframework.stereotype.Service;

@Service(value="s3")
public class Service3 {
	public void write() {
		for(int i=0; i<100; i++) {
			System.out.println("service-write : "+i);
		}
	}
	
	public int read(String[] arr) throws ArrayIndexOutOfBoundsException{
		if(arr.length>=3) {
			for(int  i=0; i<arr.length; i++) {
				System.out.println("service3-read..."+i);
			}
		}else {
			throw new ArrayIndexOutOfBoundsException();
		}
		return arr.length;
	}
}
