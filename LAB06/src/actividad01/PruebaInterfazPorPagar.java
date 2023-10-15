package actividad01;

public class PruebaInterfazPorPagar {
	public static void main(String[] args) {
		PorPagar[] objetosPorPagar = new PorPagar[5];
		
		objetosPorPagar[0] = new Factura("0123","asiento",2,375);
		objetosPorPagar[1] = new Factura("4567","llanta",4,79.9);
		objetosPorPagar[2] = new EmpleadoAsalariado("John","Smith","111-111-111",375);
		objetosPorPagar[3] = new EmpleadoAsalariado("elisa","barners","211-111-111",975);
		objetosPorPagar[4] = new Prestamo(20,975.5);
		
		System.out.println("Facturas y empleados procesados de forma polimórfica\n");
		
		for (PorPagar porPagarActual: objetosPorPagar) {
			System.out.printf("%s \n%s: $%, .2f\n\n", porPagarActual.toString(), "pago vencido", porPagarActual.obtenerMontoPago());
		}
	}
}
