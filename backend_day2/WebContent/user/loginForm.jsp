<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="login">
		<input type="text" name="id" placeholder="아이디를 입력하세요.">
		<input type="text" name="name" placeholder="이름을 입력하세요.">
		<input type="password" name="pass" placeholder="비밀번호를 입력하세요.">
		<input type="submit">
	</form>
</body>
<script>
	let status = "<%=request.getAttribute("status")%>";
	if(status=="fail"){
		alert("아이디와 패스워드를 확인하세요.");
	}
</script>

</html>