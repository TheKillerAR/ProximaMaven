<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>


<body>

<h2>Inserisci nuovo corso</h2>

<form action="CorsoServlet" method="post">
	
	<input type='hidden' name="funzione" value="inserisci">
		
		<h4>Inserisci descrizione</h4>
		<input type="text" name="descrizione" />
				
		<br><br><input type="submit"value="Conferma" />

<h2>Crea nuovo corso</h2>
	
	<input type='hidden' name="funzione" value="aggiorna">
		
		<h4>Inserisci descrizione</h4>
		<input type="text" name="descrizione" /> 		
		
		<br><br><input type="submit"value="Conferma" />

<h2>Cerca corso</h2>
	
	<input type='hidden' name="funzione" value="cercaid">	
	
		<h4>Inserisci l' id del corso</h4>
		<input type="text" name="idcorso" />
		
		<br><br><input type="submit"value="Conferma" />

	

</form>
</body>
</html>