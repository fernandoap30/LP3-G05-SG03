package ejercicio04;


public class EmpleadoProduccion extends Asalariado {
	
	private String turno;

	public EmpleadoProduccion(String nombre, long dni, int diasVacaciones,double salario, String turno) {
		super(nombre, dni, diasVacaciones,salario);
		this.turno = turno;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String nuevo_turno) {
		this.turno = nuevo_turno;
	}
	
	@Override
	public double getSalario() {
		double neosalario = super.getSalario() + (super.getSalario()*15/100);
		System.out.println(neosalario);
		return neosalario;
	}

	@Override
	public String toString() {
		return "Empleado de Produccion \nDni: " + super.getDni() + "\nNombre:" + super.getNombre() +"\nVacaciones: " + super.getDiasVacaciones() + " dias \nSalario: "
				+ getSalario() +"\t \tTurno: " + turno;
	}
	
	
}