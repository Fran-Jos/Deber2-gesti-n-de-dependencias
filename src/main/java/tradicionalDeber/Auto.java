package tradicionalDeber;

public class Auto {
	
	private String Marca;
	private String color;
	private TipoAuto tipo;
	private String modelo;
	private String placa;
	private String procedenciaAuto;
	
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public TipoAuto getTipo() {
		return tipo;
	}
	public void setTipo(TipoAuto tipo) {
		this.tipo = tipo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	
	public String getProcedenciaAuto() {
		return procedenciaAuto;
	}
	public void setProcedenciaAuto(String procedenciaAuto) {
		this.procedenciaAuto = procedenciaAuto;
	}
	@Override
	public String toString() {
		return "Auto [Marca=" + Marca + ", color=" + color + ", tipo=" + tipo + ", modelo=" + modelo + ", placa="
				+ placa + ", ProcedenciaAuto=" + procedenciaAuto + "]";
	}
	
	
	
	/*public Auto() {
		
	}
*/
	
}
