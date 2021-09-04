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
 <%-- ${result.name }
 ${result.age }
 ${result.addr }
 ${result.phone } --%>
 
 <c:forEach var="item" items="${result }">
 	<c:out value="${item.key }"></c:out> 
 	<c:out value="${item.value }"></c:out>
 	<br>
 </c:forEach>
</body>
</html>