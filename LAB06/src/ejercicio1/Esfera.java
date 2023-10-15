package ejercicio1;

public class Esfera extends FiguraTridimensional{
	private double radio;
	public Esfera(double r) {
		this.radio = r;
	}
	@Override
    public double obtenerArea() {
        return 4* Math.PI * Math.pow(radio, 2);
    }
	@Override
    public double obtenerVolumen() {
        return (4* Math.PI * Math.pow(radio, 3))/3 ;
    }
	@Override
    public void obtenerDescripcion() {
        System.out.println("Soy una Esfera de radio "+ radio);
    }
}
