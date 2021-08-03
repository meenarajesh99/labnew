<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="header.html"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
<h1>Registration successful!</h1>
<table>
            <tr>
                <td><h3>Welcome ${user.username}</h3></td>
            </tr>
            <tr>
            </tr>
            <tr>
            </tr>
            <tr>
                <td><a href= "${pageContext.request.contextPath}/">Home</a>
                </td>
            </tr>
        </table>

</body>
</html>
<%@ include file="footer.html"%>  