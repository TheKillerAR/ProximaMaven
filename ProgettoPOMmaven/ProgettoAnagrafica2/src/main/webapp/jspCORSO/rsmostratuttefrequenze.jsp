<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
	<table>
		<c:forEach items="${listaFrequenza}" var="tmp1">

			<form action="${pageContext.request.contextPath}/FrequenzaServlet" method="post">
			

				<!-- crea la riga-->
				<tr>
					<!-- crea la colonna-->
					<td>${tmp1.idfrequenza}</td>
					<td>${tmp1.idedizione}</td>
					<td>${tmp1.idimp}</td>
				</tr>
				
			</form>
		</c:forEach>
	</table>

</body>
</html>