package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component
public class AutoDeSegundaSB extends AutoSB {
private String nombreExDuenio;
private int cedulaExDuenio;
private String km_recorridos ;

 
	public Integer descuento() {
		System.out.println("No aplica descuento COSTO FIJO");
		return 0;
	}

public String getNombreExDuenio() {
	return nombreExDuenio;
}
public void setNombreExDuenio(String nombreExDuenio) {
	this.nombreExDuenio = nombreExDuenio;
}
public int getCedulaExDuenio() {
	return cedulaExDuenio;
}
public void setCedulaExDuenio(int cedulaExDuenio) {
	this.cedulaExDuenio = cedulaExDuenio;
}
public String getKm_recorridos() {
	return km_recorridos;
}
public void setKm_recorridos(String km_recorridos) {
	this.km_recorridos = km_recorridos;
}
@Override
public String toString() {
	return "AutoDeSegunda [nombreExDuenio=" + nombreExDuenio + ", cedulaExDuenio=" + cedulaExDuenio + ", km_recorridos="
			+ km_recorridos + "]";
}



}
