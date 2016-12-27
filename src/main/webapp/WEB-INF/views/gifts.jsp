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
<b>INDIAN DELITE</b><br><br>
An ideal blend of the traditional and contemporary Indian gifts & souvenirs 
<br><br>
<b>LOCATION : T3 International - Departure</b>
</div>
</center>

<center>
<div id="box">
<b>MAD IN INDIA</b><br><br>

MAD IN INDIA offer lifestyle products that truly capture the essence of India and its sub culture 

<br><br>

<b>LOCATION : T3 International - Departure</b>

</div>
</center>

</body>
</html>