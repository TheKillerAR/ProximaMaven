<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
	<table>
		<c:forEach items="${listaEdizioni}" var="tmp1">

			<form action="${pageContext.request.contextPath}/EdizioneServlet" method="post">
			

				<!-- crea la riga-->
				<tr>
					<!-- crea la colonna-->
					<td>${tmp1.idedizione}</td>
					<td>${tmp1.numero}</td>
					<td>${tmp1.idcorso}</td>
					<td>${tmp1.idsede}</td>
					<td>${tmp1.iddocente}</td>
					<td>${tmp1.datain}</td>
					<td>${tmp1.datafi}</td>
				</tr>
				
			</form>
		</c:forEach>
	</table>

</body>
</html>