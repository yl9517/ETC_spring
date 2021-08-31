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

	<!-- 넘겨준 클래스 첫글자 소문자로 인식 -->
	아이디 : ${memberDTO.id }<br>
	비밀번호 : ${memberDTO.pwd }<br>
	이름 ${memberDTO.irum }<br>
	나이 : ${memberDTO.age }<br>
	성별 : ${memberDTO.gender }<br>
	좋아하는 음식 : 

	<c:forEach var="item" items="${memberDTO.food }">
		<c:out value="${item }"></c:out>
	</c:forEach>
	하고싶은 말 : ${memberDTO.text }
</body>
</html>