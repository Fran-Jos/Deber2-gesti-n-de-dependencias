package com.example.demo.consesionario.repository;

import java.math.BigDecimal;

import com.example.demo.consesionario.modelo.Comprobante;

public class ComprobanteRepositoryImpl implements IcomprobanteRepository {

	@Override
	public Comprobante buscar_por_Numero(String numero) {
		// TODO Auto-generated method stub
		Comprobante comprobante = new Comprobante();
		comprobante.setNumero(numero);
		comprobante.setAuto("Toyota Hilux");
		comprobante.setMonto( new BigDecimal(23.333));
		comprobante.setNombreCliente("Francisco Chanataxi");
		
		
	
		return comprobante;
		
	}

	@Override
	public void actualizar(Comprobante comprobante) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertar(Comprobante comprobante) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(Comprobante comprobante) {
		// TODO Auto-generated method stub
		
	}

}
