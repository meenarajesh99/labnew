<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
 
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>

	<jsp:param name="title" value="Admin Privileges" />

<body>
	
	
	<section id="content" class="d-flex justify-content-center">
		<div class="container">
			<div align="center">
				<img class="error-img" src="images/AccessDenied403.png" alt="Image Not Found" style="width:50%" />
				<h2>Sorry, you do not have permission to view this page.</h2>
				<p>Click <a href="/">here</a> to go back to the Home page.</p>
			</div>
		</div>
	</section>
	
	
</body>
</html>
