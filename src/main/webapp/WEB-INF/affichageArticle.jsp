<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Article</title>
</head>
	<body>
        <h2><%= request.getParameter("titre") %></h2>
        <p><em><%= request.getParameter("description") %></em><p>
        <p><%= request.getParameter("contenu") %></p>
        <p><small>Par <%= request.getParameter("auteur") %></small></p>
    </body>
</html>