<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="com.techm.bluemix.smarterairport.utils.SAUtils" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
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
	
			<center><h1>Smart Airport Weather Forecasting - ${msg} Airport</h1></center>
		
</div>
<c:forEach items="${wfwrapper}" var="wfWrappers" varStatus="ite">
<div style="background-color:#0080c0; height:250px;">
<c:choose>
<c:when test= "${not empty wfWrappers.forecasts[ite.index].max_temp}">
	<table align="center" style="width:800px; height:250px">
	
		<tr>
			<td>
			<table align="center" style="width:800px; height:100%">
			<tr>
			<td style="align:left" valign="top" width="300px" style="color:white;">
				<table cellspacing="0" cellpadding="0" border="0" height="200px" style="padding:10px; width:100%; border-radius:10px;">
						
						<tr>
						<td><center><h3>${wfWrappers.forecasts[ite.index].dow}<br>						
						<fmt:parseDate value="${wfWrappers.forecasts[ite.index].fcst_valid_local}" pattern="yyyy-MM-dd'T'HH:mm:ssZ" var="HDate" />
						<fmt:formatDate value="${HDate}" pattern="MMM dd,yyyy" /></h3></center>
						</td>
						</tr>
						<tr>
							<td><center><h1><b>${wfWrappers.forecasts[ite.index].max_temp} &#176; C</b></h1></center></td>
						</tr>
						<tr>
							<td style="align:center">${wfWrappers.forecasts[ite.index].narrative}</td>
						</tr>
						
						
				</table>
				</td>
			
			<td style="align:center" valign="top" width="300px" style="color:white;">
				<table cellspacing="0" cellpadding="0" border="0"  height="200px" style="padding:10px; width:100%; border-radius:10px;">
						<tr>
							<td style="align:center"><img vspace="4px" width="200px" height="200px" src="${wimages}/icon${wfWrappers.forecasts[ite.index].day.icon_code}.png"></td>
						</tr>
						
				</table>
			</td>
					
			<td style="align:right" valign="top" width="200px" style="font-family:Arial; font-size:11pt; ">&nbsp;
				<table cellspacing="0" cellpadding="0" border="0" width="100%" height="200px" style="padding:10px; width:100%;">
				
					<tr>
						<td style="align:left" style="color:white;">Min Temp</td>
						<td style="align:right" style="color:white;">${wfWrappers.forecasts[ite.index].min_temp}&#176; C</td>
					</tr>
					
					<tr>	
						<td style="align:left" style="color:white;">Wind</td>
						<td style="align:right" style="color:white;">${wfWrappers.forecasts[ite.index].day.wdir_cardinal}  ${wfWrappers.forecasts[ite.index].day.wspd} KPH</td>
					</tr>
					<tr>
						<td style="align:left" style="color:white;">Humidity</td>
						<td style="align:right" style="color:white;">${wfWrappers.forecasts[ite.index].day.rh} %</td>
					</tr>
					<tr>
						<td style="align:left" style="color:white;">UV Index</td>
						<td style="align:right" style="color:white;">${wfWrappers.forecasts[ite.index].day.uv_index} out of 10</td>
					</tr>
					
					<tr>
						<td style="align:left" style="color:white;">UV Description</td>
						<td style="align:right" style="color:white;">${wfWrappers.forecasts[ite.index].day.uv_desc}</td>
					</tr>			
				</table>
			</td>
			</tr>
			</table>
			</td>
		</tr>
	</table>
