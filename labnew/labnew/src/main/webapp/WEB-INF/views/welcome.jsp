<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="header.html"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<table style="with: 50%">
	<tr><td>
	<% String username = request.getParameter("username"); %>
<h2>Welcome ${pageContext.request.userPrincipal.name} | <a onclick="document.forms['logoutForm'].submit()"></a></h2>
	</td></tr>
<tr></tr><tr><td></td><td></td><td><a href="${pageContext.request.contextPath}/logout">Logout</a></td></tr>

<tr></tr><tr><td></td><td></td><td>
<br><br>
<form action="/labnew"><input type="submit" value="Home"></form>
</table>
</body>
</html>
<%@ include file="footer.html"%>