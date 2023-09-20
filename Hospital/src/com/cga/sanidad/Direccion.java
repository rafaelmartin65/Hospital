package com.cga.sanidad;

public class Direccion {

//	public static void main(String[] args) {

	// atributos

	private int codPostal;
	private String calle;

	// Constructor vacio

	public Direccion() {

	}

	// constructor con parametros

	public Direccion(int codPostal, String calle) {

		this.codPostal = codPostal;
		this.calle = calle;

	}

	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	@Override
	public String toString() {
		return "Direccion [codPostal=" + codPostal + ", calle=" + calle + "]";
	}

}

//}
