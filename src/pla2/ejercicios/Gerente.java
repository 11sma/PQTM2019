package pla2.ejercicios;

public class Gerente extends Empleado implements Saludo {

	private String departamento;
	
	private Integer dietas = 0;
	
	public Gerente(String nombre, String dni) {
		this.setNombre(nombre);
		this.setDni(dni);
	}
	
	@Override
	public void saludo() {
		System.out.println("Hola, soy un Gerente y me llamo " + getNombre());
	}
	
	public Double sueldoNeto() {
		return super.sueldoNeto() + dietas;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Integer getDietas() {
		return dietas;
	}

	public void setDietas(Integer dietas) {
		this.dietas = dietas;
	}

	@Override
	public String toString() {
		return "Gerente [departamento=" + departamento + ", dietas=" + dietas + ", sueldoNeto()=" + sueldoNeto()
				+ ", getNombre()=" + getNombre() + ", getDni()=" + getDni() + "]";
	}

	
	
}
