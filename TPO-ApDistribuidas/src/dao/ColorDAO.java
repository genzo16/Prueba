package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class ColorDAO 
{
	
	public static ColorDAO instancia = null;
	
	private ColorDAO(){}
	
	public static ColorDAO getInstancia()
	{
		if (instancia == null)
			instancia = new ColorDAO();
		return instancia;
	}
	
	public List<dto.ColorDTO> obtenerColoresDisponibles()
	{
		List<dto.ColorDTO> lColores = new ArrayList<dto.ColorDTO>();
		SessionFactory sf = hbt.HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		
		List<jpa.ColorJPA> lEntColores = s.createQuery("from ColorJPA").list();
		
		for(jpa.ColorJPA c : lEntColores)
			lColores.add(c.aDTO());
			
		s.close();
		return lColores;
	}
	
	
}
