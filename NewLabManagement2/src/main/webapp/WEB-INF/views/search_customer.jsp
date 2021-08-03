<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ include file="header.html"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Result</title>
</head>
<body>
<div align="center">
    <h2>Search Result</h2>
    <table border="1" cellpadding="5">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>DOB</th>
            <th>E-mail</th>
            <th>Address</th>
            <th>City</th>
            <th>State</th>
            <th>Zipcode</th>
            <th>Test ID</th>
            <th>Test Name</th>
            
        </tr>
        <c:forEach items="${result}" var="customer">
        <tr>
            <td>${customer.custID}</td>
            <td>${customer.custName}</td>
            <td>${customer.custDOB}</td>
            <td>${customer.email}</td>
            <td>${customer.address}</td>
            <td>${customer.city}</td>
            <td>${customer.state}</td>
            <td>${customer.zipcode}</td>
            <c:forEach items="${assignList}" var="testing">
            <td>${testing.testId}</td>
            <td>${testing.testName}</td>
            
            </c:forEach>
         </tr>
        </c:forEach>
        
    </table>
    <br><br><br>
     <form action="../"><input type="submit" value="Home"></form>
     <br><br><br><br><br><br>
</div>   
</body>
</html>
<%@ include file="footer.html"%>