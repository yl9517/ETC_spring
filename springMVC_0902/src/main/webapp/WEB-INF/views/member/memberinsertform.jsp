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
			<label for="member_id">���̵�</label>
			<input type="text" name="member_id" id="member_id">
		</li>
		<li>
			<label for="member_name">�̸�</label>
			<input type="text" name="member_name" id="member_name">
		</li>
		<li>
			<label for="member_age">����</label>
			<input type="text" name="member_age" id="member_age">
		</li>
		<li>
			<label for="member_addr">�ּ�</label>
			<input type="text" name="member_addr" id="member_addr">
		</li>
		<li>
			<input type="submit" value="�߰�">
			<input type="reset" value="���">
		</li>
	</ul>
</form>
</body>
</html>