<%@ page language="java" contentType="text/html; charset=UIF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UIF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>�����ȣ</th>
				<th>�����</th>
				<th>�μ��ڵ�</th>				
			</tr>
		</thead>
		<tbody>
		
		</tbody>
	</table>
	<br>
	<form method="get" action="list?currpage=">
		<select name="search">
			<option value="employee_id">�����ȣ</option>
			<option value="first_name">�����</option>
			<option value="department_id">�μ��ڵ�</option>
		</select>
		<input type="text" name="searchtxt">
		<input type="submit" value="�˻�">
	</form>
</body>
</html>