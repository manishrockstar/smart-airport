<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

    
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
<body >
<div style="background-color:#131F2D;">
	<div style="width:800px; height:200px margin:0 auto;">
		<table align="center">
			<tr>
				<td>
					<img src="${images}/logo_small.png" style="margin-top:3px;"/>
				</td>
				<td nowrap="nowrap">
					<span style="font-size:14pt; color:white; padding:0 8px;">Smart Airport Weather Status Update</span>
				</td>
				<td width="100%">
				</td>
				<td align="right">
					
				</td>
			</tr>
		</table>
	</div>
</div>

<div>
	<table align="center" style="width:50%">	
		<tr>
			<td><center><h1><b>${wswrapper.observation.obs_name}</b> Current Weather Status</h1></center></td>
			
			
		</tr>
	</table>
</div>
<div style="background-color:#0080c0; height:250px;">
	<table align="center" border="1" style="width:60% height:90%">
	
	
		<tr>
			<td align="left" valign="top" width="60%" style="color:white;">
				<table cellspacing="0" cellpadding="0" border="0" width="50px" height="200px" style="padding:10px; border-radius:10px;">
					<tr>
					<td align="left"><h2>Temperature <b>${wswrapper.observation.temp} &#176; C</b></h2></td>
					<td align="right">
						<table cellspacing="0" cellpadding="0" border="0" width="50px" height="200px" style="padding:10px; border-radius:10px;">
						<tr>
							<td><img src="${wimages}/icon${wswrapper.observation.wx_icon}.png" alt="Avatar" class="avatar"></td>
							<td><h2><b>${wswrapper.observation.wx_phrase}</b></h2></td>
						</tr>
						</table>
					</td>
					</tr>
				</table>
			</td>
			<td align="right" valign="top" width="40%" style="font-family:Arial; font-size:11pt; ">&nbsp;
				<table cellspacing="0" cellpadding="0" border="0" width="100%" height="180px" style="padding:10px;">
				
					
					<tr>	
						<td align="left" style="color:white;">Wind</td>
						<td align="right" style="color:white;">${wswrapper.observation.wdir_cardinal}  ${wswrapper.observation.wspd} KPH</td>
					</tr>
					<tr>
						<td align="left" style="color:white;">Humidity</td>
						<td align="right" style="color:white;">${wswrapper.observation.rh} %</td>
					</tr>
					<tr>
						<td align="left" style="color:white;">UV Index</td>
						<td align="right" style="color:white;">${wswrapper.observation.uv_index} out of 10</td>
					</tr>
					<tr>
						<td align="left" style="color:white;">Heat </td>
						<td align="right" style="color:white;">${wswrapper.observation.heat_index}</td>
					</tr>
					<tr>
						<td align="left" style="color:white;">UV Description</td>
						<td align="right" style="color:white;">${wswrapper.observation.uv_desc}</td>
					</tr>
					<tr>
						<td align="left" style="color:white;">Pressure</td>
						<td align="right" style="color:white;">${wswrapper.observation.pressure}</td>
					</tr>
				
				
				</table>
			</td>
		</tr>
	</table>
</div>


			
			
</body>
</html>