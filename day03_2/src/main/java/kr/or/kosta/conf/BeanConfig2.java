package kr.or.kosta.conf;


import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.or.kosta.data.MemberList;
import kr.or.kosta.dto.MemberDTO;

@Configuration
public class BeanConfig2 {
	
	//이름이 ins인 빈 등록
	@Bean(name="ins")
	public MemberList getMemberList() {
		MemberList list = new MemberList();
		
		List<MemberDTO> members = new ArrayList<MemberDTO>();
		members.add(new MemberDTO("hong", 10));
		members.add(new MemberDTO("kim", 10));
		members.add(new MemberDTO("park", 30));
		
		list.setList(members);
		
		return list;
	}
	
	
}
