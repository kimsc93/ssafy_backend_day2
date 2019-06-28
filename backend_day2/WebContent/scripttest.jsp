<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- HTML 주석: 사용하려는 페키지 import -->
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>지금 시각은...</h1>
	<%--JSP 주석: scriptlet은 local영역에 들어가는 java code 작성 --%>
	<%
		Date date = new Date();
		// 내장 객체의 활용
		out.println(date);
		//int session = 100;
	%>
	<%-- expression tag: 출력 --%>
	<%=date%><br>

	<%=dateToString(date) %><br>
	
	<%-- declaration tag: member 선언 --%>
	<%!private String dateToString(Date d){
		SimpleDateFormat format = new SimpleDateFormat();
		format.applyPattern("yyyy-MM-dd(E)");
		return format.format(d);
	}%>
</body>
</html>