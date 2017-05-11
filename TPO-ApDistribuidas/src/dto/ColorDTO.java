package dto;

public class ColorDTO 
{
	public int id;
	public String nombre;
	
	public ColorDTO(int id, String nombre) 
	{
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getNombre() 
	{
		return nombre;
	}
	
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
}
