<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.member.vo.MemberVO"%>

<!DOCTYPE html>
<head>
<title>Member Detail</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<% MemberVO mv = (MemberVO) session.getAttribute("MemberVO"); %>

	<div class="container">
		<h2>Member Detail</h2>
		<p>: 회원 상세 보기</p>
		<table class="table">
			<thead>
				<tr>
					<th>NO</th>
					<td><%=mv.getNum() %></td>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th>ID</th>
					<td><%=mv.getMemId()%></td>
				</tr>
				<tr>
					<th>NAME</th>
					<td><%=mv.getMemName()%></td>
				</tr>
				<tr>
					<th>BIR</th>
					<td><%=mv.getMemBir()%></td>
				</tr>
			</tbody>
		</table>
		<hr>
		<button type="button" class="btn btn-default">수정</button>
		<button type="button" class="btn btn-default">삭제</button>
		<button type="button" class="btn btn-default">목록</button>
	</div>
</body>
</html>