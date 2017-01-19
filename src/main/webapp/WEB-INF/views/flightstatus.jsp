<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="com.techm.bluemix.smarterairport.utils.SAProp" %>

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
			<th>Flight Number</th>
			<th>Departure</th>
			<th>Arrival</th>
			<th>Airlines</th>
			<th>Departure Time</th>
			<th>Arrival Time</th>
			<th>Departure Gate</th>
			<th>Arrival Gate</th>
			<th>Departure Terminal</th>
			<th>Arrival Terminal</th>
			<th>Status</th>
	</tr>
	
	
					<c:forEach items="${fsWrappers.flightStatuses}" varStatus="loop">
			
			
		<tr>
		<c:choose>
    		<c:when test="${fn:contains(fsWrappers.flightStatuses[loop.index].carrierFsCode, '*')}">
			<td style="width:80px"><c:out value="${fn:replace(fsWrappers.flightStatuses[loop.index].carrierFsCode, '*', '')}"/>-<c:out value="${fsWrappers.flightStatuses[loop.index].flightNumber}" /></td>
			</c:when>
			<c:otherwise>
			<td style="width:80px"><c:out value="${fsWrappers.flightStatuses[loop.index].carrierFsCode}"/>-<c:out value="${fsWrappers.flightStatuses[loop.index].flightNumber}" /></td>
			</c:otherwise>
			</c:choose>
			<c:set var="dep" value="${fsWrappers.flightStatuses[loop.index].departureAirportFsCode}"/>
			<c:set var="arr" value="${fsWrappers.flightStatuses[loop.index].arrivalAirportFsCode}"/>
			<fmt:bundle basename="airport">
			<td style="width:110px"><fmt:message key="${fsWrappers.flightStatuses[loop.index].departureAirportFsCode}"/></td>		
			<td style="width:110px"><fmt:message key="${fsWrappers.flightStatuses[loop.index].arrivalAirportFsCode}"/></td>
			
							
			<%-- <td><c:out value="${fsWrappers.flightStatuses[loop.index].departureDate.dateLocal}"/></td> --%>
			
			<c:set var="fscode" value="${fn:replace(fsWrappers.flightStatuses[loop.index].carrierFsCode, '*', '')}"/>
			<td><img style="padding-top:10px;padding-bottom:10px;width:150px;height:50px;" src="${fimages}/${fscode}.gif"></td>

			


			

			<fmt:parseDate value="${fsWrappers.flightStatuses[loop.index].departureDate.dateLocal}" pattern="yyyy-MM-dd'T'HH:mm:ss.SSS" var="departureDate" />
			<fmt:parseDate value="${fsWrappers.flightStatuses[loop.index].arrivalDate.dateLocal}" pattern="yyyy-MM-dd'T'HH:mm:ss.SSS" var="arrivalDate" />
			<td style="width:110px"><fmt:formatDate value="${departureDate}" pattern="hh:mm a" /></td>
			

			<!--<td><fmt:formatDate value="${arrivalDate}" pattern="dd/MM/yyyy - hh:mm a" /></td>-->
			<td style="width:110px"><fmt:formatDate value="${arrivalDate}" pattern="hh:mm a" /> </td>
			<td style="width:110px"><c:out value="${fsWrappers.flightStatuses[loop.index].airportResources.departureGate}"/></td>
			<td style="width:110px"><c:out value="${fsWrappers.flightStatuses[loop.index].airportResources.arrivalGate}"/></td>
			<td style="width:110px"><c:out value="${fsWrappers.flightStatuses[loop.index].airportResources.departureTerminal}"/></td>
			<td style="width:110px"><c:out value="${fsWrappers.flightStatuses[loop.index].airportResources.arrivalTerminal}"/></td>
			<td style="width:110px"><fmt:message key="${fsWrappers.flightStatuses[loop.index].status}"/></td>
			</fmt:bundle>
		</tr>
			</c:forEach>
		
		
		
		
		

</table>

</c:forEach>
</center>
</div>




</body>

</html>