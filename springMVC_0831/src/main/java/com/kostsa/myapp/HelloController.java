package com.kostsa.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 *  HandlerMapping : url과 요청정보를 기준으로 어떤 컨트롤러를 사용할 것인지 결정하는 로직을 담당
 *  DefaultAnnotationHandlerMapping : 매핑정보를 타입레벨 메서드 레벨에 작성
 *  
 *  	@RequestMapping으로 표현함
 * 
 * webapp-webinf-spring-appServlet의 servlet-context.xml의 아래  내용으로 인해 경로 지정.
 * 
 * 	<beans:bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<beans:property name="prefix" value="/WEB-INF/views/" />
		<beans:property name="suffix" value=".jsp" />
	</beans:bean>
	
 * 	
 * 	ViewResolver : 
 *   InternalResourceViewResolver : 뷰 이름으로 jsp 연동을 위한 view 객체를 리턴    (  /WEB-INF/view + main(뷰이름) + ".jsp"  ▶   /WEB-INF/views/main.jsp  )
 * 
 */

@Controller
public class HelloController {

	@RequestMapping("/main")   // http://localhost:8080/myapp/main
	public String main() {
		return "main"; //뷰 이름   → /WEB-INF/views/main.jsp
	}
	
	@RequestMapping("/main2")
	public ModelAndView main2() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("hello","안녕하세요");
		mav.addObject("name","홍길동");
		mav.addObject("age",10);
		mav.setViewName("nice");
		
		return mav;
	}

	@RequestMapping("/main3")
	public String main3(Model model) {  //모델 이용하여 객체 보내기
		model.addAttribute("irum","이하나");
		model.addAttribute("nai",20);
		model.addAttribute("juso","서울");
		model.addAttribute("hi","안녕하세요 만나서 반갑습니다.");
		return "info"; //  /WEB-INF/views/info.jsp
					//forward 방식~
		
	}
	
	
}
