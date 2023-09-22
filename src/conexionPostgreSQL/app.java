package conexionPostgreSQL;

import java.sql.Connection;

import conexionPostgreSQL.DAO.libroImpl;
import conexionPostgreSQL.conexion.conexion;

/**
 * Clase main que ejecutará el programa
 */
public class app {

	public static void main(String[] args) {
		
		conexion conexion = new conexion();
		libroImpl libImp = new libroImpl();
		
		Connection conn = conexion.conexion();
		
		libImp.selectAll(conn);
		libImp.insert(conn);
		
		

	}

}
