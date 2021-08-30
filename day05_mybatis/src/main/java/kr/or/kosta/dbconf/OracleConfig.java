//package kr.or.kosta.dbconf;
//
//import java.io.IOException;
//import java.util.Properties;
//
//import javax.annotation.Resource;
//
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.ClassPathResource;
//
//import com.zaxxer.hikari.HikariConfig;
//import com.zaxxer.hikari.HikariDataSource;
//
//@Configuration
//public class OracleConfig {
//	
//	//나중에 다시 알려줌 
//	
//	@Bean(name="oracledb", destroyMethod ="close")
//	public HikariDataSource getDataSource() throws IOException {
//		ClassPathResource resource = new ClassPathResource("oracle.properties");
//		
//		Properties prop = new Properties();
//		prop.load(resource.getInputStream());
//		HikariConfig config = new HikariConfig(prop);
//		HikariDataSource ds = new HikariDataSource(config);
//		
//		return ds;
//	}
//	
//	@Bean(name="sqlsessionFactory")
//	public SqlSessionFactoryBean getFactory() throws IOException {
//		SqlSessionFactoryBean fact = new SqlSessionFactoryBean();
//		fact.setDataSource(getDataSource());
//		
//		ClassPathResource[] res = new ClassPathResource[1];
//		
//		res[0]= new ClassPathResource("mapper/emp.xml");
//		fact.setMapperLocations(res);
//		
//		return fact;
//	}
//	
//	public SqlSessionTemplate getTemplate() throws IOException {
//		SqlSessionTemplate temp = new SqlSessionTemplate(getFactory());
//	}
//	
//}
