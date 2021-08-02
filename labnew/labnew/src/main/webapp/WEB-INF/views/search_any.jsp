<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    <%@ include file="header.html"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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