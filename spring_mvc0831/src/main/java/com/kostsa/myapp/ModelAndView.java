package com.kostsa.myapp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.mvc.AbstractController;

public class ModelAndView extends AbstractController {

	@Override
	protected org.springframework.web.servlet.ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		org.springframework.web.servlet.ModelAndView mav = new org.springframework.web.servlet.ModelAndView();
		mav.addObject("name","hong gil dong");
		mav.addObject("age",20);
		mav.addObject("addr","서울");
		mav.setViewName("hello");
		// /WEB-INF/views/hello.jsp
		
		return mav;
	}


}
