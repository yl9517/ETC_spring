package com.kosta.vo;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FileVo {
	private String filename;
	private MultipartFile file1;
}