</c:when>
<c:otherwise>
	<table align="center" border="0" style="width:100%" height="250px">
	
		<tr>
			<td>
			<table align="center" style="width:800px; height:100%">
			<tr>
			<td style="align:left" valign="top" width="300px" style="color:white;">
				<table cellspacing="0" cellpadding="0" border="0" height="200px" style="padding:10px; width:100%; border-radius:10px;">
						
						<tr>
						<td><center><h3>${wfWrappers.forecasts[ite.index].dow}<br>						
						<fmt:parseDate value="${wfWrappers.forecasts[ite.index].fcst_valid_local}" pattern="yyyy-MM-dd'T'HH:mm:ssZ" var="HDate" />
						<fmt:formatDate value="${HDate}" pattern="MMM dd,yyyy" /></h3></center>
						</td>
						</tr>
						<tr>
							<td><center><h1><b>${wfWrappers.forecasts[ite.index].night.hi} &#176; C</b></h1></center></td>
						</tr>
						<tr>
							<td>${wfWrappers.forecasts[ite.index].night.narrative}</td>
						</tr>
						
						
				</table>
				</td>
			
			<td style="align:center" valign="top" width="300px" style="color:white;">
				<table cellspacing="0" cellpadding="0" border="0"  height="200px" style="padding:10px; border-radius:10px; width:100%;">
						<tr>
							<td><img vspace="4px" width="200px" height="200px" src="${wimages}/icon${wfWrappers.forecasts[ite.index].night.icon_code}.png"></td>
						</tr>
						
				</table>
			</td>
					
			<td style="align:right" valign="top" width="200px" style="font-family:Arial; font-size:11pt; ">&nbsp;
				<table cellspacing="0" cellpadding="0" border="0"  height="200px" style="padding:10px; width:100%;">
				
					<tr>
						<td style="align:left" style="color:white;">Min Temp</td>
						<td style="align:right" style="color:white;">${wfWrappers.forecasts[ite.index].min_temp}&#176; C</td>
					</tr>
					
					<tr>	
						<td style="align:left" style="color:white;">Wind</td>
						<td style="align:right" style="color:white;">${wfWrappers.forecasts[ite.index].night.wdir_cardinal}  ${wfWrappers.forecasts[ite.index].night.wspd} KPH</td>
					</tr>
					<tr>
						<td style="align:left" style="color:white;">Humidity</td>
						<td style="align:right" style="color:white;">${wfWrappers.forecasts[ite.index].night.rh} %</td>
					</tr>
					<tr>
						<td style="align:left" style="color:white;">UV Index</td>
						<td style="align:right" style="color:white;">${wfWrappers.forecasts[ite.index].night.uv_index} out of 10</td>
					</tr>
					
					<tr>
						<td style="align:left" style="color:white;">UV Description</td>
						<td style="align:right" style="color:white;">${wfWrappers.forecasts[ite.index].night.uv_desc}</td>
					</tr>			
				</table>
			</td>
			</tr>
			</table>
			</td>
		</tr>
	</table>
</c:otherwise>
</c:choose>
</div>
<div style="background-color:#6DA9C3;">
	<table align="center" border="1" style="width:800px">

			<c:forEach items="${wfWrappers.forecasts}" varStatus="loop">
			<c:if test="${not loop.first}">	
		<tr>
			<td>
			<table cellspacing="0" cellpadding="0" border="0"  height="100px" style="width:800px; padding:10px; border-radius:10px;">
				<tr>
				<td style="align:left" valign="top" width="120px" style="font-family:Arial; font-size:11pt; ">
					<table cellspacing="0" cellpadding="0" border="0" height="100px" style="width:100% padding:10px; border-radius:10px;">
						<tr>
							<td style="align:center"><h3><c:out value="${wfWrappers.forecasts[loop.index].dow}" /><br>						
						<fmt:parseDate value="${wfWrappers.forecasts[loop.index].fcst_valid_local}" pattern="yyyy-MM-dd'T'HH:mm:ssZ" var="RDate" />
						<fmt:formatDate value="${RDate}" pattern="MMM dd,yyyy" /></h3></td>
						</tr>
					</table>
				</td>
				<td style="align:center" valign="top" width="340px" style="font-family:Arial; font-size:11pt; ">
					<table cellspacing="0" cellpadding="0" border="0" height="100px" style="width:100% padding:10px; border-radius:10px;">
						<tr>
							<td style="align:left" valign="top" width="30%" style="font-family:Arial; font-size:11pt; ">
							<table>
								<tr style="height:60%">
									<td style="align:center"><img vspace="4px" width="75px" height="75px" src="${wimages}/icon<c:out value="${wfWrappers.forecasts[loop.index].day.icon_code}" />.png"></td>
								</tr>
								<tr style="height:40%; text-align:center;">
									<td><h3><c:out value="${wfWrappers.forecasts[loop.index].day.hi}" />&#176; / <c:out value="${wfWrappers.forecasts[loop.index].min_temp}" />&#176;</h3></td>
								</tr>
							</table>
							</td>
							<td style="align:right" valign="top" width="70%" style="font-family:Arial; font-size:11pt; ">
								<c:out value="${wfWrappers.forecasts[loop.index].day.narrative}" />
							</td>
						</tr>
					</table>
				</td>
				<td style="align:right" valign="top" width="340px" style="font-family:Arial; font-size:11pt; ">
					<table cellspacing="0" cellpadding="0" border="0" height="100px" style="width:100% padding:10px; border-radius:10px;">
						<tr>
							<td style="align:left" valign="top" width="30%" style="font-family:Arial; font-size:11pt; ">
							<table>
								<tr style="height:60%">
									<td style="align:center"><img vspace="4px" width="75px" height="75px" src="${wimages}/icon<c:out value="${wfWrappers.forecasts[loop.index].night.icon_code}" />.png"></td>
								</tr>
								<tr style="height:40%; text-align:center;">
									<td><h3><c:out value="${wfWrappers.forecasts[loop.index].night.hi}" />&#176; / <c:out value="${wfWrappers.forecasts[loop.index].min_temp}" />&#176;</h3></td>
								</tr>
							</table>
							</td>
							<td style="align:right" valign="top" width="70%" style="font-family:Arial; font-size:11pt; ">
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

</body>
</html>