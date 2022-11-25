package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component
public class AutoImportadoSB extends AutoSB{

	private String PaisDeImportacion;
	private String CostoDeImportacion;
	
	public Integer descuento() {
		// TODO Auto-generated method stub
		System.out.println("Aplica el 5% de descuento");
		return 05;
	}
	
	public String getPaisDeImportacion() {
		return PaisDeImportacion;
	}
	public void setPaisDeImportacion(String paisDeImportacion) {
		PaisDeImportacion = paisDeImportacion;
	}
	public String getCostoDeImportacion() {
		return CostoDeImportacion;
	}
	public void setCostoDeImportacion(String costoDeImportacion) {
		CostoDeImportacion = costoDeImportacion;
	}
	@Override
	public String toString() {
		return "AutoImportado [PaisDeImportacion=" + PaisDeImportacion + ", CostoDeImportacion=" + CostoDeImportacion
				+ "]";
	}
	
	
}
