<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	사원번호 : ${empdto.employee_id } <br>
	이름 : ${empdto.first_name } <br>
	급여 : ${empdto.salary } <br>
	부서코드 : ${empdto.department_id } <br>
	<a href="${pageContext.servletContext.contextPath}/list">목록으로</a>
	<a href="${pageContext.servletContext.contextPath}/remove/${empdto.employee_id }">삭제</a>
	<a href="${pageContext.servletContext.contextPath}/modify/${empdto.employee_id }">수정</a>
</body>
</html>