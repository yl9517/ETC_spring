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
<!--  
	만들지 않은 정보들을 넘겨야 할때 본 dto가 아니라면
	매번 dto를 만들어서 넘기는 것보다 HashMap쓰는게 효율적임!!!!!!!!!!!!!!!! 
-->

<!-- hashMap의 key값으로 넣는 순간 본래 테이블명(대문자)로 들어가게 됨 -->
	 <c:forEach var="item" items="${list }">
	 	<c:out value="${item.EMPLOYEE_ID }"></c:out> 
	 <a href="/detail/${item.EMPLOYEE_ID }"><c:out value="${item.FIRST_NAME }"></c:out></a>
	<!-- detail 앞에 슬래스 써줘서 절대경로로 이동! -->
	 	<c:out value="${item.HIRE_DATE }"></c:out>
	 	<c:out value="${item.DEPARTMENT_NAME }"></c:out>
	 	<br>
	 </c:forEach>
 	<a href="insertform">추가</a>
</body>
</html>