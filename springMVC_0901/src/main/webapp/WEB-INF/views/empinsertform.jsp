<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form  method="post" action="insertresult">
	<ul>
		<li>
			<label  for="first_name">사원이름</label>
			<input type="text" name="first_name" id="first_name">  <!-- empDTO와 이름 같아야 함 -->
		</li>			
		<li>
			<label  for="salary">급여</label>
			<input type="text" name="salary" id="salary">
		</li>	
		<li>
			<label  for="department_id">부서코드</label>
			<input type="text" name="department_id" id="department_id">
		</li>	
		<li>
			<input type="submit" value="추가">
			<input type="reset" value="취소">
		</li>	
		</ul>
	</form>
</body>
</html>