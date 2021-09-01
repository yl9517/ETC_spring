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
	<ul>
		<c:forEach var="item" items="${list }">
			<li>
				<c:out value="${item.employee_id }" />
				<c:out value="${item.first_name }" />
				<c:out value="${item.salary }" />
				<c:out value="${item.department_id }" />
			</li>
		</c:forEach>
	</ul>
</body>
</html>