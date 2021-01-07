<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table {border: 1px solid #c1c1c1;}
th {border-bottom: 1px solid #c1c1c1;}
</style>
</head>
<body>
	<table>
		<tr>
			<th>No</th>
			<th>작성자</th>
			<th>내용</th>
			<th>날짜</th>
			<c:forEach var="i" items="${list }">
				<tr>
					<td>${i.seq }</td>
					<td>${i.writer }</td>
					<td>${i.title }</td>
					<td>${i.write_date }</td>
				</tr>
			</c:forEach>
	</table>
	<a href="/"><button>뒤로가기</button></a>

</body>
</html>