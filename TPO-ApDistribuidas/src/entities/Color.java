package entities;

import javax.persistence.*;

import dto.ColorDTO;

public class Color 
{
	public int id;
	public String nombre;
	
	public Color() 
	{
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ColorDTO aDTO()
	{
		return new ColorDTO(getId(),getNombre());
	}
}
