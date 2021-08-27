package kr.or.kosta.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"kr.or.kosta.data"}) //만들어놓은 객체들 받아오기  //import, importresource 사용해도 됨
public class BeanConfig3_2 {
	
}
