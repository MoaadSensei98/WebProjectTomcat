package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidad.Videojuego;
import negocio.GestorVideojuego;
 


public class SegundoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GestorVideojuego gp = new GestorVideojuego();
		
		String id = request.getParameter("id");
		
		int idNumerico = Integer.parseInt(id);
		
		Videojuego v = gp.obtener(idNumerico);
		
		if(v != null) {
			//Podemos pasarle a la vista toda la informacion que queramos
			//mediante atributos clave-valor (Map)
			request.setAttribute("v", v);
					
			//Le decimos al servlet que vista queremos elegir
			request.getRequestDispatcher("detalleVideojuego.jsp").forward(request, response);	
		}else {
			request.getRequestDispatcher("errorVideojuego.jsp").forward(request, response);	
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
