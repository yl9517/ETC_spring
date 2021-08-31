<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="result">
		<ul>
			<li>
				<label for="name">이름</label>
				<input type="text" name="name" id="name">
			</li>
			<li>
				<label for="age">나이</label>
				<input type="text" name="age" id="age">
			</li>
			<li>
				<input type="submit" value="전송">
				<input type="reset" value="취소">
			</li>
		</ul>
	</form>
</body>
</html>