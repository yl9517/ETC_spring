package kr.or.kosta.dto2;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Person {
	private String name;
	private int age;
	private String addr;
}
