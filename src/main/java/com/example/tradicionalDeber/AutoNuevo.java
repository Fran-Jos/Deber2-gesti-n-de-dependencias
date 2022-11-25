package com.example.tradicionalDeber;

public class AutoNuevo extends Auto {

	private String CasaDeVenta;

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
