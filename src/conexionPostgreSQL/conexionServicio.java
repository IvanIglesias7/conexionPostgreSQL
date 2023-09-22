package conexionPostgreSQL;

import java.sql.Connection;

public interface conexionServicio {

	//Método que hace conexion a base de datos y devuelve una respuesta.
	public Connection conexion();
	
	
}
