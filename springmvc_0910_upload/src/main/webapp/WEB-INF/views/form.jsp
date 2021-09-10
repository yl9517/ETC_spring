<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="result" enctype="multipart/form-data">
		<label for="filename">파일명</label>
		<input type="text" name="filename" id="filename"><br>
		<label for="file1">파일</label>
		<input type="file" name="file1" id="file1"><br>
		<input type="submit" value="전송">
	</form>
</body>
</html>