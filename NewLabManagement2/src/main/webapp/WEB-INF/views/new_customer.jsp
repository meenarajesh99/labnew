<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ include file="header.html"%>     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Customer</title>
</head>
<body>
    <div align="center">
        <h2>New Customer</h2>
        <form:form action="save" method="post" modelAttribute="customer">
            <table border="1" cellpadding="10">
                <tr>
                    <td>Name: </td>
                    <td><form:input path="custName" /></td>
                </tr>
                <tr>
                    <td>DOB: </td>
                    <td><form:input path="custDOB" /></td>
                </tr>
                <tr>
                    <td>Email: </td>
                    <td><form:input path="email" /></td>
                </tr>
                <tr>
                    <td>Address: </td>
                    <td><form:input path="address" /></td>
                </tr> 
                <tr>
                    <td>City: </td>
                    <td><form:input path="city" /></td>
                </tr> 
                <tr>
                    <td>State: </td>
                    <td><form:input path="state" /></td>
                </tr> 
                <tr>
                    <td>Zipcode: </td>
                    <td><form:input path="zipcode" /></td>
                </tr>
                
                <tr>
                    <td colspan="2"><input type="submit" value="Save"></td>
                </tr>                    
            </table>
        </form:form>
        <form action="./"><input type="submit" value="Cancel"></form>
    </div>
</body>
</html>
<%@ include file="footer.html"%>