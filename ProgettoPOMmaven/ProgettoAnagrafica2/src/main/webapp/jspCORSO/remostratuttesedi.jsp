<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
	<table>
		<c:forEach items="${lisSedi}" var="tmp1">

			<form action="${pageContext.request.contextPath}/SedeServlet" method="post">
			

				<!-- crea la riga-->
				<tr>
					<!-- crea la colonna-->
					<td>${tmp1.idsede}</td>
					<td>${tmp1.nomesede}</td>
					<td>${tmp1.via}</td>
					<td>${tmp1.citta}</td>
					<td>${tmp1.cap}</td>
					</tr>
				
			</form>
		</c:forEach>
	</table>

</body>
</html>

