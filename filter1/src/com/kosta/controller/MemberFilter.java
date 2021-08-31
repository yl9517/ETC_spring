package com.kosta.controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MemberFilter implements Filter {

	@Override
	public void destroy() {
		System.out.println("memberfilter destroy");

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("MemberFilter before");
		chain.doFilter(request, response);
		System.out.println("MemberFilter after");
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("memberfilter init");

	}

}
