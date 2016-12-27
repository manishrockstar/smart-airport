<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
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
<div class="inline" id="shop">
<a onclick="goBack()">
<img src="${images}/backk.png" height="60px" width="60px" align="left">
</a>
<center>
<img src="${images}/shopp.jpg" height="190px" width="300px">
<img src="${images}/shop.jpg" height="50%" width="50%">
</center>
</div>

<center>
<div id="box">
<b>CROMA ZIP</b><br><br>

A specialist retail chain for product categories as varied as appliances, entertainment, computers, imaging and communication.  
<br><br>
<b>LOCATION : T1D, T3 Domestic - Departure, T3 International - Departure</b>
</div>
</center>

<center>
<div id="box">
<b>GADGET POINT</b><br><br>
One stop shop for you and your gadget needs. Product categories as varied as appliances, entertainment, computers, imaging and communication.
<br><br>

<b>LOCATION : T3 Domestic - Departure</b>

</div>
</center>

<center>
<div id="box">
<b>SAMSUNG</b><br><br>
In Samsung you discover the latest range of consumer products with cutting-edge technology including TVs, Smartphones, etc. 
<br><br>
<b>LOCATION : T3 Domestic - Arrival </b>
</div>
</center>

</body>
</html>