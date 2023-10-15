package ejercicio1;

public class Tetraedro extends FiguraTridimensional{
	private double arista;
	final static String aplicacion = "EGYPTO";
	public Tetraedro(double a) {
		this.arista = a;
	}
	@Override
    public double obtenerArea() {
        return Math.pow(arista, 2)* Math.pow(3, 0.5);
    }
	@Override
    public double obtenerVolumen() {
        return (Math.pow(arista, 3)* Math.pow(2, 0.5))/12;
    }
	@Override
    public void obtenerDescripcion() {
        System.out.println("Soy un Tetraedro de arista "+ arista);
    }
	public String obtenerAplicacion() {
        return aplicacion;
    }
}
