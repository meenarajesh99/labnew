<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ include file="header.html"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link href="${pageContext.request.contextPath}/resources/css/login.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/resources/scripts/validate.js"></script> 
</head>
<body> 
</head>
<body>

<h2>Login Form</h2>
<div>
  <form action="../customer/search?keyword=username" method="post" onclick="validateUser()>
<div class="container">
    <label ><b>User Name</b></label><br>
    <input type="text"  name="username" id="username" placeholder="Enter your Username" required /br>

</div>
	<div>
    <label ><b>Password</b></label><br>
    <input type="password"  name="password" id="password" placeholder="Enter Your Password" required><br><br>
    </div>
          
  <div class="container" style="background-color:#FFEFD5">
   
    <input type="submit" name="login" value="Login"> 
    
  </div>
  


</body>
</html>
<%@ include file="footer.html"%>  