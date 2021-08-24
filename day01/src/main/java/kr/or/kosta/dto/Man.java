package kr.or.kosta.dto;

import org.springframework.stereotype.Component;

@Component(value="m1")
public class Man {
	private String irum;
	private int nai;
	public String getIrum() {
		return irum;
	}
	public void setIrum(String irum) {
		this.irum = irum;
	}
	public int getNai() {
		return nai;
	}
	public void setNai(int nai) {
		this.nai = nai;
	}
	
	

}
