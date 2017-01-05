<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<spring:url value="/resources/css" var="css" />
<spring:url value="/resources/scripts" var="scripts" />
<spring:url value="/resources/images" var="images" />
<spring:url value="/resources/wimages" var="wimages" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Smarter Airport</title>

</head>
<body bgcolor="#DFE2DB">

<div style="width:50% height:50px">
	
			<center><h1>Smart Airport Weather Forecasting - ${Country}</h1></center>
		
</div>
<c:forEach items="${wfwrapper}" var="wfWrappers" varStatus="ite">
<div style="background-color:#0080c0; height:250px;">
<c:if test="${not empty wfWrappers.forecasts[ite.index].max_temp}">
	<table align="center" border="1" style="width:60%" height="250px">
	
		<tr>
			<td>
			<table align="center" style="width:70% height:100%">
			<tr>
			<td align="left" valign="top" width="30%" style="color:white;">
				<table cellspacing="0" cellpadding="0" border="0" height="200px" style="padding:10px; border-radius:10px;">
						
						<tr>
						<td><center><h3>${wfWrappers.forecasts[ite.index].dow}</h3></center></td>
						</tr>
						<tr>
							<td><center><h1><b>${wfWrappers.forecasts[ite.index].max_temp} &#176; C</b></h1></center></td>
						</tr>
						<tr>
							<td>${wfWrappers.forecasts[ite.index].narrative}</td>
						</tr>
						
						
				</table>
				</td>
			
			<td align="center" valign="top" width="30%" style="color:white;">
				<table cellspacing="0" cellpadding="0" border="0"  height="200px" style="padding:10px; border-radius:10px;">
						<tr>
							<td><img vspace="4px" width="200px" height="200px" src="${wimages}/icon${wfWrappers.forecasts[ite.index].day.icon_code}.png"></td>
						</tr>
						
				</table>
			</td>
					
			<td align="right" valign="top" width="20%" style="font-family:Arial; font-size:11pt; ">&nbsp;
				<table cellspacing="0" cellpadding="0" border="0" width="100%" height="180px" style="padding:10px;">
				
					<tr>
						<td align="left" style="color:white;">Min Temp</td>
						<td align="right" style="color:white;">${wfWrappers.forecasts[ite.index].min_temp}&#176; C</td>
					</tr>
					
					<tr>	
						<td align="left" style="color:white;">Wind</td>
						<td align="right" style="color:white;">${wfWrappers.forecasts[ite.index].day.wdir_cardinal}  ${wfWrappers.forecasts[ite.index].day.wspd} KPH</td>
					</tr>
					<tr>
						<td align="left" style="color:white;">Humidity</td>
						<td align="right" style="color:white;">${wfWrappers.forecasts[ite.index].day.rh} %</td>
					</tr>
					<tr>
						<td align="left" style="color:white;">UV Index</td>
						<td align="right" style="color:white;">${wfWrappers.forecasts[ite.index].day.uv_index} out of 10</td>
					</tr>
					
					<tr>
						<td align="left" style="color:white;">UV Description</td>
						<td align="right" style="color:white;">${wfWrappers.forecasts[ite.index].day.uv_desc}</td>
					</tr>			
				</table>
			</td>
			</tr>
			</table>
			</td>
		</tr>
	</table>
</c:if>
<c:if test="${empty wfWrappers.forecasts[ite.index].max_temp}">
	<table align="center" border="1" style="width:60%" height="250px">
	
		<tr>
			<td>
			<table align="center" style="width:60% height:90%">
			<tr>
			<td align="left" valign="top" width="30%" style="color:white;">
				<table cellspacing="0" cellpadding="0" border="0" height="200px" style="padding:10px; border-radius:10px;">
						
						<tr>
						<td><center><h3>${wfWrappers.forecasts[ite.index].night.dow}</h3></center></td>
						</tr>
						<tr>
							<td><center><h1><b>${wfWrappers.forecasts[ite.index].night.max_temp} &#176; C</b></h1></center></td>
						</tr>
						<tr>
							<td>${wfWrappers.forecasts[ite.index].night.narrative}</td>
						</tr>
						
						
				</table>
				</td>
			
			<td align="center" valign="top" width="30%" style="color:white;">
				<table cellspacing="0" cellpadding="0" border="0"  height="200px" style="padding:10px; border-radius:10px;">
						<tr>
							<td><img vspace="4px" width="200px" height="200px" src="${wimages}/icon${wfWrappers.forecasts[ite.index].night.icon_code}.png"></td>
						</tr>
						
				</table>
			</td>
					
			<td align="right" valign="top" width="20%" style="font-family:Arial; font-size:11pt; ">&nbsp;
				<table cellspacing="0" cellpadding="0" border="0" width="100%" height="180px" style="padding:10px;">
				
					<tr>
						<td align="left" style="color:white;">Min Temp</td>
						<td align="right" style="color:white;">${wfWrappers.forecasts[ite.index].night.min_temp}&#176; C</td>
					</tr>
					
					<tr>	
						<td align="left" style="color:white;">Wind</td>
						<td align="right" style="color:white;">${wfWrappers.forecasts[ite.index].night.wdir_cardinal}  ${wfWrappers.forecasts[ite.index].night.wspd} KPH</td>
					</tr>
					<tr>
						<td align="left" style="color:white;">Humidity</td>
						<td align="right" style="color:white;">${wfWrappers.forecasts[ite.index].night.rh} %</td>
					</tr>
					<tr>
						<td align="left" style="color:white;">UV Index</td>
						<td align="right" style="color:white;">${wfWrappers.forecasts[ite.index].night.uv_index} out of 10</td>
					</tr>
					
					<tr>
						<td align="left" style="color:white;">UV Description</td>
						<td align="right" style="color:white;">${wfWrappers.forecasts[ite.index].night.uv_desc}</td>
					</tr>			
				</table>
			</td>
			</tr>
			</table>
			</td>
		</tr>
	</table>
