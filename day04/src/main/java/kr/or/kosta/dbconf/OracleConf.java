package kr.or.kosta.dbconf;

import java.io.IOException;
import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class OracleConf { 
	
	// java에서 설정파일 만드는 중
	
//	@Bean(name="oracleds", destroyMethod = "close")
//	public HikariDataSource getDataSource() {
//		HikariConfig config = new HikariConfig();
//		config.setDriverClassName("oracle.jdbc.OracleDriver");
//		config.setJdbcUrl("jdbc:oracle:thin:@127.0.0.1:1521:XE");
//		config.setUsername("hr");
//		config.setPassword("hr");
//		
//		HikariDataSource ds = new HikariDataSource(config);
//		
//		return ds;	
//	}
	
	// 위 방법대로 하면 개인정보 노출
	// 그러므로 아래방법으로
	@Bean(name="oracleds", destroyMethod = "close")
	public HikariDataSource getDataSource() throws IOException {
		ClassPathResource resource = new ClassPathResource("oracle2.properties");
		Properties prop = new Properties();
		prop.load(resource.getInputStream());  //이름 일치시켜줘야함....
		
		HikariConfig config = new HikariConfig(prop);
		HikariDataSource ds = new HikariDataSource(config);
		return ds;
	}
	
}
