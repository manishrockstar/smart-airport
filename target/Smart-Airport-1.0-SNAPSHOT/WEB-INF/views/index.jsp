<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 <%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<spring:url value="/resources/css" var="css" />
<spring:url value="/resources/scripts" var="scripts" />
<spring:url value="/resources/images" var="images" />
</head>
<link rel="stylesheet" type="text/css" href="${css}/style.css">
<script src="${scripts}/script.js"></script>
<body bgcolor="#DFE2DB">



<div class="inlineprop" id="leftdiv">
  <img class="mySlides" src="${images}/1.jpg">
  <img class="mySlides" src="${images}/2.jpg">
  <img class="mySlides" src="${images}/3.jpg">
 <img class="mySlides" src="${images}/4.jpg">
  <img class="mySlides" src="${images}/5.png">
  <img class="mySlides" src="${images}/6.jpg">
 <img class="mySlides" src="${images}/7.jpg">
    <span class="w3-badge demo w3-border w3-transparent w3-hover-white" onclick="currentDiv(1)"></span>
    <span class="w3-badge demo w3-border w3-transparent w3-hover-white" onclick="currentDiv(2)"></span>
    <span class="w3-badge demo w3-border w3-transparent w3-hover-white" onclick="currentDiv(3)"></span>
    <span class="w3-badge demo w3-border w3-transparent w3-hover-white" onclick="currentDiv(4)"></span>
    <span class="w3-badge demo w3-border w3-transparent w3-hover-white" onclick="currentDiv(5)"></span>
    <span class="w3-badge demo w3-border w3-transparent w3-hover-white" onclick="currentDiv(6)"></span>
     <span class="w3-badge demo w3-border w3-transparent w3-hover-white" onclick="currentDiv(7)"></span>
</div>



<div class="inlineprop">
	<div id="contentdiv" class="container1">
		<div class="login-box animated fadeInUp">

			<div class="box-header">

				<h2> Smart Airport </h2>

			</div>

			<form:form action="signin" method="POST" modelAttribute="user" commandName="user">	
			<label>Username</label>

			<br/>
			<form:input type="text" placeholder="Enter Username" path="USERNAME" name="USERNAME" required />			
			<br/>
			<label>Password</label>

			<br/>
			<form:input type="password" placeholder="Enter Password" path="PASSWORD" name="PASSWORD" required />
			<br/>
			<input type="submit" value="Sign In">

			<a href="#"><p class="small">Forgot your password?</p></a>
			<a onclick="document.getElementById('signupb').style.display='block'"><p class="small">New User? Signup Now</p></a>
			</form:form>
		</div>

	</div>
</div>

<div class="container1" id="signupb"> 
		<div class="login-box animated fadeInUp">
			<div class="box-header">

				<h2>Sign Up</h2>

			</div>

			<form:form action="signup" method="POST" modelAttribute="user" commandName="user">	
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

<div class="inlineprop">
<ul id="rig">
    <li>
        <a class="rig-cell" href="restroom">
            <img class="rig-img" src="${images}/restt.jpg" >
            <span class="rig-overlay"></span>
            <span class="rig-text">Restrooms</span>
        </a>
    </li>
    <li>
        <a class="rig-cell" href="restaurant">
            <img class="rig-img" src="${images}/restaur.jpg">
            <span class="rig-overlay"></span>
            <span class="rig-text">Restaurants</span>
        </a>
    </li>
    <li>
        <a class="rig-cell" href="shopping">
            <img class="rig-img" src="${images}/3.jpg">
            <span class="rig-overlay"></span>
            <span class="rig-text">Shopping</span>
        </a>
    </li>
    <li>
        <a class="rig-cell" href="emergency">
            <img class="rig-img" src="${images}/emerg.jpg">
            <span class="rig-overlay"></span>
            <span class="rig-text">Emergency</span>
        </a>
    </li>
</ul>
</div>


<script>
var slideIndex = 1;
showDivs(slideIndex);

function plusDivs(n) {
  showDivs(slideIndex += n);
}

function currentDiv(n) {
  showDivs(slideIndex = n);
}

function showDivs(n) {
  var i;
  var x = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("demo");
  if (n > x.length) {slideIndex = 1}    
  if (n < 1) {slideIndex = x.length}
  for (i = 0; i < x.length; i++) {
     x[i].style.display = "none";  
  }
  for (i = 0; i < dots.length; i++) {
     dots[i].className = dots[i].className.replace(" w3-white", "");
  }
  x[slideIndex-1].style.display = "block";  
  dots[slideIndex-1].className += " w3-white";
}

var myIndex = 0;
carousel();
function carousel() {
    var i;
    var x = document.getElementsByClassName("mySlides");
    for (i = 0; i < x.length; i++) {
       x[i].style.display = "none";  
    }
    myIndex++;
    if (myIndex > x.length) {myIndex = 1}    
    x[myIndex-1].style.display = "block";  
    setTimeout(carousel, 2000); // Change image every 2 seconds
}
</script>

</body>
</html>