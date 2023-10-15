package actividad01;

public class Factura implements PorPagar{
	private String numeroPieza;
	private String descripcionPieza;
	private int cantidad;
	private double precioPorArticulo;
	
	public Factura(String pieza, String descripcion, int cuenta, double precio) {
		numeroPieza = pieza;
		descripcionPieza = descripcion;
		EstablecerCantidad(cuenta);
		EstablecerPrecioPorArticulo(precio);
	}
	
	public int obtenerCantidad() {
		return cantidad;
	}

	public void EstablecerCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double obtenerPrecioPorArticulo() {
		return precioPorArticulo;
	}

	public void EstablecerPrecioPorArticulo(double precioPorArticulo) {
		this.precioPorArticulo = precioPorArticulo;
	}

	@Override
	public double obtenerMontoPago(){
		return obtenerCantidad() * obtenerPrecioPorArticulo();
	}

	@Override
	public String toString() {
		return "Factura: \nnumeroPieza=" + numeroPieza + "\ndescripcionPieza=" + descripcionPieza + "\ncantidad="
				+ cantidad + "\nprecioPorArticulo=" + precioPorArticulo;
	}
	
}