</c:if>
</div>
<div style="background-color:#6DA9C3;">
	<table align="center" border="1" style="width:60%">

			<c:forEach items="${wfWrappers.forecasts}" varStatus="loop">
			<c:if test="${not loop.first}">
		<tr>
			<td>
			<table cellspacing="0" cellpadding="0" border="0"  height="100px" style="width:100%; padding:10px; border-radius:10px;">
				<tr>
				<td align="left" valign="top" width="20%" style="font-family:Arial; font-size:11pt; ">
					<table cellspacing="0" cellpadding="0" border="0" height="100px" style="width:100% padding:10px; border-radius:10px;">
						<tr>
							<td><h3><c:out value="${wfWrappers.forecasts[loop.index].dow}" /></h3></td>
						</tr>
					</table>
				</td>
				<td align="center" valign="top" width="40%" style="font-family:Arial; font-size:11pt; ">
					<table cellspacing="0" cellpadding="0" border="0" height="100px" style="width:100% padding:10px; border-radius:10px;">
						<tr>
							<td align="left" valign="top" width="30%" style="font-family:Arial; font-size:11pt; ">
							<table>
								<tr style="height:60%">
									<td><img vspace="4px" width="75px" height="75px" src="${wimages}/icon<c:out value="${wfWrappers.forecasts[loop.index].day.icon_code}" />.png"></td>
								</tr>
								<tr style="height:40%">
									<td><h3><c:out value="${wfWrappers.forecasts[loop.index].day.hi}" />&#176; / <c:out value="${wfWrappers.forecasts[loop.index].min_temp}" />&#176;</h3></td>
								</tr>
							</table>
							</td>
							<td align="right" valign="top" width="70%" style="font-family:Arial; font-size:11pt; ">
								<c:out value="${wfWrappers.forecasts[loop.index].day.narrative}" />
							</td>
						</tr>
					</table>
				</td>
				<td align="right" valign="top" width="40%" style="font-family:Arial; font-size:11pt; ">
					<table cellspacing="0" cellpadding="0" border="0" height="100px" style="width:100% padding:10px; border-radius:10px;">
						<tr>
							<td align="left" valign="top" width="30%" style="font-family:Arial; font-size:11pt; ">
							<table>
								<tr style="height:60%">
									<td><img vspace="4px" width="75px" height="75px" src="${wimages}/icon<c:out value="${wfWrappers.forecasts[loop.index].night.icon_code}" />.png"></td>
								</tr>
								<tr style="height:40%">
									<td><h3><c:out value="${wfWrappers.forecasts[loop.index].night.hi}" />&#176; / <c:out value="${wfWrappers.forecasts[loop.index].min_temp}" />&#176;</h3></td>
								</tr>
							</table>
							</td>
							<td align="right" valign="top" width="70%" style="font-family:Arial; font-size:11pt; ">
								<c:out value="${wfWrappers.forecasts[loop.index].night.narrative}" />
							</td>
						</tr>
					</table>
				</td>
				</tr>
			</table>					
			</td>
		</tr>
		</c:if>
		</c:forEach>
	
	</table>
</div>

</c:forEach>
<script>
var slideIndex = 1;
showDivs(slideIndex);

function plusDivs(n) {
  showDivs(slideIndex += n);
}

function currentDiv(n) {
  showDivs(slideIndex = n);
}

function showDivs(n) {
  var i;
  var x = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("demo");
  if (n > x.length) {slideIndex = 1}    
  if (n < 1) {slideIndex = x.length}
  for (i = 0; i < x.length; i++) {
     x[i].style.display = "none";  
  }
  for (i = 0; i < dots.length; i++) {
     dots[i].className = dots[i].className.replace(" w3-white", "");
  }
  x[slideIndex-1].style.display = "block";  
  dots[slideIndex-1].className += " w3-white";
}

var myIndex = 0;
carousel();
function carousel() {
    var i;
    var x = document.getElementsByClassName("mySlides");
    for (i = 0; i < x.length; i++) {
       x[i].style.display = "none";  
    }
    myIndex++;
    if (myIndex > x.length) {myIndex = 1}    
    x[myIndex-1].style.display = "block";  
    setTimeout(carousel, 2000); // Change image every 2 seconds
}
</script>			
			
</body>
</html>