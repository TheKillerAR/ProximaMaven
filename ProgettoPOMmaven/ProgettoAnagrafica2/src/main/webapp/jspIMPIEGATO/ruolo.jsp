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


	<form action="RuoloServlet" method="post">


		<h2>Cerca ruolo</h2>

		<input type='hidden' name="funzione" value="cercaid">

		<h4>Inserisci l' id del ruolo</h4>
		<input type="text" name="id" /> <br> <br> <input
			type="submit" value="Conferma" /> <br>

		---------------------------------------------------------------------------

		<h2>Crea nuovo ruolo</h2>


		<input type='hidden' name="funzione" value="inserisci">

		<h4>Inserisci nome ruolo</h4>
		<input type="text" name="nomeruolo" /> <br>

		<h4>Inserisci stipendio</h4>
		<input type="text" name="stipendio" /> <br> <br> <input
			type="submit" value="Conferma" /> <br>

		---------------------------------------------------------------------------

		<h2>Aggiorna ruolo</h2>

		<input type='hidden' name="funzione" value="aggiorna">

		<h4>Inserisci nome ruolo</h4>
		<input type="text" name="nomeruolo" /> <br>

		<h4>Inserisci stipendio</h4>
		<input type="text" name="stipendio" /> <br> <br> <input
			type="submit" value="Conferma" /> <br>

		---------------------------------------------------------------------------



	</form>
</body>
</html>