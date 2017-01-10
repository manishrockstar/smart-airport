<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="com.techm.bluemix.smarterairport.utils.SAUtils" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
	
		
		<c:forEach items="${fswrapper}" var="fsWrappers" >	
		
			<c:forEach items="${fsWrappers.flightStatuses}" varStatus="loop">
			
			
		<tr>
			<td><c:out value="${fsWrappers.flightStatuses[loop.index].flightNumber}" /></td>
			<td><c:out value="${fsWrappers.flightStatuses[loop.index].departureAirportFsCode}"/></td>		
			<td><c:out value="${fsWrappers.flightStatuses[loop.index].arrivalAirportFsCode}"/></td>

			<td><c:out value="${fsWrappers.flightStatuses[loop.index].carrierFsCode}"/></td>				
			<%-- <td><c:out value="${fsWrappers.flightStatuses[loop.index].departureDate.dateLocal}"/></td> --%>
			

			<td><img vspace="4px" width="200px" height="45px" src="${fimages}/${fsWrappers.flightStatuses[loop.index].carrierFsCode}.gif"></td>


			<td><c:out value="${fsWrappers.flightStatuses[loop.index].departureDate.dateLocal}"/></td>

			<c:set value="{fsWrappers.flightStatuses[loop.index].departureDate.dateLocal}" var="dateString" />

			<fmt:parseDate value="${dateString}" var="dateObject"
                                      pattern="yyyy/MM/dd - HH:mm:ss" />

			<td><fmt:formatDate value="${dateObject}" pattern="dd/MM/yyyy - hh:mm a" /></td>
			

			<td><c:out value="${fsWrappers.flightStatuses[loop.index].arrivalDate.dateLocal}"/></td>
			<td><c:out value="${fsWrappers.flightStatuses[loop.index].airportResources.departureGate}"/></td>
			<td><c:out value="${fsWrappers.flightStatuses[loop.index].airportResources.arrivalGate}"/></td>
			<td><c:out value="${fsWrappers.flightStatuses[loop.index].airportResources.departureTerminal}"/></td>
			<td><c:out value="${fsWrappers.flightStatuses[loop.index].airportResources.arrivalTerminal}"/></td>
			<td><c:out value="${fsWrappers.flightStatuses[loop.index].status}"/></td>
		</tr>
			</c:forEach>
		
		
		
		</c:forEach>
		

</table>
</center>
</div>




</body>

</html>