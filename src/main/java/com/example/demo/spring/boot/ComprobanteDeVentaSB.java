package com.example.demo.spring.boot;

import java.time.LocalDateTime;


import org.springframework.stereotype.Service;

@Service
public class ComprobanteDeVentaSB {
	
	private LocalDateTime fechaVenta;
	private AutoSB auto;
	private ClienteSB cliente;
	
	public void comprovante(LocalDateTime fv , AutoSB auto , ClienteSB cliente ) {
		
		fechaVenta = fv;
		
		Integer valorDesc = auto.descuento();
		System.out.println("valor descuento : " + valorDesc);
		
		//System.out.println(auto);
		//System.out.println(cliente);
	    this.cliente = cliente;
		confirmacionDeVenta(this);
		

	}
	
	public void confirmacionDeVenta(ComprobanteDeVentaSB c) {
		 System.out.println("la venta fue completada");
		
		 System.out.println(c);
	}

	@Override
	public String toString() {
		return "ComprobanteDeVenta \n[fechaVenta=" + fechaVenta +"]";
	}
	
	

}
