<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
	<table>
		<c:forEach items="${listaImp}" var="tmp1">

			<td><form:form class="form-horizontal" method="POST"
					action="Deleteimpiegato" modelAttribute="ImpForm">
					
					<input type="hidden" name="id" value="${tmp1.id}" />
					
					<input type="submit" value="Cancella" class="btn btn-danger btn-sm">
				
				</form:form></td>

			<form:form class="form-horizontal" method="POST"
				action="Searchidimpiegato" modelAttribute="impForm">


				<!-- crea la riga-->
				<tr>
					<!-- crea la colonna-->
					<td>${tmp1.id}</td>
					<td>${tmp1.cf}</td>
					<td>${tmp1.nome}</td>
					<td>${tmp1.cognome}</td>
				</tr>

			</form:form>
		</c:forEach>
	</table>

</body>
</html>