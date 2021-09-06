<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="insertresult2">
		<label for="fname"> 이름 </label>
		<input type="text" name="fname" id="fname">
		<label for="dname"> 부서명 </label>
		<input type="text" name="dname" id="dname">
			
		<input type="submit" value="추가">
		<input type="reset" value="취소">
	</form>
</body>
</html>