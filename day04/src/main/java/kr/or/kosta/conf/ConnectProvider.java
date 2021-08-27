package kr.or.kosta.conf;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class ConnectProvider {  //1  //DB연결 전 테스트
	private String driver;
	private String url;
	private String user;
	private String pwd;
}
