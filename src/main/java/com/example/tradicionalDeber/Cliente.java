package com.example.tradicionalDeber;

public class Cliente {
	
	private String Nombre;
	private String Cedula;
	private Sexo Sexo;
	
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

	public Sexo getSexo() {
		return Sexo;
	}

	public void setSexo(Sexo sexo) {
		Sexo = sexo;
	}

	@Override
	public String toString() {
		return "Cliente [Nombre=" + Nombre + ", Cedula=" + Cedula + ", Sexo=" + Sexo + "]";
	}
	
	

}
