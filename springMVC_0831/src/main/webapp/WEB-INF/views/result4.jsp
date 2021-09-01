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
	아이디 : ${member.id }<br>
	비밀번호 : ${member.pwd }<br>
	이름 ${member.irum }<br>
	나이 : ${member.age }<br>
	성별 : ${member.gender }<br>
	좋아하는 음식 : 

	<c:forEach var="item" items="${member.food }">
		<c:out value="${item }"></c:out>
	</c:forEach>
	하고싶은 말 : ${member.text }
</body>
</html>