package com.kosta.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
	private int employee_id;
	private String first_name;
	private String hire_date;
	private float salary;
}
