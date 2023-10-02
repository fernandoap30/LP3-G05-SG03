package actividad02;

public class Automovil {
	private String placa, marca, modelo;
	private Motor motor;
	private int numPuertas;
	
	public Automovil(String placa, int numPuertas, String marca, String modelo) {
		this.placa = placa;
		this.numPuertas = numPuertas;
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	@Override
	public String toString() {
		return "Automovil [placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", numPuertas=" + numPuertas
				+ "]";
	}
	
	
}
