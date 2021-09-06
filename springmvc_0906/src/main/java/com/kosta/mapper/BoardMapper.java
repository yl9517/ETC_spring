package com.kosta.mapper;

import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
	public int totalCount(HashMap<String, Object> hm); //매개변수 여러개를 한번에 못보내므로 dto 만들필요 없이 HashMap쓰면 됨
}
