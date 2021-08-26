package lifecycle;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Doing implements InitializingBean,DisposableBean,BeanNameAware {

	public Doing() {
		System.out.println("doing constructor");
	}
	public void prt() {
		System.out.println("prt method");
	}
	  
	public void a() {
		System.out.println("init-method");
	}
	public void b() {
		System.out.println("destory-method");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("initializing bean interface");
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("destory-disposable bean interface");
	}
	@Override
	public void setBeanName(String name) {
		System.out.println("이름 : "+name);
	}
	
	
}
