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
<div id="fixedfooter">
<center>Copyright reserved � 2016 Tech Mahindra Limited</center>
 <img id="imgicon" src="${images}/chaticon.png" height="42px" class="inlineprop" onclick="document.getElementById('id08').style.display='block'">
</div>

<div id="id08">
	
	
    <div class="imgcontainer1">
      <span onclick="document.getElementById('id08').style.display='none'" class="closeme" title="Close Modal" style="color:#333">&times;</span>
      </div>
      
 		<iframe id="idxx" src="https://smartairport-conversation.mybluemix.net/dist/index.html" frameborder="0" ></iframe>
 	
 	
</div>
</body>
</html>

