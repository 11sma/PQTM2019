package pla4.evaluacion;

public interface DB {

	public void query(String query, String idField, String field);
	
	public void close();
	
	public Object getCon();
}
