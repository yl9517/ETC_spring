package dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MemberDTO {
	private String  name;
	private int age;
}
