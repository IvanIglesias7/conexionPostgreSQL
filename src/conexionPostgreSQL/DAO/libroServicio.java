package conexionPostgreSQL.DAO;

import java.sql.Connection;

/**
 * Interfaz del DAO de libro
 */
public interface libroServicio {

	//Hace un select de toda la tabla 
	public void selectAll(Connection con);
	
	//Hace un insert a bd
	public void insert(Connection con);
}
