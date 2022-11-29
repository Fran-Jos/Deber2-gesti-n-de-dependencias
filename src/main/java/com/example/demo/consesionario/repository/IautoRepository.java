package com.example.demo.consesionario.repository;

import com.example.demo.consesionario.modelo.Auto;

public interface IautoRepository {
	
	public Auto buscar_por_placa (String palca);
	public void actualizar(Auto auto);
	public void insertar(Auto auto);
	public void borrar(Auto auto);
	
	

}
