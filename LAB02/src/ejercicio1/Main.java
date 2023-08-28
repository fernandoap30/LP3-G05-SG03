package ejercicio1;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		CuentaBanco c1;
		Scanner s1 = new Scanner(System.in);
		System.out.println("ingrese el nombre del titular: ");
		String titular = s1.next();
		System.out.println("desea ingresar una cantidad inicial? (Si = 1 / No = 0) ");
		int decision = s1.nextInt();
		if (decision == 1) {
			System.out.println("ingrese la cantidad inicial del titular: ");
			int cant = s1.nextInt();
			c1 = new CuentaBanco(titular,cant);
			c1.mostrardatos();
			c1.menu();
		}
		if(decision == 0) {
			c1 = new CuentaBanco(titular);
			c1.mostrardatos();
			c1.menu();
		}
	}
}
