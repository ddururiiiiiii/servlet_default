<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.member.vo.MemberVO"%>

<!DOCTYPE html>
<head>
<title>Member Update</title>
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
		<h2>Member Insert</h2>
		<p>: 회원 등록</p>
		<table class="table">
			<tbody>
				<tr>
					<th>ID</th>
					<td><input type="text" class="form-control" id="" placeholder=""></td>
				</tr>
				<tr>
					<th>NAME</th>
					<td><input type="text" class="form-control" id="" placeholder=""></td>
				</tr>
				<tr>
					<th>BIR</th>
					<td><input type="date" class="form-control" id="" placeholder=""></td>
				</tr>
			</tbody>
		</table>
		<hr>
		<button type="button" class="btn btn-default">등록</button>
		<button type="button" class="btn btn-default">목록</button>
	</div>
</body>
</html>