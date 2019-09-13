package pla2;

public class Empleado implements Saludo {

	private String nombre;
	
	private String dni;
	
	private Double sueldo = 0.0;
	
	public Empleado() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void saludo() {
		System.out.println("Hola, soy un empleado y me llamo " + getNombre());
	}
	
	
	public Empleado(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
	
	public Double sueldoNeto() {
		return sueldo*getIRPF();
	}
	
	private Double getIRPF() {
		if (sueldo < 3000.0) {
			return 0.85;
		} else {
			return 0.75;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", dni=" + dni + ", sueldoNeto()=" + sueldoNeto() + "]";
	}
	
	
}
