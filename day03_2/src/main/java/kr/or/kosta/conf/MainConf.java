package kr.or.kosta.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import({BeanConfig1.class, BeanConfig2.class}) //두 클래스를 임포트
@ImportResource("classpath:sample1/app1.xml") //xml도 임포트
public class MainConf {

}
