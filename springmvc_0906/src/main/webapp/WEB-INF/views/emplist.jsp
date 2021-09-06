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
				<th>사원번호</th>
				<th>사원명</th>
				<th>부서코드</th>				
			</tr>
		</thead>
		<tbody>
		
		</tbody>
	</table>
	<br>
	<form method="get" action="list?currpage=">
		<select name="search">
			<option value="employee_id">사원번호</option>
			<option value="first_name">사원명</option>
			<option value="department_id">부서코드</option>
		</select>
		<input type="text" name="searchtxt">
		<input type="submit" value="검색">
	</form>
</body>
</html>