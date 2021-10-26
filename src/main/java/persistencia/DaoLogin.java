package persistencia; 

import java.util.ArrayList;

import entidad.Login; 
   
public class DaoLogin {

	public DaoLogin() { 
		Login l = new Login();
		l.setUsuario("loko");
		l.setContraseña("123456");
		usuarios.add(l);
		
		Login l2 = new Login();
		l2.setUsuario("segundo");
		l2.setContraseña("123456");
		usuarios.add(l2);
		
		Login l3 = new Login();
		l3.setUsuario("moaad");
		l3.setContraseña("123456");
		usuarios.add(l3);
		
		Login l4 = new Login();
		l4.setUsuario("goku");
		l4.setContraseña("123456");
		usuarios.add(l4);
		 
	}
	ArrayList<Login> usuarios = new ArrayList<Login>();
	
	
	
	
	public boolean comprobar(String usuario, String contraseña) {
		/*if(usuario.equals("moaad") && contraseña.equals("123456789")) {
			return true;
		}else {
			return false;
		}*/
		 	for (Login element : usuarios) {
		if(element instanceof Login) {
			if(usuario.equals(element.getUsuario()) && contraseña.equals(element.getContraseña()))
			return true;
		}else {
			return false;
		}
		}
		return false;
		
	 
		
	}
  
}
