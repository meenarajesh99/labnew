<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="header.html"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search All</title>
</head>
<body>
<div align="center">
    <h2>Search Customer By Name</h2>
    <form method="get" action="/search">
        <input type="text" name="keyword" /> &nbsp;
        <input type="submit" value="Search" />
        
    </form>
    </div>
 <br><br><br>
 <div align="center">
    
    
    <br><br>
    <form action="../"><input type="submit" value="Home"></form>
    <br><br>
    </div>
</body>
</html>
<%@ include file="footer.html"%>