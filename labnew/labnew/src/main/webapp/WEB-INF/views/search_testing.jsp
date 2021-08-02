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
    <h2>Testing Services</h2>
    <form method="get" action="../testing/">
        
    </form>
    <table border="1.5" cellpadding="10">

  
    <tr>
      <th>TestId</th>
      <th>Test Name</th>
      
     </tr>
     
        <c:forEach items="${testList}" var="testing">
        <tr>
            <td>${testing.testId}</td>
            <td>${testing.testName}</td>
     
                </tr>
                </c:forEach> 
                </table>
  <br><br>
  
   <form action="../"><input type="submit" value="Home"></form>
   <br><br>
 </div>    
</body>
</html>
<%@ include file="footer.html"%>