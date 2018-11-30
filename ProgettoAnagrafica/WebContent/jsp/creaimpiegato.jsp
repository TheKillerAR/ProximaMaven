<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Crea nuovo impiegato</title>
</head>


<body>

<form action="ImpiegatoServlet" method="post">
	
	<input type='hidden' name="funzione" value="inserisci">
		
		<h4>Inserisci nome</h4>
		<input type="text" name="nome" /> 
		
		<h4>Inserisci cognome</h4>
		<input type="text" name="cognome" />
		
		<h4>Inserisci codice fiscale</h4>
		<input type="text" name="cf" /> 
		
		<br><br><input type="submit"value="Conferma" />

</form>
</body>
</html>