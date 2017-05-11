package jpa;

import javax.persistence.*;

import dto.ColorDTO;

@Entity
@Table(name="color")
public class ColorJPA 
{
	@Id
	@Column(columnDefinition="smallint")
	public int id;
	public String nombre;
	
	public ColorJPA() 
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
