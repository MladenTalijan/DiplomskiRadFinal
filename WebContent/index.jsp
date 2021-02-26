<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="styleLogin.css" type="text/css">
<title>Servis za diplomske radove </title>
</head>
<body>
<div class="main-section">
<div class="content-section">
<div class="head-section">
<h3>Registracija</h3>
</div>
<div class="body-section">
				<form action="http://localhost:8080/ServisZaDiplomskeRadove/Register">
					<div class="form-input">
					
						<input type="text" name="uname" placeholder="Ime i Prezime">
					<div class="form-input">
					<label for = "upass"></label>
						<input type="password" name="upass" placeholder="Unesite lozinku">
					</div>
					<div class="form-input">
						<input type="text" name="email" placeholder="Unesite e-mail">
					</div>
					<div class="form-input">
						<button type="submit" class="btn-submit">Registruj se</button>
					</div>
					</div>
					
				</form>
			</div>
			<div class="head-section">
				<h3>Uloguj se</h3>
				</div>
<div class="body-section">
				<form action="http://localhost:8080/ServisZaDiplomskeRadove/Login">
				<div class="form-input">
					<div class="form-input">
						<input type="text" name="email" placeholder="Unesite e-mail">
					</div>
					<div class="form-input">
					<label for = "upass"></label>
						<input type="password" name="upass" placeholder="Unesite lozinku">
					</div>
					<div class="form-input">
						<button type="submit" class="btn-submit">Uloguj se</button>
						</div>
							</div>
				</form>
				</div>
			</div>
		</div>

</body>

</html>