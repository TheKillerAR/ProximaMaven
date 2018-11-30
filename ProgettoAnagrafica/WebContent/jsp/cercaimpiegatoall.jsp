<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>


<body>
--------------------------------------------------------------------

			<h4>Ricerca tramite ID</h4>

<form action="ImpiegatoServlet" method="post">
	
	<input type='hidden' name="funzione" value="cercaid">
		
		<h5>Inserisci ID</h5>
		<input type="text" name="id" />
		
		<br><br><input type="submit"value="Conferma" />
		
</form>
		
--------------------------------------------------------------------

<h4>Ricerca tramite Codice Fiscale</h4>

<form action="ImpiegatoServlet" method="post">
	
	<input type='hidden' name="funzione" value="cercacf">
		
		<h5>Inserisci Codice Fiscale</h5>
		<input type="text" name="cf" />
		
		<br><br><input type="submit"value="Conferma" />
		
</form>
		

--------------------------------------------------------------------		
		
 		<h4>Ricerca tramite Nome</h4>
 		
 		<h5>Inserisci Nome</h5>
		
		<form action="ImpiegatoServlet" method="post">
	
	<input type='hidden' name="funzione" value="cercanome">
		
		<input type="text" name="nome" />
		
		<br><br><input type="submit"value="Conferma" />
		
</form>
		
--------------------------------------------------------------------

		<h4>Ricerca tramite Cognome</h4>
		
		<h5>Inserisci Cognome</h5>
		
		<form action="ImpiegatoServlet" method="post">
	
	<input type='hidden' name="funzione" value="cercacognome">
		
		<input type="text" name="cognome" />
		
		<br><br><input type="submit"value="Conferma" />
		
</form>

--------------------------------------------------------------------



<form action="ImpiegatoServlet" method="post">
	
	<input type='hidden' name="funzione" value="mostratutti">
	
	<h5>Premi il tasto per mostrare</h5>
	
	<br><br><input type="submit"value="Mostra" />
</form>
--------------------------------------------------------------------

</body>
</html>