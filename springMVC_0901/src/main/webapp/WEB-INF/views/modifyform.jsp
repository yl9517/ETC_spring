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
	<form  method="post" action="${pageContext.servletContext.contextPath}/modifyresult">
						<!--  action ="/myapp/modifyresult -->
	<ul>
		<li>
			<label  for="employee_id">사원번호</label>
			<input type="text" name="employee_id" id="employee_id" value="${empdto.employee_id }" readonly="readonly">  <!-- empDTO와 이름 같아야 함 -->
		</li>
		<li>
			<label  for="first_name">사원이름</label>
			<input type="text" name="first_name" id="first_name" value="${empdto.first_name }"> 
		</li>			
		<li>
			<label  for="salary">급여</label>
			<input type="text" name="salary" id="salary" value="${empdto.salary }">
		</li>	
		<li>
			<label  for="department_id">부서코드</label>
			<input type="text" name="department_id" id="department_id" value="${empdto.department_id }">
		</li>	
		<li>
			<input type="submit" value="수정">
			<input type="reset" value="취소">
		</li>	
	</ul>
	</form>
</body>
</html>