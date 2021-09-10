package com.kosta.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//원래 app service의 servlet-context에서 썼던 것

@Configuration
@MapperScan(basePackages = {"com.kosta.mapper"}) //mapper 받아오기
@ComponentScan(basePackages = {"com.kosta.service"}) //service 받아오기
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class EmpConfig { //사용되는 config 정보들 받아줌
		
}
