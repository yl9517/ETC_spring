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
	<c:if test="${result ==1}">
		<script>
			alert("수정성공");
			location.href="${pageContext.servletContext.contextPath}/detail/"+${employee_id};
		</script>
	</c:if>
	<c:if test="${result != 1 }">
		<script>
			alert("수정 실패!");
			location.href="${pageContext.servletContext.contextPath}/detail/"+${employee_id};
		</script>
	</c:if>

</body>
</html>