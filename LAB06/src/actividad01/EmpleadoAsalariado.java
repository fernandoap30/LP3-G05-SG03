package actividad01;

public class EmpleadoAsalariado extends Empleado {
	private double salarioSemanal;
	
	public EmpleadoAsalariado(String nombre, String apellido, String nss, double salario) {
		super(nombre,apellido,nss);
		establecerSalarioSemanal(salario);
	}

	public double obtenerSalarioSemanal() {
		return salarioSemanal;
	}

	public void establecerSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}
	
	@Override
	public double obtenerMontoPago(){
		return obtenerSalarioSemanal();
	}

	@Override
	public String toString() {
		return "EmpleadoAsalariado:" + super.getPrimerNombre()+" "+  super.getApellidoPaterno() +"\nnumero seguro social: "+super.getNumeroSeguroSocial() +" \nsalarioSemanal=" + salarioSemanal ;
	}
	
}
