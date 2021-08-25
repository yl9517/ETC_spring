package kr.or.kosta.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter  //setter 자동생성
@Getter  //getter 자동생성
//@ToString(exclude = "age")  //toString 자동생성  //exclude는 해당 변수를 제외시키겠다
@ToString   //toString 자동생성 
@NoArgsConstructor   // 파라미터가 없는 기본생성자 생성
@AllArgsConstructor  //모든 필드에 대한 생성자를 자동으로 생성
public class MemberDTO {
	private String name;
	private int age;
}
