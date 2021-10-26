package negocio;

import entidad.Login;
import persistencia.DaoLogin;

public class GestorLogin {

	private DaoLogin loginDao = new DaoLogin();
 
	
	public boolean comprobar(String usuario, String contraseña) {
		 
		return loginDao.comprobar(usuario, contraseña);
	}
	

}
