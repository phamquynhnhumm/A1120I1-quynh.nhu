<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String message = (String) request.getAttribute("message");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<main>
		<section>
			<form action="/CNW/sign-in" method="post">
				<input type="text" placeholder="username" name="username" /> <input
					type="password" placeholder="password" name="password" />
				<button type="submit">sign in</button>
				<%=message%>
			</form>
		</section>
	</main>
</body>
</html>
