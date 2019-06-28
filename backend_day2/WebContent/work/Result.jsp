
<%@page import="work.com.ssafy.model.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#first{
		width: 100px;
		background: gray;
	}
	td {
        padding: 10px;
        border: 1px solid #333333;
      }
	#table{
		border: 1px solid black;
		border-collapse: collapse;
		
	}
</style>
</head>
<body>
<h1>등록된 정보는 다음과 같습니다.</h1>
<%
	Book book = (Book)request.getAttribute("book");
%>
<table id="table">
	<col id="first">
	<tr><td>도서번호</td><td><%=book.getIsbn() %></td></tr>
	<tr><td>도서제목</td><td><%=book.getTitle() %></td></tr>
	<tr><td>도서종류</td><td><%=book.getCategory() %></td></tr>
	<tr><td>출판국가</td><td><%=book.getCountry() %></td></tr>
	<tr><td>출판일</td><td><%=book.getDate() %></td></tr>
	<tr><td>출판사</td><td><%=book.getPublisher() %></td></tr>
	<tr><td>저자</td><td><%=book.getAuthor() %></td></tr>
	<tr><td>도서가격</td><td><%=book.getUnit() %><%=book.getPrice() %></td></tr>
	<tr><td>요약내용</td><td><%=book.getDesc() %></td></tr>
</table>
<a href="#">추가등록</a>
</body>
</html>