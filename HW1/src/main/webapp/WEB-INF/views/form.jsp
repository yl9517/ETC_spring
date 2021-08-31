<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form method="post" action="result">
		<ul>
			<li>
				<label for="name">이름</label>
				<input type="text" id="name" name="name">
			</li>
			<li>
				<label for="age">나이</label>
				<input type="text" id="age" name="age">
			</li>
			<li>
				<label for="addr">주소</label>
				<input type="text" id="addr" name="addr">
			</li>
			<li>
				<label for="phone">전화번호</label>
				<input type="text" id="phone" name="phone">
			</li>
			<li>		
				<input type="submit" value="전송">
				<input type="reset" value="취소">
			</li>
		</ul>
	</form>
</body>
</html>