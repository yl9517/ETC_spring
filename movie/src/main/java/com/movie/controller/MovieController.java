package com.movie.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
	
	@GetMapping("/apitest")
	public String movie() {
		
		StringBuffer result = new StringBuffer();
		try {
			String mv = "http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.xml?"
					+ "key=f5eef3421c602c6cb7ea22410479588"
					+ "8&targetDt=20120101";
			URL url = new URL(mv);
			HttpURLConnection urlcon = (HttpURLConnection) url.openConnection();
			urlcon.setRequestMethod("GET");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(urlcon.getInputStream(), "URF-8"));
			
			String returnLine;
			result.append("<xmp>");
			while((returnLine=br.readLine()) != null) {
				result.append(returnLine+"\n");
			}
			urlcon.disconnect();
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
		return result+"</xmp>";
	}
}
