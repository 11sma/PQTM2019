package pla2;

public class Administracion extends Empleado implements Saludo {

	private String seccion;

	public Administracion(String nombre, String dni) {
		this.setNombre(nombre);
		this.setDni(dni);
	}
	
	@Override
	public void saludo() {
		System.out.println("Hola, soy un Administrador y me llamo " + getNombre());
	}
	
	
	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	@Override
	public String toString() {
		return "Administracion [seccion=" + seccion + ", sueldoNeto()=" + sueldoNeto() + ", getNombre()=" + getNombre()
				+ ", getDni()=" + getDni() + "]";
	}
	
	
}
