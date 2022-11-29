package com.example.demo.consesionario.repository;


import com.example.demo.consesionario.modelo.Cliente;

public interface IclienteRepository {

	public Cliente buscar_por_cedula (String cedula);
	public void actualizar(Cliente cliente);
	public void insertar(Cliente cliente);
	public void borrar(Cliente cliente);
	
}
