<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TreinaWeb Spring MVC - Adding Albums</title>
</head>
<body>
	<c:url var="actionAdd" value="/albums/add"></c:url>
	<form:form action="${actionAdd}" method="post" modelAttribute="album">

		<label>Nome:</label>
		<form:input path="name" />
		<form:errors path="name"></form:errors>
		<br />
		<label>Ano de Lançamento:</label>
		<form:input path="releaseYear" />
		<form:errors path="releaseYear"></form:errors>
		<br />
		<input type="submit" value="Salvar" />

	</form:form>
</body>
</html>