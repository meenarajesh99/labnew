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
    <h2>Search Testing</h2>
    <form method="get" action="../testing/search/">
        <input type="text" name="keyword" /> &nbsp;
        <input type="submit" value="Search" />
        
    </form>
    </div>
<div align="center">
    <h2>Search Result</h2>
    <table border="1" cellpadding="5">
        <tr>
            
            <th>Test ID</th>
            <th>Test Name</th>
            
        </tr>
        
        <tr>
            
            <c:forEach items="${result}" var="testing">
            <td>${testing.testId}</td>
            <td>${testing.testName}</td>
            </c:forEach>
        </tr>
       
    </table>
</div>   
</body>
</html>
<%@ include file="footer.html"%>