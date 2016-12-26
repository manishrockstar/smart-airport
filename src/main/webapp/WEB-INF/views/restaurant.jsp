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
<center>
<img src="${images}/eat.png" height="190px" width="300px">
<img src="${images}/restaurantt.jpg" height="50%" width="50%">
</center>
</div>
<div class="inlineprop">
<ul id="rig">
   <li>
        <a class="rig-cell1" onclick="location.href='cafebar.html'">
            <img class="rig-img1" src="${images}/cafe.jpg">
            <span class="rig-overlay"></span>
            <span class="rig-text">Cafe & Bar</span>
        </a>
    </li>
    <li>
        <a class="rig-cell1" onclick="location.href='casual.html'">
            <img class="rig-img1" src="${images}/casual.jpg">
            <span class="rig-overlay"></span>
            <span class="rig-text">Casual dining</span>
        </a>
    </li>
    <li>
        <a class="rig-cell1" onclick="location.href='coffee.html'">
            <img class="rig-img1" src="${images}/coffee.jpg">
            <span class="rig-overlay"></span>
            <span class="rig-text">Coffee Shop</span>
        </a>
    </li>
    <li>
        <a class="rig-cell1" onclick="location.href='food.html'">
            <img class="rig-img1" src="${images}/food.jpg">
            <span class="rig-overlay"></span>
            <span class="rig-text">Food Court</span>
        </a>
    </li>
    <li>
        
</ul>
</div>


<a onclick="location.href='/'">
<img src="${images}/back.png" height="80px" width="80px" align="right">
</a>
</body>
</html>