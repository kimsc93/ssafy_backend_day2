<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=request.getAttribute("id") %>님 로그인 되었습니다.!!<br>
	<a href="Book.html">도서 등록</a>
	<a href="#">로그아웃</a>
</body>
</html>