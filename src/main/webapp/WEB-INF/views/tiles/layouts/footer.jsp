<<!DOCTYPE div PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<spring:url value="/resources/css" var="css" />
<spring:url value="/resources/scripts" var="scripts" />
<spring:url value="/resources/images" var="images" />

</head>
<link rel="stylesheet" type="text/css" href="${css}/style.css">
<script src="${scripts}/script.js"></script>
<body>

<div id="fixedfooter" class="footer">
<div class="inlineprop"> 
		<center>
		<ul >
			<li>© 2016 Tech Mahindra Limited &nbsp;&nbsp;</li>
		</ul></center>
		</div>
    <img id="imgicon" src="${images}/chaticon.png" height="42px" class="inlineprop" onclick="document.getElementById('id08').style.display='block'" usemap="#planetmap">
    <map name="planetmap">
  <area shape="rect" coords="0,0,270,126" alt="Sun" href="/"></map>
</div>

</body>
</html>

