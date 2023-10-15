package ejercicio1;

public class Triangulo extends FiguraBidimensional{
	private double base;
	private double altura;
	public Triangulo(double b, double h) {
		this.base = b;
		this.altura = h;
	}
	@Override
    public double obtenerArea() {
        return (base*altura)/2;
    }
	@Override
    public void obtenerDescripcion() {
        System.out.println("Soy un triangulo de base "+ base + " y altura "+ altura);
    }
}
