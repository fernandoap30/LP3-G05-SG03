package actividad;
import java.util.Scanner;
public class App {
	public static int cociente(int numerador,int denominador) {
		return numerador/denominador;
	}
	public static void main (String[] args) {
		Scanner explorador = new Scanner (System.in);
		System.out.println("Introduzca un numerador entero");
		int numerador = explorador.nextInt();
		System.out.println("Introduzca un denominador entero");
		int denominador = explorador.nextInt();
		
		int resultado = cociente(numerador,denominador);
		System.out.printf("\nResultado: %d / %d = %d\n",numerador,denominador,resultado);
	}
}

//que situaciones de error podrian ocurrir?
//si el usuario ingresa como denominador 0 se genera un error

//que es un rastreo de pila
//es un informe donde se ve el proceso de llamadas de funciones o metodos que llevan a un programa a un estado en particular