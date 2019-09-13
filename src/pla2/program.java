package pla2;

public class program {

	public static void main(String[] args) {
		
		Empleado empleado = new Empleado("nombre empleado", "00000000A");
		empleado.setSueldo(100.0);
		System.out.println(empleado);
		
		Administracion administracion = new Administracion("nombre administración", "11111111B");
		administracion.setSueldo(1000.0);
		administracion.setSeccion("seccion 1");
		System.out.println(administracion);
		
		Gerente gerente = new Gerente("nombre gerente", "22222222C");
		gerente.setSueldo(10000.0);
		gerente.setDepartamento("departamento 1");
		gerente.setDietas(11);
		System.out.println(gerente);
		
		Direccion direccion = new Direccion("nombre direccion", "33333333D");
		direccion.setSueldo(100000.0);
		direccion.setStockOptions(11);
		System.out.println(direccion);
		
		System.out.println();
		
		empleado.saludo();
		administracion.saludo();
		gerente.saludo();
		direccion.saludo();

	}

}
