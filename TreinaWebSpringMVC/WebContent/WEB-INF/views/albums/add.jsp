<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:url var="actionAdd" value="/albums/add"></c:url>
<form:form action="${actionAdd}" method="post" modelAttribute="album">
	<div class="row">
		<div class="col-md-6">
			<div class="form-group">
				<label>Nome:</label>
				<form:input path="name" cssClass="form-control" />
				<form:errors path="name" cssStyle="color: red" ></form:errors>
			</div>
		</div>
	</div>

	<div class="row">
		<div class="col-md-6">
			<div class="form-group">
				<label>Ano de Lançamento:</label>
				<form:input path="releaseYear" cssClass="form-control" />
				<form:errors path="releaseYear" cssStyle="color: red" ></form:errors>
			</div>
		</div>
	</div>
	<input type="submit" value="Salvar" class="btn btn-default" />

</form:form>
