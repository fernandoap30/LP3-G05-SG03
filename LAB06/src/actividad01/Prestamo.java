package actividad01;

public class Prestamo implements PorPagar {
	int numeroDeCuotas;
	double montoDeCuota;
	
	public Prestamo(int numeroDeCuotas, double montoDeCuota) {
		super();
		this.numeroDeCuotas = numeroDeCuotas;
		this.montoDeCuota = montoDeCuota;
	}

	public int getNumeroDeCuotas() {
		return numeroDeCuotas;
	}

	public void setNumeroDeCuotas(int numeroDeCuotas) {
		this.numeroDeCuotas = numeroDeCuotas;
	}

	public double getMontoDeCuota() {
		return montoDeCuota;
	}

	public void setMontoDeCuota(double montoDeCuota) {
		this.montoDeCuota = montoDeCuota;
	}

	@Override
	public String toString() {
		return "Prestamo: \nnumeroDeCuotas: " + numeroDeCuotas + "\nmontoDeCuota: " + montoDeCuota;
	}
	
	@Override
	public double obtenerMontoPago(){
		return getNumeroDeCuotas() * getMontoDeCuota();
	}
	
}
