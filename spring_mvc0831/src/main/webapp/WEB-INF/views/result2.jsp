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
	아이디 : ${id }<br>
	비밀번호 : ${pwd }<br>
	이름 ${irum }<br>
	나이 : ${age }<br>
	성별 : ${gender }<br>
	좋아하는 음식 : 
	<c:forEach var="item" items="${food }">
		<c:out value="${item }"></c:out>
	</c:forEach>
	하고싶은 말 : ${text }
</body>
</html>