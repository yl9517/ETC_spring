<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- <form method="post" action="result2"> -->
	<form method="post" action="result4">
		<ul>
			<li>
				<label for="id">아이디</label>
				<input type="text" name="id" id="id" required="required">
			</li>
			<li>
				<label for="pwd">패스워드</label>
				<input type="password" name="pwd" id="pwd" required="required">
			</li>
			<li>
				<label for="irum">이름</label>
				<input type="text" name="irum" id="irum" required="required">
			</li>
			<li>
				<label for="age">나이</label>
				<input type="text" name="age" id="age">
			</li>
			<li>
				<label>성별</label>
				<label for="w">여</label>
				<input type="radio" name="gender" id="w" value="여자" checked="checked">
				<label for="m">남</label>
				<input type="radio" name="gender" id="m" value="남자">
			</li>
			<li>
				<label>좋아하는 음식</label>
				<input type="checkbox" name="food" id="f1" value="닭발">닭발
				<input type="checkbox" name="food" id="f2" value="라면">라면
				<input type="checkbox" name="food" id="f3" value="육회">육회
				<input type="checkbox" name="food" id="f4" value="마라탕">마라탕
				<input type="checkbox" name="food" id="f5" value="앙버터">앙버터
			</li>
			<li>
				<label for="text">하고싶은 말</label>
				<textarea rows="5" cols="10" id="text" name="text"></textarea>
			</li>
			<li>
				<input type="submit" value="전송">
				<input type="reset" value="취소">
			</li>
		</ul>
	</form>
	
	
	
</body>
</html>