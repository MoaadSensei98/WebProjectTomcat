package controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.GestorLogin;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
 
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		GestorLogin gl = new GestorLogin();
		
		String username= request.getParameter("user");
		String password= request.getParameter("pass");
		 
		// Podemos pasarle a la vista toda la informacion que queramos
		// mediante atributos clave-valor (Map)

		if (gl.comprobar(username, password)) {
 			// Le decimos al servlet que vista queremos elegir
			request.getRequestDispatcher("/PrimerServlet").forward(request, response);
		} else {
			request.getRequestDispatcher("errorLogin.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
