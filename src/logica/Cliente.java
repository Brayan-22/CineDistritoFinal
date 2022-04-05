package lógica;

public class Cliente {

	private String Nombre;
	private String Correo;
	private String Contraseña;
	private int Identificacion;
	private int Puntos;
	
	
	public Cliente(String Nombre, String Correo, String Contraseña, int Identificacion) {
		
		this.Nombre = Nombre;
		this.Correo = Correo;
		this.Contraseña = Contraseña;
		this.Identificacion = Identificacion;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getCorreo() {
		return Correo;
	}


	public void setCorreo(String correo) {
		Correo = correo;
	}


	public String getContraseña() {
		return Contraseña;
	}


	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}


	public int getIdentificacion() {
		return Identificacion;
	}


	public void setIdentificacion(int identificacion) {
		Identificacion = identificacion;
	}


	public int getPuntos() {
		return Puntos;
	}


	public void setPuntos(int puntos) {
		Puntos = puntos;
	}
	
	
	
	
	
}
