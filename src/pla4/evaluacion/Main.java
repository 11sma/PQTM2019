package pla4.evaluacion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class Main {

	static MySQL mysql = new MySQL();
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		try {
			int res;
			
			do {
				System.out.println("Escoja opción:");
				System.out.println("1.- Gestionar Productos");
				System.out.println("2.- Gestionar Proveedores");
				System.out.println("0.- Salir");
				res = Integer.parseInt(entrada.nextLine());
				switch (res) {
					case 1:
						gestionaProductos();
						break;
					case 2: 
						gestionaProveedores();
						break;
				}
			
			} while (res != 0);
			mysql.close();
			entrada.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void gestionaProductos() throws SQLException {
		
		Statement stmt;
		PreparedStatement pstmt;
		ResultSet rs;

		int res, id, idProveedor;
		String codigo;
	
		System.out.println("Escoja opción:");
		System.out.println("1.- Ver todos los productos");
		System.out.println("2.- Ver un producto concreto");
		System.out.println("3.- Crear un nuevo producto");
		System.out.println("4.- Modificar un producto");
		System.out.println("5.- Eliminar un producto");
		System.out.println("0.- Salir");
		res = Integer.parseInt(entrada.nextLine());
		switch (res) {
			case 1:
				stmt = mysql.getCon().createStatement();
				rs = stmt.executeQuery("select * from producto");
				
				while (rs.next())
					System.out.println("ID:" + rs.getString("idproducto") + " | Codigo:" + rs.getString("codigo"));
				break;
			case 2:
				System.out.println("Introduzca el id del producto que quiere ver: ");
				id = Integer.parseInt(entrada.nextLine());
				pstmt = mysql.getCon().prepareStatement("select * from	producto where idproducto=?");
				pstmt.setInt(1, id);
				rs = pstmt.executeQuery();
	
				if (rs.next()) {
					System.out.println("ID:" + rs.getString("idproducto") + " | Codigo:" + rs.getString("codigo"));
				} else {
					System.out.println("No encontrado");
				}
				break;
			case 3:
				System.out.println("Introduzca el nombre del producto: ");
				codigo = entrada.nextLine();
				System.out.println("Introduzca la id del proveedor: ");
				idProveedor = Integer.parseInt(entrada.nextLine());
				pstmt = mysql.getCon().prepareStatement("insert into producto (codigo, idproveedor) values(?,?)");
				pstmt.setString(1, codigo);
				pstmt.setInt(2, idProveedor);
				pstmt.execute();
				System.out.println("Producto insertado");
				break;
			case 4:
				System.out.println("Introduzca el id del producto que quiere modificar: ");
				id = Integer.parseInt(entrada.nextLine());
				System.out.println("Introduzca el nuevo codigo del producto: ");
				codigo = entrada.nextLine();
				pstmt = mysql.getCon().prepareStatement("update producto set codigo=? where idproducto=?");
				pstmt.setString(1, codigo);
				pstmt.setInt(2, id);
				pstmt.execute();
				System.out.println("Producto modificado");
				break;
			case 5:
				System.out.println("Introduzca el id del producto: ");
				id = Integer.parseInt(entrada.nextLine());
				pstmt = mysql.getCon().prepareStatement("delete from producto where idproducto=?");
				pstmt.setInt(1, id);
				pstmt.execute();
				System.out.println("Producto eliminado");
				break;
		}
		
	}

	private static void gestionaProveedores() throws SQLException {
		Statement stmt;
		PreparedStatement pstmt;
		ResultSet rs;

		int res, id;
		String nombre, nif;
	
		System.out.println("Escoja opción:");
		System.out.println("1.- Ver todos los proveedores");
		System.out.println("2.- Ver un proveedor concreto");
		System.out.println("3.- Crear un nuevo proveedor");
		System.out.println("4.- Modificar un proveedor");
		System.out.println("5.- Eliminar un proveedor");
		System.out.println("0.- Salir");
		res = Integer.parseInt(entrada.nextLine());
		switch (res) {
			case 1:
				stmt = mysql.getCon().createStatement();
				rs = stmt.executeQuery("select * from proveedor");
				
				while (rs.next())
					System.out.println("ID:" + rs.getString("idproveedor") + " | Nombre:" + rs.getString("nombre"));
				break;
			case 2:
				System.out.println("Introduzca el id del proveedor que quiere ver: ");
				id = Integer.parseInt(entrada.nextLine());
				pstmt = mysql.getCon().prepareStatement("select * from	proveedor where idproveedor=?");
				pstmt.setInt(1, id);
				rs = pstmt.executeQuery();
	
				if (rs.next()) {
					System.out.println("ID:" + rs.getString("idproveedor") + " | Nombre:" + rs.getString("nombre"));
				} else {
					System.out.println("No encontrado");
				}
				break;
			case 3:
				System.out.println("Introduzca el nombre del proveedor: ");
				nombre = entrada.nextLine();
				System.out.println("Introduzca el nif: ");
				nif = entrada.nextLine();
				pstmt = mysql.getCon().prepareStatement("insert into proveedor (nombre, nif) values(?,?)");
				pstmt.setString(1, nombre);
				pstmt.setString(2, nif);
				pstmt.execute();
				System.out.println("Proveedor insertado");
				break;
			case 4:
				System.out.println("Introduzca el id del proveedor que quiere modificar: ");
				id = Integer.parseInt(entrada.nextLine());
				System.out.println("Introduzca el nuevo nombre del proveedor: ");
				nombre = entrada.nextLine();
				pstmt = mysql.getCon().prepareStatement("update proveedor set nombre=? where idproveedor=?");
				pstmt.setString(1, nombre);
				pstmt.setInt(2, id);
				pstmt.execute();
				System.out.println("Proveedor modificado");
				break;
			case 5:
				System.out.println("Introduzca el id del proveedor: ");
				id = Integer.parseInt(entrada.nextLine());
				pstmt = mysql.getCon().prepareStatement("delete from proveedor where idproveedor=?");
				pstmt.setInt(1, id);
				pstmt.execute();
				System.out.println("Proveedor eliminado");
				break;
		}
		
	}

}
