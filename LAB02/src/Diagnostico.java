public class Diagnostico {
	public void aptoVacunaA(Perro p1) {
		double temp = p1.getTemp();
		double peso = p1.peso;
		double edad = p1.getEdad();
		if (temp >=37 && temp <= 40 && peso > 5 && edad >1) {
			System.out.println("perro sano");
		}
		else {
			System.out.println("perro enfermo");
		}
	}
	public void aptoVacunaB(double edad, double peso, double temp) {
		if (temp >=37 && temp <= 40 && peso > 5 && edad >1) {
			System.out.println("perro sano");
		}
		else {
			System.out.println("perro enfermo");
		}
	}
}
