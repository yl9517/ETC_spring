package conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import dto.MemberDTO;
import lifecycle.Doing;


@Configuration  //bean을 등록할 수 있는 환경을 제공해줄게
@ComponentScan(basePackages= {"four"}) // 해당 패키지안에 Component로 선언 된 것을 가져와서 bean으로 등록하기
public class BeanConf1 {  //xml 연결 없음
	
	@Bean //해당 메소드가 bean(객체)가 됨!!! --> 기본 : 메소드 이름이 빈 이름
	public Doing d1() { 						// <bean name="d1" class="lifecycle.Doing>
		Doing obj = new Doing(); //객체 만들고
		return obj;   //bean에 객체 등록 ( = Configuration)
	}
	
	@Bean(name="bean_d1", initMethod = "a", destroyMethod = "b")  //빈 이름을 따로 지정해줌 -> bean_d1
	public Doing d2() {
		Doing d2 = new Doing();
		return d2;
	}
	
	
	//----------------------------▲ ConfTest  (Doing) byName 실험
	//----------------------------▼ ConfTest  (MemberDTO) byType 실험
	
	@Bean
	public MemberDTO m1() {
		MemberDTO m1 = new MemberDTO();
		System.out.println("memberDTO 클래스에 등록한 빈 등록");
		return m1;
	}
	
	@Bean
	public MemberDTO m2() {
		MemberDTO m2 = new MemberDTO("hong",20);
		return m2;
	}
	
	
}
