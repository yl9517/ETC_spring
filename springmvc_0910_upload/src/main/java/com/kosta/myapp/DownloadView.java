package com.kosta.myapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.web.servlet.view.AbstractView;

public class DownloadView extends AbstractView{

	public DownloadView() {
		setContentType("application/octet-stream");
	}


	@Override
	public void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) throws Exception{
			File file = (File) model.get("downloadFile");
			
			response.setContentType(getContentType());
			response.setContentLength((int) file.length());
			response.setHeader("content-Disposition","attachment; filename=\""
						+URLEncoder.encode(file.getName(),"utf-8")+"\";");
			response.setHeader("content-transfer-Encoding", "binary");
			
			try(OutputStream out = response.getOutputStream();){
				FileUtils.copyFile(file, out);
				out.flush();
			}
	}

	
}
