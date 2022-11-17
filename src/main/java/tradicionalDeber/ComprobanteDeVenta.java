package tradicionalDeber;

import java.time.LocalDateTime;

public class ComprobanteDeVenta {
	
	private LocalDateTime fechaVenta;
	private Auto auto;
	private Cliente cliente;
	
	public void comprovante(String NombreCliente , String CedulaCliente , Sexo s ,
			String marca ,String Color, TipoAuto tipo,String modelo,String placa,String Procedencia  ) {
		
		auto = new Auto();
		this.auto.setColor(Color);
		this.auto.setMarca(marca);
		this.auto.setModelo(modelo);
		this.auto.setPlaca(placa);
		this.auto.setProcedenciaAuto(Procedencia);
		this.auto.setTipo(tipo);
		System.out.println(auto);
		
		switch (Procedencia) {
		case "nuevo":
			AutoNuevo autoN = new AutoNuevo();
			autoN.setCasaDeVenta("Casa Baca");
			
			 this.auto = autoN;
			break;
			
		case "importado" :
			
			AutoImportado autoI = new AutoImportado();
			autoI.setCostoDeImportacion("5000 dolares");
			autoI.setPaisDeImportacion("Tailandia");
			this.auto = autoI;
			break;
			
		case "segunda":
			AutoDeSegunda autoS = new AutoDeSegunda();
			autoS.setCedulaExDuenio(1766555378);
			autoS.setKm_recorridos("15 kilometros recorridos");
			autoS.setNombreExDuenio("Francisco Chanataxi");
			this.auto = autoS;
			break;

		default:
			
			System.out.println("Tipo de auto no encontrado");
			break;
		}
		
		
		cliente = new Cliente();
		this.fechaVenta = LocalDateTime.now();
		this.cliente.setCedula(CedulaCliente);
		this.cliente.setNombre(NombreCliente);
		this.cliente.setSexo(s);
		
		confirmacionDeVenta(this);
		
	}
	
	public void confirmacionDeVenta(ComprobanteDeVenta c) {
		 System.out.println("la venta fue completada");
		 System.out.println(c);
	}

	@Override
	public String toString() {
		return "ComprobanteDeVenta \n[fechaVenta=" + fechaVenta + "\nauto=" + auto + "\ncliente=" + cliente + "]";
	}
	
	

}
