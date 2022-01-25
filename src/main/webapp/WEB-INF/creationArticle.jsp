<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Création d'un article</title>
        <link type="text/css" rel="stylesheet" href="inc/style.css" />
    </head>
    <body>
        <div>
            <form method="post" action="article">
                <fieldset>
                    <legend>Informations article</legend>
    
                    <label for="titre">Titre <span class="requis">*</span></label>
                    <input type="text" id="titre" name="titre" value="" size="20" maxlength="20" />
                    <br />
                    
                    <label for="description">Description </label>
                    <textarea id="description" name="description" ></textarea>
                    <br />
                    
                    <label for="contenu">Contenu </label>
                    <input type="text" id="contenu" name="contenu" value="" size="20" maxlength="60" />
                    <br />
                    
                    <label for="auteur">Auteur </label>
                    <input type="text" id="auteur" name="auteur" value="" size="20" maxlength="60" />
                    <br />
                </fieldset>
                <input type="submit" value="Valider"  />
                <input type="reset" value="Remettre à zéro" /> <br />
            </form>
        </div>
    </body>
</html>