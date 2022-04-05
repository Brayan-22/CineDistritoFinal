package lógica;

public class Empleado {

	private String Cedula;
	private String IdEmpleado;
	private String Nombre;
	private String Telefono;
	private String FechaIngreso;
	private double Salario;
	private String Cargo;
	private String Multiplex;
	
	
	public Empleado(String Cedula, String IdEmpleado, String Nombre, String Telefono, String FechaIngreso,
			double Salario, String Cargo, String Multiplex) {
		
		this.Cedula = Cedula;
		this.IdEmpleado = IdEmpleado;
		this.Nombre = Nombre;
		this.Telefono = Telefono;
		this.FechaIngreso = FechaIngreso;
		this.Salario = Salario;
		this.Cargo = Cargo;
		this.Multiplex = Multiplex;
	}


	public String getCedula() {
		return Cedula;
	}


	public void setCedula(String cedula) {
		Cedula = cedula;
	}


	public String getIdEmpleado() {
		return IdEmpleado;
	}


	public void setIdEmpleado(String idEmpleado) {
		IdEmpleado = idEmpleado;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getTelefono() {
		return Telefono;
	}


	public void setTelefono(String telefono) {
		Telefono = telefono;
	}


	public String getFechaIngreso() {
		return FechaIngreso;
	}


	public void setFechaIngreso(String fechaIngreso) {
		FechaIngreso = fechaIngreso;
	}


	public double getSalario() {
		return Salario;
	}


	public void setSalario(double salario) {
		Salario = salario;
	}


	public String getCargo() {
		return Cargo;
	}


	public void setCargo(String cargo) {
		Cargo = cargo;
	}


	public String getMultiplex() {
		return Multiplex;
	}


	public void setMultiplex(String multiplex) {
		Multiplex = multiplex;
	}
	
	
	
	
	
	
	
	
}
