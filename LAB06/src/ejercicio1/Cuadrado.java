package ejercicio1;

public class Cuadrado extends FiguraBidimensional {
	private double lado;
	public Cuadrado(double l) {
		this.lado = l;
	}
	@Override
    public double obtenerArea() {
        return lado * lado;
    }
	@Override
    public void obtenerDescripcion() {
        System.out.println("Soy un cuadrado de lado "+ lado);
    }
}
