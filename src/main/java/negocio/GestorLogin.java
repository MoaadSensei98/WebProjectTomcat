package negocio;

import entidad.Login;
import persistencia.DaoLogin;

public class GestorLogin {

	private DaoLogin loginDao = new DaoLogin();
 
	
	public boolean comprobar(String usuario, String contrase�a) {
		 
		return loginDao.comprobar(usuario, contrase�a);
	}
	

}
