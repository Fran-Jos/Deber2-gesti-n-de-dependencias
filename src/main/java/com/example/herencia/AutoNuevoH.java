package com.example.herencia;

public class AutoNuevoH extends AutoH {

	private String CasaDeVenta;
	
	@Override
	protected Integer descuento() {
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
