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
<img src="${images}/restroom.jpg" height="300px" width="300px">
</center>
</div>

<center>
<div id="box">
<b>RESTROOM</b><br><br>
If you face difficulty in finding the restroom then follow the sign board located at T3 International Departure.
<br><br>
<b>LOCATION : Ground floor,right side,T3 terminal </b>
</div>
</center>


</body>
</html>