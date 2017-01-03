<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 <%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container1" id="signupb"> 
		<div class="login-box animated fadeInUp">
			<div class="box-header">

				<h2>Sign Up</h2>

			</div>

			<form:form action="signup" method="POST" modelAttribute="user">	
			 <span onclick="document.getElementById('signupb').style.display='none'" class="close" title="Close Modal">&times;</span>
			 <form:input type="text" path="NAME" name="NAME" placeholder="Name" required />

			 <form:input type="text" path="USERNAME" name="USERNAME" placeholder="Username" required />

			 <form:input type="text" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" placeholder="Enter Email id" path="EMAIL" name="EMAIL" required />
			 <form:input type="text" pattern="[0-9]{10}" placeholder="Enter 10 digit Mobile Number" path="CONTACT" name="CONTACT" required />
			 <form:input type="password" placeholder="Enter Password" path="PASSWORD1" name="PASSWORD" required />

			 <form:input type="password" placeholder="Re-Enter Password" path="PASSWORD" name="PASSWORD" id="PASSWORD" required />
			 <input type="submit" value="Sign up">
			</form:form>
		</div>

</div>
</body>
</html>