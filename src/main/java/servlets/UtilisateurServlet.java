package servlets;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UtilisateurServlet
 */
@WebServlet( urlPatterns="/utilisateur", loadOnStartup=1)
public class UtilisateurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UtilisateurServlet() {}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/* Si le formulaire n est pas rempli */
		if(request.getParameterMap().isEmpty()) {
			request.getRequestDispatcher("WEB-INF/creationUtilisateur.jsp").forward(request, response);
		}
		else {
			this.insertUser();
			request.getRequestDispatcher("WEB-INF/affichageUtilisateur.jsp").forward(request, response);
		}
	}
	
	/**
	 * Insert un nouvel utilisateur dans le fichier bdd
	 */
	private void insertUser() {
		
		try {
			List<String> lines = Arrays.asList("The first line", "The second line");
			Path file = Paths.get("bdd.txt");
			Files.write(file, lines, StandardCharsets.UTF_8);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
