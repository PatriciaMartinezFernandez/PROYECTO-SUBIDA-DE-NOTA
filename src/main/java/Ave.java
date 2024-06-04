package main.java;

import jakarta.persistence.Entity;

@Entity
public class Ave extends Mascota{
	private String tipoPlumaje;
	private String habitos;
	
	public String getTipoPlumaje() {
		return tipoPlumaje;
	}
	public void setTipoPlumaje(String tipoPlumaje) {
		this.tipoPlumaje = tipoPlumaje;
	}
	public String getHabitos() {
		return habitos;
	}
	public void setHabitos(String habitos) {
		this.habitos = habitos;
	}
	
	
	
}
