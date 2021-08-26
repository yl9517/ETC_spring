package or.kr.kosta.conf;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.or.kosta.data.MemberList;

@Configuration
public class BeanConfig2 {
	
	//이름이 ins인 빈 등록
	@Bean(name="ins")
	public MemberList getMemberList() {
		MemberList list = new MemberList();
		
		list.prt();
		
		return list;
	}
	
	
}
