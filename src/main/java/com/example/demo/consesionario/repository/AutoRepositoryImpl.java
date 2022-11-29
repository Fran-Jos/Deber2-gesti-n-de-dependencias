package com.example.demo.consesionario.repository;

import java.math.BigDecimal;

import com.example.demo.consesionario.modelo.Auto;

public class AutoRepositoryImpl implements IautoRepository{

	@Override
	public Auto buscar_por_placa(String palca) {
		// TODO Auto-generated method stub
		Auto auto = new Auto();
		auto.setColor("negro");
		auto.setCosto(new BigDecimal(23.123));
		auto.setMarca("Chevrolet");
		auto.setModelo("Aveo");
		auto.setPlaca(palca);
		return auto;
	}

	@Override
	public void actualizar(Auto auto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertar(Auto auto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(Auto auto) {
		// TODO Auto-generated method stub
		
	}

}
