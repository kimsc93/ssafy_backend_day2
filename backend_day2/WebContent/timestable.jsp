<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// 내장객체는 언제나 있다.!!!!!!!
		int dan = Integer.parseInt(request.getParameter("dan"));
	
	
		out.print(session);
	%>
	<h1>
		times table for
		<%=dan%></h1>
	<table border="1">
		<tr>
			<th>first</th>
			<th>second</th>
			<th>third</th>
		</tr>
		<%
			for (int i = 1; i < 10; i++) {
		%>
			<tr><td><%=dan %></td><td><%=i %></td><td><%=dan * i %></td></tr>
		<%
			}
		%>
	</table>
</body>
</html>