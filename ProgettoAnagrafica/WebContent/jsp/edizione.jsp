<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>


<body>

<h2>Inserisci nuova edizione</h2>

<form action="EdizioneServlet" method="post">
	
	<input type='hidden' name="funzione" value="inserisci">
		
		<h4>Inserisci numero</h4>
		<input type="text" name="numero" />
		
		<h4>Inserisci l' id del corso</h4>
		<input type="text" name="idcorso" /> 
		
		<h4>Inserisci l'id della sede</h4>
		<input type="text" name="idsede" /> 
		
		<h4>Inserisci l' id del docente</h4>
		<input type="text" name="iddocente" /> 
		
		<h4>Inserisci la data di inizio edizione</h4>
		<input type="text" name="datain" /> 
		
		<h4>Inserisci la data di fine edizione</h4>
		<input type="text" name="datafi" /> 
				
		<br><br><input type="submit"value="Conferma" />

<h2>Crea nuova edizione</h2>
	
	<input type='hidden' name="funzione" value="aggiorna">
		
		<h4>Inserisci numero</h4>
		<input type="text" name="numero" />
		
		<h4>Inserisci l' id del corso</h4>
		<input type="text" name="idcorso" /> 
		
		<h4>Inserisci l'id della sede</h4>
		<input type="text" name="idsede" /> 
		
		<h4>Inserisci l' id del docente</h4>
		<input type="text" name="iddocente" /> 
		
		<h4>Inserisci la data di inizio edizione</h4>
		<input type="text" name="datain" /> 
		
		<h4>Inserisci la data di fine edizione</h4>
		<input type="text" name="datafi" />  		
		
		<br><br><input type="submit"value="Conferma" />

<h2>Cerca edizione</h2>
	
	<input type='hidden' name="funzione" value="cercaid">	
	
		<h4>Inserisci l' id dell' edizione</h4>
		<input type="text" name="idedizione" />
		
		<br><br><input type="submit"value="Conferma" />

	

</form>
</body>
</html>