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
<html>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<spring:url value="/resources/images" var="images" />
<spring:url value="/resources/fimages" var="fimages" />


<body style="background-image:url(${images}/flight.jpg); background-repeat: no-repeat; background-attachment: fixed;">

<div style="height:100%">
<center>
<c:forEach items="${fswrapper}" var="fsWrappers" varStatus="ite">
<fmt:parseDate value="${fsWrappers.flightStatuses[ite.index].departureDate.dateLocal}" pattern="yyyy-MM-dd'T'HH:mm:ss.SSS" var="HDate" />

		<div style="background-color:black; color:white; width:954px">

				<h2> Flight Status as on <fmt:formatDate value="${HDate}" pattern="EEE MMM dd yyyy" /></h2>

			</div>
<table border="3px" padding="1px" id="t01">
	
	<tr>
			<th align="center">Flight Number</th>
			<th align="center">Departure</th>
			<th align="center">Arrival</th>
			<th align="center">Airlines</th>
			<th align="center">Departure Time</th>
			<th align="center">Arrival Time</th>
			<th align="center">Departure Gate</th>
			<th align="center">Arrival Gate</th>
			<th align="center">Departure Terminal</th>
			<th align="center">Arrival Terminal</th>
			<th align="center">Status</th>
	</tr>
	
	
					<c:forEach items="${fsWrappers.flightStatuses}" varStatus="loop">
			
			
		<tr>
			<td><c:out value="${fsWrappers.flightStatuses[loop.index].flightNumber}" /></td>
			<td><c:out value="${fsWrappers.flightStatuses[loop.index].departureAirportFsCode}"/></td>		
			<td><c:out value="${fsWrappers.flightStatuses[loop.index].arrivalAirportFsCode}"/></td>

							
			<%-- <td><c:out value="${fsWrappers.flightStatuses[loop.index].departureDate.dateLocal}"/></td> --%>
			

			<td><img vspace="4px" width="200px" height="45px" src="${fimages}/${fsWrappers.flightStatuses[loop.index].carrierFsCode}.gif"></td>


			

			<fmt:parseDate value="${fsWrappers.flightStatuses[loop.index].departureDate.dateLocal}" pattern="yyyy-MM-dd'T'HH:mm:ss.SSS" var="departureDate" />
			<fmt:parseDate value="${fsWrappers.flightStatuses[loop.index].arrivalDate.dateLocal}" pattern="yyyy-MM-dd'T'HH:mm:ss.SSS" var="arrivalDate" />
			<td><fmt:formatDate value="${departureDate}" pattern="hh:mm a" /></td>
			

			<!--<td><fmt:formatDate value="${arrivalDate}" pattern="dd/MM/yyyy - hh:mm a" /></td>-->
			<td><fmt:formatDate value="${arrivalDate}" pattern="hh:mm a" /> </td>
			<td><c:out value="${fsWrappers.flightStatuses[loop.index].airportResources.departureGate}"/></td>
			<td><c:out value="${fsWrappers.flightStatuses[loop.index].airportResources.arrivalGate}"/></td>
			<td><c:out value="${fsWrappers.flightStatuses[loop.index].airportResources.departureTerminal}"/></td>
			<td><c:out value="${fsWrappers.flightStatuses[loop.index].airportResources.arrivalTerminal}"/></td>
			<td><c:out value="${fsWrappers.flightStatuses[loop.index].status}"/></td>
		</tr>
			</c:forEach>
		
		
		
		
		

</table>

</c:forEach>
</center>
</div>




</body>

</html>