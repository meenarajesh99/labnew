<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<link rel="stylesheet" href="css/homePage.css" >
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css"/>
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
 
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css">
 
</head>
<body style="background-color:white">
	<div class="container-fluid">
		<section class="title">
		<nav>
			<div class="menu">
				<div class="logo">
				<a href="#">MedLabs</a>
				</div>
					<ul>
		    	    <li><a href="customer/">Customer</a></li>
			        <li><a href="testing/">Testing</a></li>
			       
			        <li><a href="register">Register</a></li>
			        <li><a href="login/">Login</a></li>
			       	<li><a href="logout/">Logout</a></li>
			       	<li><a href="search/">Search</a></li>
			        </ul>
      		</div>
		</nav>
		</section>
		<!-- HERO -->
		  <section class="hero">
		  	<div class="col-lg=6">
		  		
		  		<h1>Take control of your health</h1>
		  		<article>
		  			<p>Accurate Data with Comprehensive Testing Capabilities</p>
		  			<p>Experience you can trust</p>
		  			<p><button>Contact us</button><p>
		  		</article>
		  	</div>
		    </section>
	<!-- Features -->
	<section id="feature">
		<div class="desc">
			<div class="col-lg-12 ">
				<h5>Mission Statement</h5>
				<p>We look to the future and work tirelessly to test new drugs, treatments and therapies.We believe in harnessing science for human good. So whether you are a provider, drug developer, hospital, medical researcher or patient and when you need trusted information to make clear, confident health decisions, consider us your source.
				Derived from the world's largest database of clinical lab results, our diagnostic insights reveal new avenues to identify and treat disease, inspire healthy behaviors and improve health care management.</p>
			</div>
		</div>
	</section>
	<!-- Contact info -->
	<section id="info">
	<div class="table_info">
		<div class="col-lg-12 ">
		<table style="width:70%">
        <tr>
          <th>Address:</th>
          <th>Telephone</th>
        </tr>
        <tr>
          <td> 180 Sky Drive Pkwy, White Plains, New Jersey 02745</td>
          <td>888-778-9076</td>
        </tr>
      </table>
		</div>
	</div>
	<div class="row">
  <div class="column">
    <img src="images/lab1.jpg" alt="lab1" style="width:100%">
  </div>
  <div class="column">
    <img src="images/labtesting.jpg" alt="labtesting" style="width:100%">
  </div>
  <div class="column">
    <img src="images/lab6.jpg" alt="lab6" style="width:100%">
  </div>
</div>
	</section>
	</div>
	<section id="updates">
	<div class= "feature">
		<div class="col-lg-6">
		<ul>
			<li><a href="#">Updates for COVID-19</a></li>
			<li><a href="#">Privacy Policy</a></li>
			<li><a href="#">Contact Us</a></li>
		</ul>
		</div>
	</div>
	</section>
	<div>
	<section id="flex">
	<div class="footer">
	<div class="col-lg-12">
      <div class="flex_container"></div>
	      <div class = "social-icon" ><a href="#" class="fa fa-facebook"></a></div>
	      <div class = "social-icon" ><a href="#" class="fa fa-twitter"></a></div>
	      <div class = "social-icon" ><a href="#" class="fa fa-linkedin"></a></div>
	      <div class = "social-icon" ><a href="#" class="fa fa-instagram"></a></div>
	      <div class = "social-icon" ><a href="#" class="fa fa-youtube"></a></div>
	      <br>
	      <p><span>&#169;</span> Copyright 2021-2023  MedLabs. All Rights Reserved. MedLabs performs laboratory testing for all patients and does not discriminate based on race, color, national origin,
	      sex, age, disability or gender identity.</p>
	      
	      
      </div>
      </div>
      </section>
    </div>
	
 </body>
</html>