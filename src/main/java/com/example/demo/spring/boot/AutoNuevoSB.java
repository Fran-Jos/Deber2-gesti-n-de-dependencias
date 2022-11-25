package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component
public class AutoNuevoSB extends AutoSB {

	private String CasaDeVenta;
	
	public Integer descuento() {
		// TODO Auto-generated method stub
		System.out.println("Se aplica el 10% de descuento");
		return  10 ;
	}

	public String getCasaDeVenta() {
		return CasaDeVenta;
	}

	public void setCasaDeVenta(String casaDeVenta) {
		CasaDeVenta = casaDeVenta;
	}

	@Override
	public String toString() {
		return "AutoNuevo [CasaDeVenta=" + CasaDeVenta + "]";
	}
	
}
