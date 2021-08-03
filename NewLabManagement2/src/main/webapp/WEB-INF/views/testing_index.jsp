<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ include file="header.html"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TestingServices</title>
</head>
<body>
<div align="center">
	<h3>Testing Services</h3>
	<form method="get" action="search">
        <input type="text" name="keyword" /> &nbsp;
        <input type="submit" value="Search" />
    </form>
	<h3><a href="new">New Test</a></h3>
	<table border="1.5" cellpadding="10">

  
    <tr>
      <th>TestId</th>
      <th>Test Name</th>
      <th>Action</th>
     </tr>
     
        <c:forEach items="${testList}" var="testing">
        <tr>
            <td>${testing.testId}</td>
            <td>${testing.testName}</td>
           
     <td>
      	<a href="edit?testId=${testing.testId}">Edit</a>
                &nbsp;
                <a href="delete?testId=${testing.testId}">Delete</a>
                </td> 
                </tr>
                </c:forEach> 
                </table>
  
  <form action="../"><input type="submit" value="Home"></form>
</div>
</body>
</html>
<%@ include file="footer.html"%>