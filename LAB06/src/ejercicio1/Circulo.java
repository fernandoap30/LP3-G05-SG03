package ejercicio1;

public class Circulo extends FiguraBidimensional {
	private double radio;
	final static String color= "Rojo";
	public Circulo(double r) {
		this.radio = r;
	}
	@Override
    public double obtenerArea() {
        return Math.PI * Math.pow(radio,2);
    }
	@Override
    public void obtenerDescripcion() {
        System.out.println("Soy un circulo de radio "+ radio);
    }
	public String obtenerColor() {
        return color;
    }
}
