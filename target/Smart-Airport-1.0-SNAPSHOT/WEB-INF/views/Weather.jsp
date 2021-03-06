<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<spring:url value="/resources/css" var="css" />
<spring:url value="/resources/scripts" var="scripts" />
<spring:url value="/resources/images" var="images" />
<html>
<head>
	<title>Weather Company Data Demo App</title>
	<link rel="shortcut icon" href="images/twc_favicon.png" />
  	<link href='main.css' media='screen' rel='stylesheet' type='text/css'/>
</head>
<body onload="init()" style="background-color:#B7D2DD; margin:0; font-family:Arial; color:white;">

<!-- header -->
<div style="background-color:#131F2D;">
	<div style="width:800px; margin:0 auto;">
		<table>
			<tr>
				<td>
					<img src="${images}/logo_small.png" style="margin-top:3px;"/>
				</td>
				<td nowrap="nowrap">
					<span style="font-size:14pt; padding:0 8px;">Smart Airport Weather Update</span>
				</td>
				<td width="100%">
				</td>
				<td align="right">
					
				</td>
			</tr>
		</table>
	</div>
</div>

<!-- location bar -->
<div style="background-color:#263F5D; font-size:10pt; color:white;">
	<form name="weather_form">
		<table style="width:800px; height:70px; margin:0 auto;">
			<tr>
				<td>
					<select id="weather_presets" name="weather_presets" style="width:200px; height:40px; margin:0px; background-color:#B7D2DD; font-size:14pt; font-weight:bold;" onchange="setLocation(this.options[this.selectedIndex].value)">
						<option value="42.34,-75.18">New York</option> 
						<option value="45.43,-75.68">Ottawa</option>
						<option value="51.51,0.13">London</option>
						<option value="48.85,2.35">Paris</option>
						<option value="41.90,12.50">Rome</option>
						<option value="55.75,37.61">Moscow</option>
						<option value="18.97,72.83">Mumbai</option>
						<option value="27.70,85.33">Kathmandu</option>
						<option value="39.91,116.38">Beijing</option>
						<option value="35.68,139.68">Tokyo</option>
					</select>
				</td>
				<td>
					<table>
						<tr>
							<td>
								<label for="weather_latitude">Latitude:</label>
							</td>
							<td>
								<input id="weather_latitude" name="weather_latitude" value="" style="width:100px; background-color:#B7D2DD;" onblur="setCoordinates()"/>
							</td>
						</tr>
						<tr>
							<td>
								<label for="weather_longitude">Longitude:</label>
							</td>
							<td>
								<input id="weather_longitude" name="weather_longitude" value="" style="width:100px; background-color:#B7D2DD;" onblur="setCoordinates()"/>
							</td>
						</tr>
					</table>
				</td>
				<td align="right">
					<table>
						<tr>
							<td>
								<label for="weather_units">Units:</label>
							</td>
							<td>
								<select id="weather_units" name="weather_units" style="width:100px; margin:0px; background-color:#B7D2DD;" onchange="setUnits(this.options[this.selectedIndex].value)">
									<option value="m">Metric</option>
									<option value="e">Imperial</option>
									<option value="h">Hybrid-UK</option>
								</select>
							</td>
						</tr>
						<tr>
							<td>
								<label for="weather_language">Language:</label>
							</td>
							<td>
								<select id="weather_language" name="weather_language" style="width:100px; margin:0px; background-color:#B7D2DD;" onchange="setLanguage(this.options[this.selectedIndex].value)">
									<option value="en">English</option>
									<option value="fr">French</option>
									<option value="de">German</option>
									<option value="es">Spanish</option>
									<option value="it">Italian</option>
									<option value="ar">Arabic</option>
									<option value="bn">Bengali</option>
									<option value="ca">Catalan</option>
									<option value="cs">Czech</option>
									<option value="da">Danish</option>
									<option value="el">Greek</option>
									<option value="fa">Persian</option>
									<option value="fi">Finnish</option>
									<option value="he">Hebrew</option>
									<option value="hi">Hindi</option>
									<option value="hr">Croatian</option>
									<option value="hu">Hungarian</option>
									<option value="in">Indonesian</option>
									<option value="iw">Hebrew</option>
									<option value="ja">Japanese</option>
									<option value="kk">Kazakh</option>
									<option value="ko">Korean</option>
									<option value="ms">Malay</option>
									<option value="nl">Dutch</option>
								</select>
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</form>
</div>

