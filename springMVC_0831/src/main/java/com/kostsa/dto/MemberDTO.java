package com.kostsa.dto;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class MemberDTO {
	private String id;
	private String pwd;
	private String irum;
	private int age;
	private String gender;
	private String[] food;
	private String text;
}
