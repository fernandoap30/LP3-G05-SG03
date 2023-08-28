package ejercicio1;
import java.util.Scanner;

public class CuentaBanco {
	public String titular;
	private double cantidad;
	public CuentaBanco(String titular) {
		super();
		this.titular = titular;
		this.cantidad = 0;
	}
	public CuentaBanco(String titular,double cantidad) {
		super();
		this.titular = titular;
		this.cantidad = cantidad;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "CuentaBanco [titular=" + titular + ", cantidad=" + cantidad + "]";
	}
	public void ingresar(double cant) {
		if (cant > 0) {
		cantidad += cant;
		}
	}
	public void retirar(double cant) {
		cantidad -= cant;
		if (cantidad <0) {
			cantidad = 0;
		}
	}
	public void mostrardatos() {
		System.out.println(titular);
		System.out.println(cantidad);
	}
	public void menu() {
		int opcion = 1;
		double cant = 0;
		Scanner s1 = new Scanner(System.in);
		while(opcion >0 && opcion < 4) {
			System.out.println("que desea realizar: ");
			System.out.println("1. ingresar dinero: " );
			System.out.println("2. retirar dinero: " );
			System.out.println("3. mostrar saldo: " );
			System.out.println("0. Salir: " );
			opcion = s1.nextInt();
			
			switch(opcion) {
				case 0:
				System.out.println("Saliendo del programa: " );
				break;
				case 1:
					System.out.println("ingresar el monto: " );
					cant = s1.nextDouble();
					ingresar(cant);
					break;
				case 2:
					System.out.println("ingresar el monto: " );
					cant = s1.nextDouble();
					retirar(cant);
					break;
				case 3:
					System.out.println("Saldo actual: " + cantidad );
					break;
			}
			
		}
	}
}

/*
if (opcion == 1) {
	System.out.println("ingresar el monto: " );
	cant = s1.nextDouble();
	ingresar(cant);
}
if (opcion == 2) {
	System.out.println("ingresar el monto: " );
	cant = s1.nextDouble();
	retirar(cant);
}
if (opcion == 3) {
	System.out.println("Saldo actual: " + cantidad );
}
if (opcion == 0) {
	break;
}
*/

