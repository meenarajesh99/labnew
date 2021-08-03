<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ include file="header.html"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer</title>
</head>
<body>
<div align="center">
    <h2>Customer</h2>
    <form method="get" action="search">
        <input type="text" name="keyword" /> &nbsp;
        <input type="submit" value="Search" />
    </form>
    <h3><a href="new">New Customer</a></h3>
    <table border="1" cellpadding="10">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>DOB</th>
            <th>E-mail</th>
            <th>Address</th>
            <th>City</th>
            <th>State</th>
            <th>ZipCode</th>
            
            <th>Action</th>
        </tr>
        <c:forEach items="${listCustomer}" var="customer">
        <tr>
            <td>${customer.custID}</td>
            <td>${customer.custName}</td>
            <td>${customer.custDOB}</td>
            <td>${customer.email}</td>
            <td>${customer.address}</td>
            <td>${customer.city}</td>
            <td>${customer.state}</td>
            <td>${customer.zipcode}</td>
            <td>
          	
                <a href="edit?custID=${customer.custID}">Edit</a>
                &nbsp;
                <a href="assign?custID=${customer.custID}">Add Tests</a>
                &nbsp;
                <a href="delete?custID=${customer.custID}">Delete</a>
            </td>
         </tr>
          </c:forEach>
     </table>
    <form action="../"><input type="submit" value="Home"></form>
</div>   
</body>
</html>
<%@ include file="footer.html"%>