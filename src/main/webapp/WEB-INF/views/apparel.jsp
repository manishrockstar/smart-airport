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
<b>ARMANI JEANS</b><br><br>
Armani is an Italian fashion house founded by Giorgio Armani which designs, manufactures, distributes and retails haute couture, ready-to-wear, l<br><br>
<b>LOCATION : T3 International - Departure</b>
</div>
</center>

<center>
<div id="box">
<b>FABINDIA</b><br><br>
Fabindia is an Indian chain store retailing garments, furnishings, fabrics and ethnic products handmade by craftspeople across rural India. The products of Fabindia are mainly sourced from villages helping to provide and sustain rural employment in India. They are currently produced by over 40,000 artisans and craftspeople across India.
<br><br>

<b>LOCATION : T1D</b>

</div>
</center>

<center>
<div id="box">
<b>GINI & JONY</b><br><br>
Gini & Jony is an Indian kid's fashion brand 
<br><br>
<b>LOCATION : T3 Domestic - Departure</b>
</div>
</center>


<center>
<div id="box">
<b>MARKS & SPENCER</b><br><br>
Marks & Spencer, UK's iconic brand, offers a truly international shopping experience at T3. This store showcases a range of products including formals & casual clothing for women and men, kids wear, beauty and lingrie at great value. 
<br><br>
<b>LOCATION : T3 Domestic - Departure</b>
</div>
</center>

<center>
<div id="box">
<b>SATYA PAUL</b><br><br>
The Satya Paul product line comprises women’s designer wears, handbags, clutches and scarves, men’s accessories such as neck ties, belts, wallets, and cufflinks. 
<br><br>
<b>LOCATION : T1D, T3 International - Departure</b>

</div>
</center>

</body>
</html>