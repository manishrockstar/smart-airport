<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Smarter Airport</title>
<script>
function statuscheck(str)
{
	var s=str;
	if (s=="S"){
		var status="Scheduled";
	}
	return status;
}

</script>
</head>
<body>
<table border="1" align="center" style="width:50%">
	<thead>
		<tr>
			<th>Destination</th>
			<th>Airlines</th>
			<th>Flight</th>
			<th>Departure Time</th>
			<th>Departure Gate</th>
			<th>Arrival Gate</th>
			<th>Arrival Terminal</th>
			<th>Status</th>
		</tr>
	</thead>
	
	<tbody>
		
		<c:forEach var="fsWrappers" items="${list}" varStatus="loop">
		<tr>
			<td><c:out value="${fsWrappers[loop.index].flightStatuses[loop.index].flightId}" /></td>
			<td><c:out value="${fsWrappers[loop.index].flightStatuses[loop.index].carrierFsCode}"/></td>
			<td><c:out value="${fsWrappers[loop.index].flightStatuses[loop.index].arrivalAirportFsCode}"/></td>
			<!-- <td><fmt:formatDate type="date" value="${fsW.flightStatuses.departureDate.dateLocal}"/></td> -->
			<td><c:out value="${fsWrappers[loop.index].flightStatuses[loop.index].departureDate.dateLocal}"/></td>
			<td><c:out value="${fsWrappers[loop.index].flightStatuses[loop.index].airportResources.departureGate}"/></td>
			<td><c:out value="${fsWrappers[loop.index].flightStatuses[loop.index].airportResources.arrivalGate}"/></td>
			<td><c:out value="${fsWrappers[loop.index].flightStatuses[loop.index].airportResources.arrivalTerminal}"/></td>
			<td><c:out value="${fsWrappers[loop.index].flightStatuses[loop.index].status}"/></td>
		</tr>
		</c:forEach>
	</tbody>

</table>
</body>
</html>