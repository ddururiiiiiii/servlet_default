<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.member.vo.MemberVO"%>

<!DOCTYPE html>
<head>
<title>MEMBER LIST</title>
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

	<% Member mv = (MemberVO) session.getAttribute("MemberVO"); %>

	<div class="container">
		<h2>MEMBER LIST</h2>
		<p>: 회원 리스트입니다.</p>
		<table class="table table-striped">
			<thead>
				<tr>
					<th><input type="checkbock"/></th>
					<th>NO</th>
					<th>ID</th>
					<th>NAME</th>
					<th>BIR</th>
				</tr>
			</thead>
			<tbody>
		<% List <MemberVO> list = (List<MemberVO>) request.getAttribute("list");
		for (int i = 0; i < list.size(); i++) {
			String reportNm = list.get(i).getReportNm(); %>
				<tr>
					<td><%=<input type="checkbock"> %></td>
					<td><%=list.get(i).getNum() %></td>
					<td><a href="#"><%=list.get(i).getMemId()%></a></td>
					<td><%=list.get(i).getMemName()%></td>
					<td><%=list.get(i).getMemBir()%></td>
				</tr>
				<% } %> 
			</tbody>
		</table>
		<hr>
		<button type="button" class="btn btn-default">삭제</button>
		<button type="button" class="btn btn-default">등록</button>
	</div>

</body>
</html>
