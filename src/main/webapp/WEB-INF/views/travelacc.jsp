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
<b>BASECAMP</b><br><br>

A specialist shop for everything you need in for trekking and mountaineering. 
<br><br>
<b>LOCATION : T3 Check in</b>
</div>
</center>

<center>
<div id="box">
<b>SAMSONITE</b><br><br>

Samsonite has continued to leverage its craftsmanship and heritage as an innovator, to create unique solutions for the sophisticated traveler. By identifying trends and interpreting travelers’ needs, Samsonite continues to infuse innovation and new ideas into travel, re-igniting the sophistication and experience of the past with Samsonite Black Label 

<br><br>

<b>LOCATION : T1D, T3 Domestic - Departure, T3 International - Departure</b>

</div>
</center>

<center>
<div id="box">
<b>TRAVEL GOODS</b><br><br>

Travel Goods is the most widely distributed range of travel accessories. It is just as committed to bring innovative products to market. 
 
<br><br>
<b>LOCATION : T3 Check in</b>
</div>
</center>

</body>
</html>