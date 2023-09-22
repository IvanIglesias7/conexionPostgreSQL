package conexionPostgreSQL.DTO;

import java.util.Scanner;
import conexionPostgreSQL.DAO.*;

/**
 * Implementacion de la interfaz de libroDTO
 */
public class libroDTOImpl implements libroDTOServicio {

	
	Scanner scan = new Scanner(System.in);
	
	public libroDTO getLibro() {
		
		libroDTO libro = new libroDTO();
		
		System.out.println("¿Título del libro?");
		libro.setTitulo(scan.next());
		System.out.println("¿Autor/a?");
		libro.setAutor(scan.next());
		System.out.println("¿ISBN?");
		libro.setIsbn(scan.next());
		System.out.println("¿Edición?");
		libro.setEdicion(scan.nextInt());
		
		return libro;
	}

	@Override
	public conexionPostgreSQL.DAO.libro libroDTOaDAO(libroDTO libroDTO) {
		
		libro lib = new libro();
		
		lib.setTitulo(libroDTO.getTitulo());
		lib.setAutor(libroDTO.getAutor());
		lib.setIsbn(libroDTO.getIsbn());
		lib.setEdicion(libroDTO.getEdicion());

		return lib;
	}

}
