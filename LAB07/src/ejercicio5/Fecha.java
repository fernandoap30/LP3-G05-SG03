package ejercicio5;

public class Fecha {
	int dia;
	int hora;
	int minutos;
	
	public Fecha(int dia, int hora, int minutos) {
		this.dia = dia;
		this.hora = hora;
		this.minutos = minutos;
		invariant();
	}

	private void invariant() {
		assert (1 <= dia && dia <= 31) : "Dia incorrectos";
		
		assert (0 <= hora && hora < 24) : "Hora incorrecta";
		
		assert (1 <= minutos && minutos < 60) : "Minutos Incorrecto";
	}

	public static void main(String[] args) {
		Fecha a = new Fecha(44321323, 103213120, 123123120);
		
	}
}