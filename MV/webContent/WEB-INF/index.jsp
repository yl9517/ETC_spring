<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>�� ����Ʈ��</h1>
	<script src="https://code.jquery.com/jquery-3.6.0.js"
		integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
		crossorigin="anonymous"></script>
		
	<script>
		$.ajax({
			method : "GET",
			url : "http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=03778b8e03b2f65d0d2c724260f2df8c&targetDt=20120101",
			data : {
				itemPerPage : "10"
			}
		}).done(function(msg) {
			console.log(msg)
		});
	</script>
</body>
</html>