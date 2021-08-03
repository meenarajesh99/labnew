<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ include file="header.html"%>        
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Tests</title>
</head>
<body>
    <div align="center">
        <h2>Edit Tests</h2>
        <form:form action="update" method="post" modelAttribute="testing">
            <table border="0" cellpadding="5">
                <tr>
                    <td>Test ID </td>
                    <td>${testing.testId}
                        <form:hidden path="testId"/>
                    </td>
                </tr>        
                <tr>
                    <td>Test Name: </td>
                    <td><form:input path="testName" /></td>
                </tr>
                
                <tr>
                    <td colspan="2"><input type="submit" value="Save"></td>
                </tr>                    
            </table>
        </form:form>
    </div>
</body>
</html>
<%@ include file="footer.html"%>