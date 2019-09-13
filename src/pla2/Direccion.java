package pla2;

public class Direccion extends Empleado implements Saludo {
	
	private Integer stockOptions = 0;
	
	public Direccion(String nombre, String dni) {
		this.setNombre(nombre);
		this.setDni(dni);
	}
	
	@Override
	public void saludo() {
		System.out.println("Hola, soy un Director y me llamo " + getNombre());
	}
	
	
	public Double sueldoNeto() {
		return super.sueldoNeto() + stockOptions*0.1;
	}

	public Integer getStockOptions() {
		return stockOptions;
	}

	public void setStockOptions(Integer stockOptions) {
		this.stockOptions = stockOptions;
	}

	@Override
	public String toString() {
		return "Direccion [stockOptions=" + stockOptions + ", getNombre()=" + getNombre() + ", getDni()=" + getDni()
				+ ", sueldoNeto()=" + sueldoNeto() + "]";
	}

}
