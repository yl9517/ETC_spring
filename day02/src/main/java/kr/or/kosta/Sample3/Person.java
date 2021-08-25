package kr.or.kosta.Sample3;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter@Getter
@AllArgsConstructor
public class Person {
	private List<String> nicknames;
	private List<MemberDTO> friends;
	
}
