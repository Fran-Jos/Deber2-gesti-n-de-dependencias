package com.example.demo;

import java.time.LocalDateTime;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.spring.boot.*;


@SpringBootApplication
public class ProyetoAutosD2Application implements CommandLineRunner {
   
	@Autowired
	
	private AutoNuevoSB autoNuevo;
	@Autowired
	private ComprobanteDeVentaSB fac;
	@Autowired
	private ClienteSB cliente;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyetoAutosD2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("SPRING BOOT");
		
		
		this.autoNuevo.setTipo(TipoAutoSB.Camioneta_simple);
		this.autoNuevo.setProcedenciaAuto("nuevo");
		this.autoNuevo.setPlaca("PYC-8775");
		this.autoNuevo.setModelo("Hilux");
		this.autoNuevo.setMarca("TOYOTA");
		this.autoNuevo.setColor("Rojo");
	
		
		this.autoNuevo.setCasaDeVenta("Casa baca");
		
		this.cliente.setCedula("231313131231");
		this.cliente.setNombre("FRancisco");
		this.cliente.setSexo(SexoSB.hombre);
		
		System.out.println(autoNuevo);
		
		fac.comprovante(LocalDateTime.of(2022,12 ,2,8,30), autoNuevo, cliente);
	}

}
