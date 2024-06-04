package main.java;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Propietario {
	@Id
	private String dni;
	private String nombre;
	private String direccion;
	private int numMascotas;
	@OneToMany(mappedBy = "propietario")
	private List<Mascota> mascotas;
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getNumMascotas() {
		return numMascotas;
	}
	public void setNumMascotas(int numMascotas) {
		this.numMascotas = numMascotas;
	}
	public List<Mascota> getMascotas() {
		return mascotas;
	}
	public void setMascotas(List<Mascota> mascotas) {
		this.mascotas = mascotas;
	}
	
	
	
	
}
