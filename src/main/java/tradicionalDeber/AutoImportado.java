package tradicionalDeber;

public class AutoImportado extends Auto{

	private String PaisDeImportacion;
	private String CostoDeImportacion;
	
	public String getPaisDeImportacion() {
		return PaisDeImportacion;
	}
	public void setPaisDeImportacion(String paisDeImportacion) {
		PaisDeImportacion = paisDeImportacion;
	}
	public String getCostoDeImportacion() {
		return CostoDeImportacion;
	}
	public void setCostoDeImportacion(String costoDeImportacion) {
		CostoDeImportacion = costoDeImportacion;
	}
	@Override
	public String toString() {
		return "AutoImportado [PaisDeImportacion=" + PaisDeImportacion + ", CostoDeImportacion=" + CostoDeImportacion
				+ "]";
	}
	
	
}
