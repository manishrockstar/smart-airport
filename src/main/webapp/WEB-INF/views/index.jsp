<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<spring:url value="/resources/css" var="css" />
<spring:url value="/resources/scripts" var="scripts" />
<spring:url value="/resources/images" var="images" />
<title>
Smart Airport
</title>
</head>
<link rel="stylesheet" type="text/css" href="${css}/style.css">
<script src="${scripts}/script.js"></script>
<body bgcolor="#1ECD66">
<div id="fixedheader">
<div id="main" class="inlineprop">
<a onclick="openNav()">&#9776;</a>
<a href="#home">Home</a>
  <a onclick="document.getElementById('id04').style.display='block'">Flight Status</a>
  <a onclick="document.getElementById('id05').style.display='block'">Weather conditions</a> 
  
  <a href="#transport">Transport</a>
</div>
<img id="imgicon" src="${images}/icon.png" height="120px" class="inlineprop">
</div>
<div id="mySidenav" class="sidenav">
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
  <a onclick="document.getElementById('id01').style.display='block'">Sign in</a>
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
  <a onclick="document.getElementById('id02').style.display='block'">Sign up</a>
  <a onclick="document.getElementById('id03').style.display='block'">Contact Us</a>
  <a href="#">About Us</a>
</div>
<div id="id01" class="modal">

  <form class="modal-content animate" action="./signin" method="POST">
    <div class="imgcontainer">
      <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
      <img src="${images}/img_avatar2.png" alt="Avatar" class="avatar">
    </div>

    <div class="container">
      <label><b>Username<font color=red size=2>*</font></b></label>
      <input type="text" placeholder="Enter Username" name="uname" required>

      <label><b>Password<font color=red size=2>*</font></b></label>
      <input type="password" placeholder="Enter Password" name="psw" required>

      <button type="submit">Login</button>
      <input type="checkbox" checked="checked"> Remember me
    </div>

    <div class="container" style="background-color:#f1f1f1">
      <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
      <span class="psw"><a href="#">Forgot Password</a></span>
      <font color=red size=2>*marked fields are mandatory</font>
    </div>
  </form>
</div>

<div id="id02" class="modal">

  <form class="modal-content animate" action="./signup" method="POST">
    <div class="imgcontainer">
      <span onclick="document.getElementById('id02').style.display='none'" class="close" title="Close Modal">&times;</span>
      <img src="${images}/img_avatar2.png" alt="Avatar" class="avatar">
    </div>

    <div class="container">
      <label><b>Name<font color=red>*</font></b></label>
      <input type="text" placeholder="Enter Full Name" name="sname" required>

      <label><b>Username<font color=red>*</font></b></label>
      <input type="text" placeholder="Enter Username" name="suname" required>

      <label><b>Email<font color=red>*</font></b></label>
      <input type="text" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" placeholder="Enter Email id" name="semail" required>

      <label><b>Contact no<font color=red>*</font></b></label>
      <input type="text" pattern="[0-9]{10}" placeholder="Enter 10 digit Mobile Number" name="scontact" required>

      <label><b>Password<font color=red>*</font></b></label>
      <input type="password" placeholder="Enter Password" name="psw1" id="psw1" required>

       <label><b>Re-enter Password<font color=red>*</font></b></label>
      <input type="password" placeholder="Re-Enter Password" name="psw2" id="psw2" required>

      <button type="submit" onclick="myFunction()">Sign up</button>
      <p id="demo"></p>

    </div>

    <div class="container" style="background-color:#f1f1f1">
      <button type="button" onclick="document.getElementById('id02').style.display='none'" class="cancelbtn">Cancel</button>
      <font color=red size=2>*marked fields are mandatory</font>
    </div>
  </form>
</div>

<div id="id03" class="modal">

  <form class="modal-content animate" action="/contactus">
    <div class="imgcontainer">
      <span onclick="document.getElementById('id03').style.display='none'" class="close" title="Close Modal">&times;</span>
      <img src="${images}/img_avatar2.jpg" alt="Avatar" class="avatar">
    </div>

    <div class="container">
      <label><b>Name</b></label>
      <input type="text" placeholder="Enter Name" name="name" required>
      <label><b>Email</b></label>
      <input type="text" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" placeholder="Enter Email id" name="email" required>
      <label><b>Contact no</b></label>
      <input type="text" pattern="[0-9]{10}" placeholder="Enter 10 digit Mobile Number" name="contact" required>

      <label><b>Message</b></label>
      <textarea rows="4" cols="50" placeholder="Enter your message here..." required></textarea>

      <button type="submit" onclick="myFunction()">Submit</button>
      <p id="demo"></p>

    </div>

    <div class="container" style="background-color:#f1f1f1">
      <button type="button" onclick="document.getElementById('id03').style.display='none'" class="cancelbtn">Cancel</button>

    </div>
  </form>
