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
	<section>
		<form>
			<input type="password" placeholder="password" name="password" /> <input
				type="password" placeholder="comfirm password" name="comfirm" />
			<button type="submit">sign in</button>
			<%=message%>
		</form>
	</section>
</body>
</html>