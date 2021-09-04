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
<form method="post" action="${pageContext.servletContext.contextPath}/membermodifyresult">
	<ul>
		<li>
			<label for="member_no">회원번호</label>
			<input type="text" name="member_no" id="member_no" value="${dto.member_no }" readonly="readonly">		
		</li>
		<li>
			<label for="member_id">아이디</label>
			<input type="text" name="member_id" id="member_id" value="${dto.member_id }" readonly="readonly">
			
		</li>
		<li>
			<label for="member_name">이름</label>
			<input type="text" name="member_name" id="member_name" value="${dto.member_name }">
		</li>
		<li>
			<label for="member_age">나이</label>
			<input type="text" name="member_age" id="member_age" value="${dto.member_age }">
		</li>
		<li>
			<label for="member_addr">주소</label>
			<input type="text" name="member_addr" id="member_addr" value="${dto.member_addr }">
		</li>
		<li>
			<input type="submit" value="수정">
			<input type="reset" value="취소">
		</li>
	</ul>
</form>
</body>
</html>