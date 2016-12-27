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
<img src="${images}/cafeb.jpg" height="200px" width="600px">
</center>
</div>

<center>
<div id="box">
<b>CONNEXIONS</b><br><br>

Mull over your favourite drink, grab a quick bite, relish a complete continental or Indian meal, or indulge your sweet tooth, all at one versatile café.
 
<br><br>
<b>LOCATION : T3 International - Departure</b>
</div>
</center>


<center>
<div id="box">
<b>GRID BAR</b><br><br>

A classic bar with a cozy ambience welcomes you to T-3. Visitors may choose the luxury of a smoking lounge where they can relax and enjoy a wide variety of International drinks and lip smacking snacks.

<br><br>
<b>LOCATION : T3 Domestic - Departure</b>
</div>
</center>


<center>
<div id="box">
<b>STREET FOOD BY PUNJAB GRILL</b><br><br>

At Street Food by Punjab Grill, we intend to bring the lips smacking street foods/Chaat from various regions along with other well known North & South Indian regional delicacies, Chinese Food cooked in a hygienic way to pamper the taste buds..

<br><br>
<b>LOCATION : T1D</b>
</div>
</center>

</body>
</html>