package com.kosta.myapp;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DownloadController implements ApplicationContextAware{

	private ApplicationContext applicationContext;
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext=applicationContext;
	}
	
	@RequestMapping(value="download/{path:.+}",method=RequestMethod.GET)
	public ModelAndView download(@PathVariable("path") String path, HttpServletRequest request) {
		String folder ="/WEB-INF/temp";
		String fullpath = request.getSession().getServletContext().getRealPath(folder+"/"+path);

		File file = new File(fullpath);
		
		return new ModelAndView("download","downloadFile",file);
	}

}
