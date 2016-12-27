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
<b>Touchdown bar and cafe</b><br><br>
Touchdown bar and cafe is a place that really celebrates Chennai. Step inside and the first thing you see is the easy, relaxed ambience. Like the city, each of CDH outlets is a wonderful mix of different kinds of seating. From cozy booths to chilled out nooks. The walls take this feel further 
<br><br>
<b>LOCATION : T1D </b>
</div>
</center>

</body>
</html>