<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
			<c:forEach var="item" items="${ list}">
				<tr>
					<td> ${item.employee_id }</td>
					<td> ${item.first_name }</td>
					<td> ${item.department_id }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br>
	<form method="get" action="list">
		<select name="search">
			<option value="employee_id">사원번호</option>
			<option value="first_name">사원명</option>
			<option value="department_id">부서코드</option>
		</select>
		<input type="text" name="searchtxt">
		<input type="submit" value="검색">
	</form>
	
	<c:if test="${page.prev }">
		<a href="list?currPage=${page.startBlock-1 }&search=${search}&searchtxt=${searchtxt}">
			<c:out value="이전" />
		</a>
	</c:if>
	
	<c:forEach var="index" begin="${page.startBlock }" end="${page.endBlock }">
		<c:if test="${index==page.currPage }">
			<c:out value="${index }" />
		</c:if>
		<c:if test="${index !=page.currPage }">
			<a href="list?currPage=${index }&search=${search}&searchtxt=${searchtxt}">
				<c:out value="${index}" />
			</a>
		</c:if>
	</c:forEach>
	
		<c:if test="${page.next }">
		<a href="list?currPage=${page.endBlock+1 }&search=${search}&searchtxt=${searchtxt}">
			<c:out value="다음" />
		</a>
	</c:if>
	
	
</body>
</html>