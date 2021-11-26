<%@page import="model.bean.Account"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	Account account = (Account) request.getAttribute("account");
%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<meta charset="UTF-8">
</head>
<body>
	<main>
		<section>
			<pre><%=account.getID()%></pre>
			<h5><%=account.getUsername()%></h5>
			<p><%=account.getDescription()%></p>
			<a href="/CNW/sign-out">Sign out</a>
		</section>
	</main>
</body>
</html>