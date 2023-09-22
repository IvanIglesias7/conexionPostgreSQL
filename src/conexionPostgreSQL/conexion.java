package conexionPostgreSQL;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
/**
 * Clase que hará conexion a base de datos a traves del archivo properties.
 */
public class conexion implements conexionServicio {

	Properties prop = new Properties();

	@Override
	public Connection conexion() {

		Connection con = null;

		try {

			InputStream input = new FileInputStream("configuracion.properties");

			Properties prop = new Properties();

			// load a properties file
			prop.load(input);

			con = DriverManager.getConnection(prop.getProperty("db.url"), prop.getProperty("db.user"),
					prop.getProperty("db.password"));

			System.out.println("Conectado a la base satisfactoriamente");
		} catch (Exception e) {

			System.out.println(e);
			System.out.println("Error al conectar con la base");
		}

		return con;
	}

}
