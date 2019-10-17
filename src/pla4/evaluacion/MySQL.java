package pla4.evaluacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL implements DB{

	private String cadConexion = "jdbc:mysql://localhost:3306/";

	private String bd = "mydb";

	private String usuario = "root";

	private String pass = "";
	
	private Connection con;

	public MySQL() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = DriverManager.getConnection(cadConexion + bd, usuario, pass);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	@Override
	public void query(String query, String idField, String field) {
		
		Statement stmt;

		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next())
				System.out.println(rs.getInt(idField) + "  " + rs.getString(field));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void close() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}
	
	

}
