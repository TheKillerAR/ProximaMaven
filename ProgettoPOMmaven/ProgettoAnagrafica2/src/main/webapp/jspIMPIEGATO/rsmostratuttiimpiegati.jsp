<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
	<table>
		<c:forEach items="${listaImp}" var="tmp1">

			<form action="${pageContext.request.contextPath}/ImpiegatoServlet" method="post">
			

				<!-- crea la riga-->
				<tr>
					<!-- crea la colonna-->
					<td>${tmp1.id}</td>
					<td>${tmp1.cf}</td>
					<td>${tmp1.nome}</td>
					<td>${tmp1.cognome}</td>
				</tr>
				
			</form>
		</c:forEach>
	</table>

</body>
</html>