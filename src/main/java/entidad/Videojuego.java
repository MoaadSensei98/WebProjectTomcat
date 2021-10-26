package entidad;

public class Videojuego {

	private int id;
	private String nombre;
	private String compañia;
	private String notaMedia;
	private String nombreCreador;
	private String paginaWeb;

	public Videojuego() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	public String getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(String notaMedia) {
		this.notaMedia = notaMedia;
	}

	public String getNombreCreador() {
		return nombreCreador;
	}

	public void setNombreCreador(String nombreCreador) {
		this.nombreCreador = nombreCreador;
	}

	public String getPaginaWeb() {
		return paginaWeb;
	}

	public void setPaginaWeb(String paginaWeb) {
		this.paginaWeb = paginaWeb;
	}

	@Override
	public String toString() {
		return nombre + "\n";
	}

}