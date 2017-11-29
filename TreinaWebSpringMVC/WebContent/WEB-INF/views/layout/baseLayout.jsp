<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><tiles:insertAttribute name="title" ignore="true"></tiles:insertAttribute></title>
<!-- representação de Repositorio virtual -->
<spring:url value="/resources/css/bootstrap.min.css" var="bootstrapCSS"></spring:url>
<link rel="stylesheet" href="${bootstrapCSS}" />

<spring:url value="/resources/js/popper.min.js" var="popperJS"></spring:url>
<script type="text/javascript" src="${popperJS}"></script>

<spring:url value="/resources/js/jquery-3.2.1.min.js" var="jqueryJS"></spring:url>
<script type="text/javascript" src="${jqueryJS}"></script>

<spring:url value="/resources/js/bootstrap.min.js" var="bootstrapJS"></spring:url>
<script type="text/javascript" src="${bootstrapJS}"></script>

</head>
<body>
	<div style="width: 100%">
		<tiles:insertAttribute name="header" ignore="false"></tiles:insertAttribute>
	</div>
	<div style="width: 100%; margin: 2%">
		<tiles:insertAttribute name="body" ignore="false"></tiles:insertAttribute>
	</div>
	<div style="width: 100%">
		<tiles:insertAttribute name="footer" ignore="false"></tiles:insertAttribute>
	</div>
</body>
</html>