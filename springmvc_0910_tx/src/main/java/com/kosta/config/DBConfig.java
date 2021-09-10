package com.kosta.config;

import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
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
	
	//트랜잭션   root-context의 트랜잭션xml이랑 비교
 	@Bean 
	public DataSourceTransactionManager txManager() throws IOException {
		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
		transactionManager.setDataSource(getDatasource());
		
		return transactionManager;
	
	}
	
}
