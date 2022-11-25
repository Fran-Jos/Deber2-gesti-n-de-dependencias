package com.example.herencia;

import java.time.LocalDateTime;

public class MainFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AutoH auto = new AutoH();
	
		AutoDeSegundaH as = new AutoDeSegundaH();
		
		as.setTipo(TipoAutoH.Automovil_simple);
		as.setProcedenciaAuto("sengunda");
		as.setPlaca("PCU-4333");
		as.setNombreExDuenio("Isaac Martinez");
		as.setModelo("Corolla");
		as.setMarca("TOYOTA");
		as.setKm_recorridos("10.000 km/h");
		as.setColor("Negro");
		as.setCedulaExDuenio(1234242);
		
		ClienteH cl = new ClienteH();
		cl.setNombre("Gabriela Taco");
		cl.setCedula("1293678883");
		cl.setSexo(SexoH.mujer);
		
		ComprobanteDeVentaH c1 = new ComprobanteDeVentaH();
		
		c1.comprovante(LocalDateTime.of(2022, 12,2,8,30), as, cl);
		
		//c1.comprovante("Jose Mancheno", "1234344344", SexoH.hombre ,"Toyota","Negro",TipoAutoH.Camioneta_full,"Hilux", "PCU-2331", "segunda");
		

	}
	
	

}
