package negocio;

import java.util.List;

import persistencia.DaoVideojuego;
import entidad.Videojuego;


public class GestorVideojuego {	
 
	private DaoVideojuego videojuegoDao;
	
	public List<Videojuego> listar(){
		videojuegoDao = new DaoVideojuego();
		return videojuegoDao.listar();
	}
	
	public Videojuego obtener(int id) {
		videojuegoDao = new DaoVideojuego();
		return videojuegoDao.obtener(id);
	}
	 
}
