package actividad01;

public abstract class  Empleado implements PorPagar{
	private String PrimerNombre;
	private String ApellidoPaterno;
	private String numeroSeguroSocial;
	public Empleado(String Nombre, String apellido, String nss) {
		PrimerNombre = Nombre;
		ApellidoPaterno = apellido;
		numeroSeguroSocial = nss;
	}
	public String getPrimerNombre() {
		return PrimerNombre;
	}
	public void setPrimerNombre(String primerNombre) {
		PrimerNombre = primerNombre;
	}
	public String getApellidoPaterno() {
		return ApellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		ApellidoPaterno = apellidoPaterno;
	}
	public String getNumeroSeguroSocial() {
		return numeroSeguroSocial;
	}
	public void setNumeroSeguroSocial(String numeroSeguroSocial) {
		this.numeroSeguroSocial = numeroSeguroSocial;
	}
	
	
}
