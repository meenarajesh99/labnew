<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ include file="header.html"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
<script src="${pageContext.request.contextPath}/resources/scripts/validate.js" type="text/javascript" ></script> 
<link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}//resources/css/register.css" rel="stylesheet">

</head>


<body>
<div class="container">


    <h1>Register</h1>
    <p>Please fill in this form to create an account.</p>
    <br>
    
   <form name="register" method="POST"  onsubmit = "return validateUser()">
    <div class="user-details">
      <div class="row simple-input">
         <div class="col-lg-5 col-md-4 col-sm-4 borders p-0">

         <input class="simple-input" name="name" type="text" id="name" value placeholder="Name" required>
       	 </div>
        
        	<div class="emptySpace10"></div>

        <input class="simple-input" name="email" type="text" id="email" value placeholder="Email" required>
        <div class="emptySpace10"></div>
        <input class="simple-input" name="username" type="text" id="username" value placeholder="Enter your username" required>
        <div class="emptySpace10"></div>
        <input class="simple-input" name="password" type="text" id="password" value placeholder="Enter your password" required>
        <div class="emptySpace10"></div>
        <input class="simple-input" name="cpassword" type="text" id="cpassword" value placeholder="Confirm password" required>
        <div class="emptySpace10">
        </div>
      </div>
      </div>
      
    
   <button type="submit" value="Submit" id="button">Register</button>
</form>
  </div>
    
  
  <div class="container signin">
    <p>Already have an account? <a href= "${pageContext.request.contextPath}/login">Sign in</a></p>
  </div>

</form>

</body>

</html>
 <%@ include file="footer.html"%> 