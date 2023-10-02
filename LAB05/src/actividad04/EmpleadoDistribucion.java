package actividad04;

public class EmpleadoDistribucion extends Asalariado {
	
	private String region;

	public EmpleadoDistribucion(String nombre, long dni, int diasVacaciones, String region) {
		super(nombre, dni, diasVacaciones);
		this.region = region;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String nuevo_region) {
		this.region = nuevo_region;
	}

}
