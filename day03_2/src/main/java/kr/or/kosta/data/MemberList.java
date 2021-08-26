package kr.or.kosta.data;

import java.util.List;

import kr.or.kosta.dto.MemberDTO;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class MemberList {
	private List<MemberDTO> list;
	
	//list 출력하는 메소드
	public void prt() {
		for(MemberDTO item:list) {
			System.out.println(item.getName()+" "+item.getAge());
		}
	}
	
}
