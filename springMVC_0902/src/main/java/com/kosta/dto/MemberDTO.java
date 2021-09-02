package com.kosta.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
public class MemberDTO { 
	
	//db와 이름 다르게 잡아볼 것
	private int member_no;
	private String member_id;
	private String member_name;
	private int member_age;
	private String member_addr;
}
