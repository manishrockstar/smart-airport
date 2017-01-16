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
<img src="${images}/cafeb.jpg" height="200px" width="650px">
</center>
</div>

<center>
<div id="box">
<b>BAKERS STREET</b><br><br>
Baker Street is a Premium European style bakery café serving truly Italian Brewed Coffees and hot teas. Opulent dessert like tiramisu and pastries like cheesecakes are also served. 
<br><br>
<b>LOCATION : T1D, T3 Domestic - Arrival </b>
</div>
</center>

<center>
<div id="box">
<b>CAFECCINO</b><br><br>

A perfect hangout enhancing “sipping my coffee” experience. So, walk into this fully stocked coffee bar that serves a combination of many passions – coffee, desserts, food and fun. 
<br><br>
<b>LOCATION : T1 Arrivals, T3 International - Departure </b>
</div>
</center>


<center>
<div id="box">
<b>COSTA COFFEE</b><br><br>

Top notch coffee, the chocolate muffin and Tavoletta are absolute killers. This apart from the usual Cappuccinos, Iced Lattes, Espressos and Mochas.
<br><br>
<b>LOCATION : T1D, T3 Domestic - Arrival, T3 Domestic - Departure, T3 International - Arrival, T3 International - Departure</b>
</div>
</center>


<center>
<div id="box">
<b>MASALA TWIST</b><br><br>
Masla Twist offers a lip smacking selection of North Indian fare with a twist. This includes Kathi rolls, biryanis, paranthas, croissants, Grilled sandwiches with spiced Indian stuffings & much more...
<br><br>
<b>LOCATION : T3 International - Departure </b>
</div>
</center>

<center>
<div id="box">
<b>STARBUCKS</b><br><br>

Starbucks is the premier roaster and retailer of specialty coffee in the world. And with every cup, we strive to bring both our heritage and an exceptional experience to life.

<br><br>
<b>LOCATION : T1D, T3 Domestic - Departure, T3 International - Departure</b>
</div>
</center>


</body>
</html>