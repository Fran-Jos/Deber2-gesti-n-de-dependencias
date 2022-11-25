package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component
public class ClienteSB {
	
	private String Nombre;
	private String Cedula;
	private SexoSB Sexo;
	
	/*public Cliente(String n , String c , Sexo s) {
		this.Sexo = s;
		this.Cedula= c;
		this.Nombre= n;
		
	}
*/
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getCedula() {
		return Cedula;
	}

	public void setCedula(String cedula) {
		Cedula = cedula;
	}

	public SexoSB getSexo() {
		return Sexo;
	}

	public void setSexo(SexoSB sexo) {
		Sexo = sexo;
	}

	@Override
	public String toString() {
		return "Cliente [Nombre=" + Nombre + ", Cedula=" + Cedula + ", Sexo=" + Sexo + "]";
	}
	
	

}
