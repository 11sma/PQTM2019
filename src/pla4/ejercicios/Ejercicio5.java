package pla4.ejercicios;

import java.sql.*;

public class Ejercicio5 {

	public static void main(String[] args) {
		String cadConexion = "jdbc:mysql://192.168.1.137:3306/";

		String bd = "mydb";

		String usuario = "pma";

		String pass = "";

		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection con = DriverManager.getConnection(cadConexion + bd, usuario, pass);

			Statement stmt;

			stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("select * from proveedor");

			while (rs.next())
				System.out.println(rs.getInt("idproveedor") + "  " + rs.getString("nombre"));

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
