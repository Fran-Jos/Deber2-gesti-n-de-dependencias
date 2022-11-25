package com.example.herencia;

import java.time.LocalDateTime;

public class ComprobanteDeVentaH {
	
	private LocalDateTime fechaVenta;
	private AutoH auto;
	private ClienteH cliente;
	
	public void comprovante(LocalDateTime fv , AutoH auto , ClienteH cliente ) {
		
		fechaVenta = fv;
		
		Integer valorDesc = auto.descuento();
		System.out.println("valor descuento : " + valorDesc);
		
		System.out.println(auto);
		System.out.println(cliente);
		cliente = this.cliente;
		confirmacionDeVenta(this);
		

	}
	
	public void confirmacionDeVenta(ComprobanteDeVentaH c) {
		 System.out.println("la venta fue completada");
		
		 System.out.println(c);
	}

	@Override
	public String toString() {
		return "ComprobanteDeVenta \n[fechaVenta=" + fechaVenta +"]";
	}
	
	

}
