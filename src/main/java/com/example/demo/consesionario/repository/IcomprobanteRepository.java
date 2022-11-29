package com.example.demo.consesionario.repository;

import com.example.demo.consesionario.modelo.Comprobante;

public interface IcomprobanteRepository {
	
	public Comprobante buscar_por_Numero (String numero );
	public void actualizar(Comprobante comprobante);
	public void insertar(Comprobante comprobante);
	public void borrar(Comprobante comprobante);

}
