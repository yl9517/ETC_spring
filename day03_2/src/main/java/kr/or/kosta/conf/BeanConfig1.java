package kr.or.kosta.conf;


import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.or.kosta.dto.MemberDTO;
/*
 * 빈등록
 *  m1-생성자 이용
 *  m2-setter이용
 *  m3-리턴타입 보고 작성
 */

@Configuration  //bean을 등록할 수 있는 환경을 제공해줄게
public class BeanConfig1 {
	
	@Bean
	public MemberDTO  m1() {
		MemberDTO obj1 = new MemberDTO("hong",10);
		
		return obj1;
	}
	@Bean
	public MemberDTO  m2() {
		MemberDTO obj2 = new MemberDTO();
		obj2.setName("kim");
		obj2.setAge(20);
		
		return obj2;
	}
	@Bean
	public List<MemberDTO> m3(){
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		
			list.add(new MemberDTO("lee",30));
			list.add(new MemberDTO("kang",15));
		
		return list;
	}

	
}
