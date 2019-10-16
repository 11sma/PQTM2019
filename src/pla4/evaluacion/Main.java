package pla4.evaluacion;

public class Main {

	public static void main(String[] args) {
		MySQL mysql = new MySQL();
		
		mysql.query("select * from proveedor", "idproveedor", "nombre");
		
		mysql.close();

	}

}
