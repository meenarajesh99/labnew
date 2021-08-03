<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ include file="header.html"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Assign</title>
</head>
<body>
<div align="center">
    <h2>Select test for ${customer.custName}</h2>
 
    <table border="1" style="border-collapse: separate; border-spacing: 5px;">
        <tr>
            <th>Test ID</th>
            <th>Test Name</th>
            <th></th>
        </tr>
        
        <c:forEach items="${testList}" var="testing">
        <tr>
            <td>${testing.testId}</td>
            <td>${testing.testName}</td>
            <td><input type="radio" name="rbutton" value="${testing.testId}"></td>
            <td>
              <a href="assign_test_to_cust?custID=${customer.custID}&testId=${testing.testId}"><input type="submit" value="Add"></a> 
            </td>
        </tr>
       </c:forEach>
       
         
    </table>
   
  	
    <br>
    <br>
    
     
     
     <br>
     <br>
    <form action="../"><input type="submit" value="Home"></form>
    

    
    <br><br><br><br>
</div>
</body>
</html>
<%@ include file="footer.html"%>
