<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="memberinsertresult">
	<ul>
		<li>
			<label for="member_id">아이디</label>
			<input type="text" name="member_id" id="member_id">
		</li>
		<li>
			<label for="member_name">이름</label>
			<input type="text" name="member_name" id="member_name">
		</li>
		<li>
			<label for="member_age">나이</label>
			<input type="text" name="member_age" id="member_age">
		</li>
		<li>
			<label for="member_addr">주소</label>
			<input type="text" name="member_addr" id="member_addr">
		</li>
		<li>
			<input type="submit" value="추가">
			<input type="reset" value="취소">
		</li>
	</ul>
</form>
</body>
</html>