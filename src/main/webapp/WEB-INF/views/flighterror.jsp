<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="com.techm.bluemix.smarterairport.utils.SAUtils" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<spring:url value="/resources/images" var="images" />

<script type="text/javascript">

function nn(){
	
	window.location.href="/";
	alert("Flight details not found");
	
	
}
</script>


<style type="text/css">
.bgimg {
    background-image: url('${images}/wall.jpg');
}
</style>
<body style="background-image:url(${images}/flight.jpg)">


<br>
<br>
<br>
<br>
<br><br>
<br>
<div style="height:100%">
<center>

	<table>
		<tr>
			<td><h2><b>${message}</b></h2></td>
		</tr>
		<tr> <td> <button onclick="/">Ok</button> </td></tr>
	</table>

</center>
</div>

</body>

</html>