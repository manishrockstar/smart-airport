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
<b>CHOKOLA</b><br><br>
Artisanal chocolate boutique dedicated to handcrafting an inspired range of chocolate indulgences.
<br><br>
<b>LOCATION : T1D</b>
</div>
</center>

<center>
<div id="box">
<b>HALDIRAM'S</b><br><br>
Haldiram's ever-delectable mouth-watering delicacies await you. Traditional sweets, Indian Savouries, Sweets, Chips, Cookies, Nuts and Sherbets are available to buy and fly. An ideal flavour of India to gift or to savour. 
<br><br>

<b>LOCATION : T1D, T3 Domestic - Arrival, T3 Domestic - Departure, T3 International - Arrival, T3 International - Departure</b>

</div>
</center>


</body>
</html>