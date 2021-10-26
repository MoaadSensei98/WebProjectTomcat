package persistencia;

import java.util.ArrayList;
import java.util.List;

import entidad.Videojuego;
 


public class DaoVideojuego {

	public DaoVideojuego() {
		
	}
	
	public List<Videojuego> listar(){
		//Creamos una lista que se utilizará para añadir todos los juegos
		List<Videojuego> listaVideoJuegos = new ArrayList<Videojuego>();
		
		Videojuego v = new Videojuego();
		//Juego 1
		//v.setId(1);
		v.setNombre("Crysis 3");
		/*v.setCompañia("Electronic Arts");		
		v.setNotaMedia("9/10");
		v.setNombreCreador("Steven Hall");
		v.setPaginaWeb("https://www.origin.com/esp/es-es/store/crysis/crysis-3");*/
		
		listaVideoJuegos.add(v);
		Videojuego v2 = new Videojuego();

		//Juego 2
		//v.setId(2);
		v2.setNombre("Monster Hunter");
		/*v.setCompañia("Capcom");		
		v.setNotaMedia("9/10");
		v.setNombreCreador("Ryozo Tsujimoto");
		v.setPaginaWeb("https://www.monsterhunter.com/");*/
		
		listaVideoJuegos.add(v2);
		Videojuego v3 = new Videojuego();

		//Juego 3
		//v.setId(3);
		v3.setNombre("Genshin Impact");
		/*v.setCompañia("miHoYo");		
		v.setNotaMedia("8/10");
		v.setNombreCreador("Hugh Tsai");
		v.setPaginaWeb("https://genshin.mihoyo.com/es");*/
				
		listaVideoJuegos.add(v3);

		return listaVideoJuegos;
	}
	
	public Videojuego obtener(int id){
		
		if(id == 1) {
			Videojuego v = new Videojuego();
			v.setId(1);
			v.setNombre("Crysis 3");
			v.setCompañia("Electronic Arts");		
			v.setNotaMedia("9/10");
			v.setNombreCreador("Steven Hall");
			v.setPaginaWeb("https://www.origin.com/esp/es-es/store/crysis/crysis-3");
			return v;
		}else if(id == 2) {
			Videojuego v = new Videojuego();
			v.setId(2);
			v.setNombre("Monster Hunter");
			v.setCompañia("Capcom");		
			v.setNotaMedia("9/10");
			v.setNombreCreador("Ryozo Tsujimoto");
			v.setPaginaWeb("https://www.monsterhunter.com/");
			return v;
		} else if(id == 3) {
			Videojuego v = new Videojuego();
			v.setId(3);
			v.setNombre("Genshin Impact");
			v.setCompañia("miHoYo");		
			v.setNotaMedia("8/10");
			v.setNombreCreador("Hugh Tsai");
			v.setPaginaWeb("https://genshin.mihoyo.com/es");
			return v;
	
		}else {
			return null;
		}
	}
}
