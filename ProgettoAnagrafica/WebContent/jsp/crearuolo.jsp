<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Crea nuovo ruolo</title>
</head>


<body>

	<form action="RuoloServlet" method="post">

		<input type='hidden' name="funzione" value="inserisciruolo">

		<h4>Inserisci nome ruolo</h4>
		<input type="text" name="nomeruolo" />

		<h4>Inserisci stipendio</h4>
		<input type="text" name="stipendio" /> <br>
		<br>
		<input type="submit" value="Conferma" />

</form>
</body>
</html>