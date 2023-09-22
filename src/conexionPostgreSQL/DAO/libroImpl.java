package conexionPostgreSQL.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import conexionPostgreSQL.DTO.libroDTO;

public class libroImpl implements libroServicio {

	libroDTO lib = new libroDTO();
	
	@Override
	public void selectAll(Connection con) {
		
		try
	    {	      
	      
	      String query = "SELECT * FROM gbp_almacen.gbp_alm_cat_libros";

	      // Creo el statement
	      Statement st = con.createStatement();
	      
	      // Ejecuto la query y recibo el resultado
	      ResultSet rs = st.executeQuery(query);
	      
	      // Hago iteración del objeto y lo meto en el DTO
	      while (rs.next())
	      {
	        lib.setId_libro(rs.getInt("id_libro"));
	        lib.setTitulo(rs.getString("titulo"));
	        lib.setAutor(rs.getString("autor"));
	        lib.setIsbn(rs.getString("isbn"));
	        lib.setEdicion(rs.getInt("edicion"));
	        
	       //Muestro resultados
	        
	         System.out.println(lib.toString());  
	      }
	      //Cierro statement
	      st.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Error! ");
	      System.err.println(e.getMessage());
	    }
	  }
	}


