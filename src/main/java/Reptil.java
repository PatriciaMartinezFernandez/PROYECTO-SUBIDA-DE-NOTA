package main.java;

import jakarta.persistence.Entity;

@Entity
public class Reptil extends Mascota {
	private String tipoEscamas;

	public String getTipoEscamas() {
		return tipoEscamas;
	}

	public void setTipoEscamas(String tipoEscamas) {
		this.tipoEscamas = tipoEscamas;
	}
	
	
	
}
