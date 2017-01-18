<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<spring:url value="/resources/css" var="css" />
	<spring:url value="/resources/scripts" var="scripts" />
	<spring:url value="/resources/images" var="images" />
<link rel="stylesheet" type="text/css" href="${css}/style.css">
<script src="${scripts}/script.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Smart Airport</title>
<link rel="shortcut icon" href="${images}/head.ico"/>
<script src="${scripts}/script.js"></script>
</head>

<body>
        
            <div style="height:70px"><tiles:insertAttribute name="header" /></div>
        
           <div style="float:left;width:100%;height:700px; ">   <tiles:insertAttribute name="body" /></div>
        
      
            <div id="fixedfooter"><tiles:insertAttribute name="footer" /></div>
        
</body>
</html>