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
<img src="images/shopp.jpg" height="190px" width="300px">
<img src="images/shop.jpg" height="50%" width="50%">
</center>
</div>
<div class="inlineprop">
<ul id="rig">
    <li>
        <a class="rig-cell1" onclick="location.href='apparel.html'">
            <img class="rig-img1" src="images/apparel.jpg" >
            <span class="rig-overlay"></span>
            <span class="rig-text">Apparel</span>
        </a>
    </li>
    <li>
        <a class="rig-cell1" onclick="location.href='beauty.html'">
            <img class="rig-img1" src="images/beauty.jpg">
            <span class="rig-overlay"></span>
            <span class="rig-text">Beauty & Wellness</span>
        </a>
    </li>
    <li>
        <a class="rig-cell1" onclick="location.href='travel.html'">
            <img class="rig-img1" src="images/travel.jpg">
            <span class="rig-overlay"></span>
            <span class="rig-text">Travel Convenience</span>
        </a>
    </li>
    <li>
        <a class="rig-cell1" onclick="location.href='electronics.html'">
            <img class="rig-img1" src="images/electric.jpg">
            <span class="rig-overlay"></span>
            <span class="rig-text">Electronics</span>
        </a>
    </li>


     <li>
        <a class="rig-cell1" onclick="location.href='fashion.html'">
            <img class="rig-img1" src="images/fashion.jpg" >
            <span class="rig-overlay"></span>
            <span class="rig-text">Fashion & Accesories</span>
        </a>
    </li>
    <li>
        <a class="rig-cell1" onclick="location.href='Jewellery.html'">
            <img class="rig-img1" src="images/jewel.jpg">
            <span class="rig-overlay"></span>
            <span class="rig-text">Jewellery & Gifting</span>
        </a>
    </li>
    <li>
        <a class="rig-cell1" onclick="location.href='packed.html'"">
            <img class="rig-img1" src="images/packed.jpg">
            <span class="rig-overlay"></span>
            <span class="rig-text">Packed food</span>
        </a>
    </li>
    <li>
        <a class="rig-cell1" onclick="location.href='watches.html'">
            <img class="rig-img1" src="images/watch.jpg">
            <span class="rig-overlay"></span>
            <span class="rig-text">Watches & Sunglasses</span>
        </a>
    </li>
    <li>
        <a class="rig-cell1" onclick="location.href='perfumes.html'">
            <img class="rig-img1" src="images/perfumes.jpg">
            <span class="rig-overlay"></span>
            <span class="rig-text">Perfumes & Cosmetics</span>
        </a>
    </li>
    <li>
        <a class="rig-cell1" onclick="location.href='gifts.html'">
            <img class="rig-img1" src="images/gifts.jpg">
            <span class="rig-overlay"></span>
            <span class="rig-text">Gifts</span>
        </a>
    </li>
    <li>
        <a class="rig-cell1" onclick="location.href='toys.html'">
            <img class="rig-img1" src="images/toys.jpg">
            <span class="rig-overlay"></span>
            <span class="rig-text">Toys</span>
        </a>
    </li>
    <li>
        <a class="rig-cell1" onclick="location.href='travel.html'">
            <img class="rig-img1" src="images/travell.jpg">
            <span class="rig-overlay"></span>
            <span class="rig-text">Travel Accesories</span>
        </a>
    </li>
    <li>
        <a class="rig-cell1" onclick="location.href='wine.html'">
            <img class="rig-img1" src="images/wine.jpg">
            <span class="rig-overlay"></span>
            <span class="rig-text">Wine & Spirits</span>
        </a>
    </li>
    <li>
        <a class="rig-cell1" onclick="location.href='books.html'">
            <img class="rig-img1" src="images/books.jpg">
            <span class="rig-overlay"></span>
            <span class="rig-text">Books</span>
        </a>
    </li>
</ul>
</div>

<a onclick="location.href='SmarterAirport.html'">
<img src="images/back.png" height="80px" width="80px" align="right">
</a>
</body>
</html>