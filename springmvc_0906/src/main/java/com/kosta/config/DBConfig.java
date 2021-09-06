package com.kosta.config;

import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class DBConfig {
	//java로 db연결하는 법 ( 이전에는 xml로 함)
	@Bean(name="oracledb", destroyMethod = "close")
	public HikariDataSource getDatasource() throws IOException{
		ClassPathResource resource = new ClassPathResource("db.properties");
		Properties prop = new Properties();
		
		prop.load(resource.getInputStream());
		
		HikariConfig dbconfig = new HikariConfig(prop);
		HikariDataSource ds = new HikariDataSource(dbconfig);
		return ds;
	}
	@Bean(name="sqlsession")
	public SqlSessionFactory getSessionFactory() throws Exception {
		SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
		factory.setDataSource(getDatasource());

		Resource[] resources = new PathMatchingResourcePatternResolver()
								.getResources("classpath:mapper/*.xml");
		
		factory.setMapperLocations(resources);
		return (SqlSessionFactory)factory.getObject();
	}
	
}
