package entidad;

public class Login {
private String usuario;
private String contrase�a;
public String getUsuario() {
	return usuario;
}
public void setUsuario(String usuario) {
	this.usuario = usuario;
}
public String getContrase�a() {
	return contrase�a;
}
public void setContrase�a(String contrase�a) {
	this.contrase�a = contrase�a;
}
@Override
public String toString() {
	return "Login [usuario=" + usuario + ", contrase�a=" + contrase�a + "]";
}


}