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
<b>RELAY</b><br><br>

RELAY is the world’s leading brand in Books, Press and Traveler Convenience by LS Travel Retail. It has a worldwide network of stores across 20 countries.

Relay is known all over the world as an efficient and recognizable store dedicated to travellers. Relay stores fulfill the needs of travellers, providing them with products and services in a customer friendly environment, making their journeys more enjoyable.

RELAY offers customers a perfect mix of International and National brands in Drinks, Snacks, Books, Magazines, Travel Accessories, Stationery and Souvenirs.


<br><br>
<b>LOCATION : T1 Arrivals, T1D, T3 Domestic - Departure</b>
</div>
</center>

<center>
<div id="box">
<b>WH SMITH</b><br><br>

A newspaper, magazine, drink or snack, all your travel essentials. Pick up a bestseller or stock up on supplies, the convenient way to start a journey.


<br><br>

<b>LOCATION : T3 Domestic - Arrival, T3 Domestic - Departure, T3 International - Arrival, T3 International - Departure</b>

</div>
</center>

</body>
</html>