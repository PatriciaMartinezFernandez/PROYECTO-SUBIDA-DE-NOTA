package main.java;

import jakarta.persistence.Entity;

@Entity
public class Pez extends Mascota{
	private String tipoAgua;

	public String getTipoAgua() {
		return tipoAgua;
	}

	public void setTipoAgua(String tipoAgua) {
		this.tipoAgua = tipoAgua;
	}
	
	
	
}
