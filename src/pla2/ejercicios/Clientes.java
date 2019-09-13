package pla2.ejercicios;

public class Clientes implements Saludo {

	private String nombre;
	
	private String email;
	
	private String tipo;

	@Override
	public void saludo() {
		System.out.println("Hola, soy un cliente y me llamo " + getNombre());
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Clientes [nombre=" + nombre + ", email=" + email + ", tipo=" + tipo + "]";
	}
	
	
	
	
	
}
