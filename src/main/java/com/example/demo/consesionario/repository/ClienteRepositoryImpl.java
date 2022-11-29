package com.example.demo.consesionario.repository;

import java.math.BigDecimal;

import com.example.demo.consesionario.modelo.Cliente;


public class ClienteRepositoryImpl implements IclienteRepository {

	@Override
	public Cliente buscar_por_cedula(String cedula) {
		// TODO Auto-generated method stub
		
		Cliente cliente = new Cliente();
	
		cliente.setCedula("12223423454");
		cliente.setNombre("Francisco Mancheno");
		cliente.setSexo("M");
		
		return cliente;
	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertar(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	
}
