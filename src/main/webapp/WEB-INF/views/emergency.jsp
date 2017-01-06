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
<div id="info" style="padding:0 40px 0 40px;" class="medical">
<a onclick="goBack()">
<img src="${images}/backk.png" height="60px" width="60px" align="left">
</a>
<center>
<b>The medical unit at Smart International Airport provides the following services:</b><br>
 
<p style="font-size: 0.85em; text-align:justify; padding:20px 40px 20px 40px;">
*First-aid in the event of aircraft / airport emergencies<br>
*First-aid to passengers, visitors and others airport users<br>
*Standby medical services for VVIP/VIPs<br>
*First-aid to employees on-duty of all agencies operating at Cochin Airport<br>
</p> 

<p style="font-size: 0.85em; text-align:justify; padding:20px 40px 20px 40px;">
A medical inspection unit has been established at the airport to render the above services.<br>
The MI Room terminal is manned round the clock, by the Medical Officer and one medical assistant.<br>
The MI room is provided with a bed, medical equipments, sufficient quantity of medical equipments,<br>
medicines, dressing materials and linen.A First Aid Room with all facilities like bed, medicines etc.,<br> 
is available at the fire station to attend to any casualty cases.<br>
First Aid Boxes have been provided at the following locations at the airport for immediate utilization:<br>
*Fire Station<br>
*Ambulance<br>
*Power House<br>
</p>
<br><br>
<img src="${images}/medical.jpg"><br>
</center>
</div>
</body>
</html>