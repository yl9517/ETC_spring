package kr.or.kosta.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MemberDTO {
	private String name;
	private int age;
}
