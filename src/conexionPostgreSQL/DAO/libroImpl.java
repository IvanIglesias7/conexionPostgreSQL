package conexionPostgreSQL.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import conexionPostgreSQL.DTO.libroDTO;
import conexionPostgreSQL.DTO.libroDTOImpl;

/**
 * Implementacion de la interfaz y lógica.
 */
public class libroImpl implements libroServicio {

	libroDTO libDTO = new libroDTO();
	libroDTOImpl libDTOImpl = new libroDTOImpl();
	libro libDAO = new libro();
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
	        libDTO.setId_libro(rs.getInt("id_libro"));
	        libDTO.setTitulo(rs.getString("titulo"));
	        libDTO.setAutor(rs.getString("autor"));
	        libDTO.setIsbn(rs.getString("isbn"));
	        libDTO.setEdicion(rs.getInt("edicion"));
	        
	       //Muestro resultados
	        
	         System.out.println(libDTO.toString());  
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

	@Override
	public void insert(Connection con) {
		
		try {
			
			libDAO = libDTOImpl.libroDTOaDAO(libDTOImpl.getLibro());
			
			// Creo el statement
			Statement st = con.createStatement();
		      
			st.executeQuery("INSERT INTO gbp_almacen.gbp_alm_cat_libros "
					+ "VALUES (DEFAULT,"
					+ libDAO.getTitulo() + ","
					+ libDAO.getAutor() + ","
					+ libDAO.getIsbn() + ","
					+ libDAO.getEdicion() + ")");
			
			
		   st.close();
		   
		} catch (Exception e) {
			
			System.err.println("Error! ");
		      System.err.println(e);
		}
		
	}
	}