<!-- Today display -->
<div style="background-color:#2A688D; height:200px;">
	<div id="daily_throbber" style="width:120px; height:200px; margin:0 auto; display:none;">
		<img width="120px" height="120px" vspace="40px" src="images/throbber_3.gif"/>
	</div>
	<div id="daily_error" style="width:500px; height:200px; margin:0 auto; font-size:14pt; font-weight:bold; text-align:center; color:#800000; display:none; padding-top:20px;">
	</div>
	<table id="weather_display" style="width:800px; height:200px; margin:0 auto; display:none;" cellspacing="0" cellpadding="0" border="0" width="800px" height="200px">
		<tr>
			<td align="left" valign="top" width="200px" style="color:white;">
				<table cellspacing="0" cellpadding="0" border="0" width="50px" height="200px" style="padding:10px; border-radius:10px;">
					<tr>
						<td align="center" width="100%" style="">
							<span id="weather_dow" style="font-family:Arial; font-size:18pt; white-space:nowrap;"></span>
						</td>
					</tr>
					<tr>
						<td align="center" width="100%" style="white-space:nowrap;">
							<span id="weather_date" style="font-family:Arial; font-size:14pt; white-space:nowrap;"></span>
						</td>
					</tr>
					<tr>
						<td id="weather_icon" align="center">
						</td>
					</tr>
					<tr>
						<td colspan="2" align="center" height="30px" style="color:white; white-space:nowrap;">
							<span id="weather_desc" style="font-family:Arial; font-size:18pt; text-shadow: -1px 0 black, 0 1px black, 1px 0 black, 0 -1px black;"></span>
						</td>
					</tr>
				</table>
			</td>
			<td align="center" valign="top" width="400px">
				<div style="width:200px; height:35px; color:white; margin-top:20px;">
					<span id="weather_temp" style="font-family:Arial; font-size:50pt; text-shadow: -1px 0 black, 0 1px black, 1px 0 black, 0 -1px black;"></span>

			</td>
			<td align="right" valign="top" width="200px" style="font-family:Arial; font-size:11pt; ">&nbsp;
				<table cellspacing="0" cellpadding="0" border="0" width="200px" height="180px" style="padding:10px;">
					<tr>
						<td align="left" style="color:white;">Wind</td>
						<td id="weather_wind" align="right" style="color:white;"></td>
					</tr>
					<tr>
						<td align="left" style="color:white;">Humidity</td>
						<td id="weather_humidity" align="right" style="color:white;"></td>
					</tr>
					<tr>
						<td align="left" style="color:white;">UV Index</td>
						<td id="weather_uv" align="right" style="color:white;"></td>
					</tr>
					<tr>
						<td align="left" style="color:white;">Sunrise </td>
						<td id="weather_sunrise" align="right" style="color:white;"></td>
					</tr>
					<tr>
						<td align="left" style="color:white;">Sunset</td>
						<td id="weather_sunset" align="right" style="color:white;"></td>
					</tr>
					<tr>
						<td align="left" style="color:white;">Moonrise</td>
						<td id="weather_moonrise" align="right" style="color:white;"></td>
					</tr>
					<tr>
						<td align="left" style="color:white;">Moonset</td>
						<td id="weather_moonset" align="right" style="color:white;"></td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
</div>

<!-- hourly display -->
<div style="background-color:#6DA9C3;">
	<div id="hourly_throbber" style="width:50px; height:80px; margin:0 auto; display:none;">
		<img width="50px" height="50px" vspace="15px" src="images/throbber_3.gif" style=""/>
	</div>
	<div id="hourly_error" style="width:500px; height:80px; margin:0 auto; font-size:14pt; font-weight:bold;  text-align:center; color:#800000; display:none; padding-top:20px;">
	</div>
	<div id="weather_hourly" style="width:800px; height:80px; margin:0 auto; padding:5px; display:none;">
	</div>
	<div id="weather_hourly_json" style="width:800px; margin:0 auto;">
	</div>
</div>

<!-- daily display -->
<div style="background-color:#B7D2DD; margin-bottom:50px">
	<div id="weather_daily" style="width:800px; margin:0 auto; padding:5px;">
	</div>
</div>

<script src="//code.jquery.com/jquery-2.1.3.min.js" type="text/javascript"></script>
<script src="main.js"></script>
</body>
</html>