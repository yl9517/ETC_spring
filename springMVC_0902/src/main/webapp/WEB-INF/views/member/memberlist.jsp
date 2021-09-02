<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.servletContext.contextPath }/resources/css/memberlist.css">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>
<button id="append">내용 추가</button>
<table>
	<thead>
		<tr>
			<th>회원번호</th>
			<th>아이디</th>
			<th>이름</th>
			<th>나이</th>
			<th>주소</th>
		</tr>
	</thead>
	<tbody>
	<c:if test="${list==null }">
		<tr>
			<td colspan="5"> 해당 자료가 없습니다</td>
		</tr>
	</c:if>
	<c:if test="${list!=null }">
		<c:forEach var="item" items="${list }">
			<tr>
				<td>${item.member_no }</td>
				<td>${item.member_id }</td>
				<td>${item.member_name }</td>
				<td>${item.member_age }</td>
				<td>${item.member_addr }</td>
			</tr>
		</c:forEach>
	</c:if>
	</tbody>
</table>
<script src="${pageContext.servletContext.contextPath }/resources/js/memberlist.js"></script>
</body>
</html>