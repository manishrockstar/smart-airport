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
<b>FOREST ESSENTIALS</b><br><br>

India's leading Ayurveda Company offers Natural and Organic Treatment for Skin, Hair and Body Care 

<br><br>
<b>LOCATION : T1D</b>
</div>
</center>

<center>
<div id="box">
<b>MAC</b><br><br>
Offering a large selection of professional quality makeup must-haves for All Ages, All Races, 
<br><br>
<b>LOCATION : T1D</b>

</div>
</center>

<center>
<div id="box">
<b>NYKAA.COM</b><br><br>

Nykaa is the Number One Beauty destination in India with half a million happy customers depending on us not just for their favorite brands but also for advice, updates and expert tips on how to look and feel gorgeous always! 

<br><br>
<b>LOCATION : T3 Domestic - Departure</b>
</div>
</center>


<center>
<div id="box">
<b>PARCOS</b><br><br>
Parcos is India’s leading perfumery store with a scintillating array of international brands in a beautiful ambience. Parcos presents quality service with the allure of fascinating range of beauty products, further augmented by the sheer luxury offered.  
<br><br>
<b>LOCATION : T1 Arrivals, T1D, T3 International - Arrival</b>
</div>
</center>

<center>
<div id="box">
<b>THE BODY SHOP</b><br><br>
The original, natural and ethical cosmetics company, that provides a wide range of products across Skin Care, Bath & Body, Make Up, Hair, Fragrance, with over 1,200 products and gifts.
<br><br>
<b>LOCATION : T3 Domestic - Departure, T3 International - Departure</b>

</div>
</center>

</body>
</html>