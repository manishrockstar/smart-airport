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

			
			<form action="signup" method="POST" modelAttribute="user">	
			 <input type="text" id="sname" placeholder="Name" required>

			 <input type="text" id="suname" placeholder="Username" required>

			 <input type="text" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" placeholder="Enter Email id" name="semail" required>
			 <input type="text" pattern="[0-9]{10}" placeholder="Enter 10 digit Mobile Number" name="scontact" required>
			 <input type="password" placeholder="Enter Password" name="psw1" id="psw1" required>

			 <input type="password" placeholder="Re-Enter Password" name="psw2" id="psw2" required>
			 <button type="submit" onclick="myFunction()">Sign up</button>
			</form>
		</div>

</div>
</body>
</html>