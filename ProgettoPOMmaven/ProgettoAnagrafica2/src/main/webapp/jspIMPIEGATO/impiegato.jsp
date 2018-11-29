<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
	integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
	integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
	crossorigin="anonymous"></script>

<title></title>
</head>


<body>


	<form action="${pageContext.request.contextPath}/ImpiegatoServlet" method="post">


		<h2>Cerca impiegato</h2>

		<input type='hidden' name="funzione" value="cercaid">

		<h4>Inserisci l' id dell'impiegato</h4>
		<input type="text" name="id" /> <br> <br> <input
			type="submit" value="Conferma" /> <br>
			</form>

		---------------------------------------------------------------------------
		
		<h2>Cerca impiegato tramite il nome</h2>
		
		<form action="${pageContext.request.contextPath}/ImpiegatoServlet" method="post">

		<input type='hidden' name="funzione" value="cercanome">

		<h4>Inserisci il nome dell'impiegato</h4>
		<input type="text" name="nome" /> <br> <br> <input
			type="submit" value="Conferma" /> <br>
			</form>

		---------------------------------------------------------------------------

		<h2>Crea nuovo impiegato</h2>
		
		<form action="${pageContext.request.contextPath}/esitopositivo.jsp" method="post">


		<input type='hidden' name="funzione" value="inserisci">

		<h4>Inserisci codice fiscale</h4>
		<input type="text" name="cf" /> <br>

		<h4>Inserisci nome</h4>
		<input type="text" name="nome" /> <br>

		<h4>Inserisci cognome</h4>
		<input type="text" name="cognome" /> <br> <br> <input
			type="submit" value="Conferma" /> <br>
			</form>

		---------------------------------------------------------------------------

		<h2>Aggiorna impiegato</h2>
		
		<form action="${pageContext.request.contextPath}/esitopositivo.jsp" method="post">

		<input type='hidden' name="funzione" value="aggiorna">

		<h4>Inserisci codice fiscale</h4>
		<input type="text" name="cf" /> <br>

		<h4>Inserisci nome</h4>
		<input type="text" name="nome" /> <br>

		<h4>Inserisci cognome</h4>
		<input type="text" name="cognome" /> <br> <br> <input
			type="submit" value="Conferma" /> <br>
			
			</form>

		---------------------------------------------------------------------------
		<br> <br>
		<form action="${pageContext.request.contextPath}/ImpiegatoServlet" method="post">
		<input type='hidden' name="funzione" value="mostratutti">
		
		<input type="submit" value="Mostra tutti gli impiegati" /> <br>

		</form>

	
</body>
</html>