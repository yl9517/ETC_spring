package com.kosta.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmpDTO {
	private int employee_id;
	private String first_name;
	private float salary;
	private int department_id;
}
