package conexionPostgreSQL.DAO;

import java.sql.Connection;

public interface libroServicio {

	//Hara un select * 
	public void selectAll(Connection con);
}
