package com.cga.sanidad;

public class Paciente {

	// atributos

	private int idPaciente;
	private String nombre;
	private String apellidos;
	private int edad;
	private int telefono;
	private Direccion direccion;
	private String historial;

	// Constructor vacio

	public Paciente() {

	}

	// constructor con parametros

	public Paciente(int idPaciente, String nombre, String apellidos, int edad, int telefono, Direccion direccion,
			String historia) {

		this.idPaciente = idPaciente;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.telefono = telefono;
		this.direccion = direccion;
		this.historial = historial;

	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public void setHistorial(String historial) {
		this.historial = historial;
	}

	@Override
	public String toString() {
		return "Los datos del Paciente [idPaciente=" + idPaciente + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad="
				+ edad + ", telefono=" + telefono + ", direccion=" + direccion + ", historial=" + historial + "]";
	}

	public void imprimirHistorial() {

		System.out.println("PACIENTE CON HISTORIAL");

	}

}
