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
 
 <c:forEach var="item" items="${list }">
 	<c:out value="${item.eid }"></c:out> 
 	<c:out value="${item.fname }"></c:out>
 	<c:out value="${item.hdate }"></c:out>
 	<c:out value="${item.dname }"></c:out>
 	<br>
 	
 </c:forEach>
 	<a href="insertform">추가</a>

</body>
</html>