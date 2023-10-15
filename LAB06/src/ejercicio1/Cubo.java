package ejercicio1;

public class Cubo extends FiguraTridimensional{
	private double lado;
	public Cubo(double l) {
		this.lado = l;
	}
	@Override
    public double obtenerArea() {
        return 6 * Math.pow(lado, 2);
    }
	@Override
    public double obtenerVolumen() {
        return Math.pow(lado, 3);
    }
	@Override
    public void obtenerDescripcion() {
        System.out.println("Soy un Cubo de lado "+ lado);
    }
}
