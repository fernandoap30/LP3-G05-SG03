package ejercicio04;

public class EmpleadoDistribucion extends Asalariado {
	
	private String region;

	public EmpleadoDistribucion(String nombre, long dni, int diasVacaciones,double salario, String region) {
		super(nombre, dni, diasVacaciones,salario);
		this.region = region;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String nuevo_region) {
		this.region = nuevo_region;
	}
	
	@Override
	public double getSalario() {
		double neosalario = super.getSalario() + (super.getSalario()*10/100);
		return neosalario;
	}

	@Override
	public String toString() {
		return "Empleado de Distribucion \nDni: " + super.getDni() + "\nNombre:" + super.getNombre() +"\nVacaciones: " + super.getDiasVacaciones() + " dias \nSalario: "
				+ getSalario() +"\t \tRegion: " + region;
	}
	
	
}
