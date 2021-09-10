<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>업로드한 파일</h2>
	<ul>
		<li> 제목 : ${title } </li>
		<li> 파일명 : ${filename } </li>
		<li> 파일경로 : ${uploadpath } </li>
		<li> 다운로드 : <a href="download/${filname }"> ${filename }</a> </li>
		
	</ul>
	
</body>
</html>