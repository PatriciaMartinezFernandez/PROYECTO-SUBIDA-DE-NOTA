package main.java;

import jakarta.persistence.Entity;

@Entity
public class Mamifero extends Mascota {
	private String raza;
	private String pedigri;
	
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getPedigri() {
		return pedigri;
	}
	public void setPedigri(String pedigri) {
		this.pedigri = pedigri;
	}
	
}
