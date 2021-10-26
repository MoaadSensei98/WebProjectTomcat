package controlador;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidad.Videojuego; 
import negocio.GestorVideojuego;


@WebServlet("/PrimerServlet")
public class PrimerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;       

    public PrimerServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GestorVideojuego gp = new GestorVideojuego();
		
		List<Videojuego> listaVideojuegos = gp.listar();
		System.out.println(listaVideojuegos);
		
		//Podemos pasarle a la vista toda la informacion que queramos
		//mediante atributos clave-valor (Map)
		request.setAttribute("lista", listaVideojuegos);
				
		//Le decimos al servlet que vista queremos elegir
		request.getRequestDispatcher("index.jsp").forward(request, response);	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
