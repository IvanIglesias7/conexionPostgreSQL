package conexionPostgreSQL.DTO;

import conexionPostgreSQL.DAO.libro;

/**
 * Interfaz de libroDTO
 */
public interface libroDTOServicio {

	public libroDTO getLibro ();
	
	public libro libroDTOaDAO(libroDTO libroDTO);
}
