<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Utilisateur</title>
</head>
	<body>
        <p>Nom : <%= request.getParameter("nom") %></p>
        <p>Prénom : <%= request.getParameter("prenom") %><p>
        <p>Email : <%= request.getParameter("email") %></p>
    </body>
</html>