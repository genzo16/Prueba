package prueba;

import java.util.List;

import dao.ColorDAO;
import dto.ColorDTO;

public class Run_Prueba 
{

	public static void main(String[] args)
	{
	    List<ColorDTO> lColorDTO = ColorDAO.getInstancia().obtenerColoresDisponibles();
		System.out.println("Colores disponibles:");
		for(ColorDTO c : lColorDTO)
			System.out.println("* "+c.getNombre());
	}

}