</div>

<div id="id04" class="modal">

  <form class="modal-content animate" method ="GET" action="flight/trackByAirport">
    <div class="imgcontainer">
      <span onclick="document.getElementById('id04').style.display='none'" class="close" title="Close Modal">&times;</span>
      <img src="${images}/flight.gif" alt="Avatar" class="avatar" height="50" width="50">
    </div>


    <div class="container">
    <h3>Flight Information by Airports</h3>

    <input list="airports" name="airports" placeholder="Airport" type="list">
    <datalist id="airports">
         <option value="Atlanta, GA ">
 		 <option value="Chicago, IL - All airports ">
		 <option value="Columbia, MO ">
		 <option value="Dallas/Fort Worth, TX ">
		 <option value="Las Vegas, NV ">
         <option value="Los Angeles, CA ">
        <option value="New York, NY - All airports ">
 		<option value="San Diego, CA ">
 		<option value="San Francisco, CA ">
 		<option value="Washington DC - All airports ">
  </datalist>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="date" name="dat">
<br>
<br>
<select type="list" name="hoursofday">
 <option value="">Select Time(in Hours)</option>
 <option value="0">0000-0400</option>
 <option value="4">0400-0800</option>
 <option value="8">0800-1200</option>
 <option value="12">1200-1600</option>
 <option value="16">1600-2000</option>
 <option value="20">2000-2400</option>
 </select>

  </datalist>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" name="departarrival" value="dep" >Departure
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="departarrival" value="arr">Arrival
&nbsp;
<button style="width:0px;height:0px;background-color:white;">
<img src="${images}/download.jpg" width="30" height="30" border="0">
</button>
    </div>
<br>
<br>
  </form>
</div>

<div id="id05" class="modal">

  <form class="modal-content animate" method ="GET" action="weather/trackbyGeo">
    <div class="imgcontainer">
      <span onclick="document.getElementById('id05').style.display='none'" class="close" title="Close Modal">&times;</span>
      <img src="${images}/weather.jpg" alt="Avatar" class="avatar" height="125" width="150">
    </div>
    <div class="container">
    <h3 align="Center">Weather Status</h3>
    <div align="Center">
    
	<select type="list" name="w_country">
    	<option value="New York">New York</option> 
		<option value="Ottawa">Ottawa</option>
		<option value="London">London</option>
		<option value="Paris">Paris</option>
		<option value="Rome">Rome</option>
		<option value="Moscow">Moscow</option>
		<option value="Mumbai">Mumbai</option>
		<option value="Kathmandu">Kathmandu</option>
		<option value="Beijing">Beijing</option>
		<option value="Tokyo">Tokyo</option>

	</select>



&nbsp;
<button style="width:0px;height:0px;background-color:white;">
<img src="${images}/download.jpg" width="30" height="30" border="0">
</button>
 </div>
    </div>
<br>
<br>
  </form>
</div>

<br/><br/><br/><br/>

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

<div id="contentdiv">
 <p id="cnt1" style="color:#333;text-align: justify; font-family: 'Oswald', sans-serif;"><br>
<b>Our Business</b><br>
We are making every effort to provide passengers with an excellent airport experience.<br><br>
* The Airport<br>
* Airport Authority<br>
* Air Cargo<br>
</p>
</div>
<div class="inlineprop">
<ul id="rig">
    <li>
        <a class="rig-cell" href="#">
            <img class="rig-img" src="${images}/1.jpg">
            <span class="rig-overlay"></span>
            <span class="rig-text">Restrooms</span>
        </a>
    </li>
    <li>
        <a class="rig-cell" href="#">
            <img class="rig-img" src="${images}/2.jpg">
            <span class="rig-overlay"></span>
            <span class="rig-text">Restaurants</span>
        </a>
    </li>
    <li>
        <a class="rig-cell" href="#">
            <img class="rig-img" src="${images}/3.jpg">
            <span class="rig-overlay"></span>
            <span class="rig-text">Shopping</span>
        </a>
    </li>
    <li>
        <a class="rig-cell" href="#">
            <img class="rig-img" src="${images}/4.jpg">
            <span class="rig-overlay"></span>
            <span class="rig-text">Emergency</span>
        </a>
    </li>
</ul>
</div>


<p style="text-align: justify;">
Conlcusions goes here............
<br/><br/><br/>
</p>




<div id="fixedfooter">
<marquee>smartairport.com</marquee></div>



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
