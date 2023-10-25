package actividad2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static int cociente(int numerador,int denominador) throws ArithmeticException{
		return numerador/denominador;
	}
	public static void main (String[] args) {
		Scanner explorador = new Scanner (System.in);
		boolean flag = false;
		do {
			try {
				System.out.println("Introduzca un numerador entero");
				int numerador = explorador.nextInt();
				System.out.println("Introduzca un denominador entero");
				int denominador = explorador.nextInt();
				
				int resultado = cociente(numerador,denominador);
				System.out.printf("\nResultado: %d / %d = %d\n",numerador,denominador,resultado);
				flag = false;
		
			}
			catch(InputMismatchException inputMismatchE){
				System.out.printf("\nExcepcion: %s\n", inputMismatchE);
				explorador.nextLine();
				System.out.println("Debe introducir enteros, Intente de nuevo.....");
			}
			catch(ArithmeticException arithmeticE) {
				System.out.printf("\nExcepcion: %s\n", arithmeticE);
				explorador.nextLine();
				System.out.println("Cero es un denominador invalido, Intente de nuevo....");
			}
		}while(flag);
	}
}
//Pruebe los diferentes escenario de error que se pueden generar para las cuales se ha definido las excepciones. 
//Verifique el manejo de estas excepciones al probar estas situaciones

//en este caso se maneja las excepciones en caso el usuario ingrese otro tipo de valor que no sea entero
//tambien se maneja el caso en que e usuario ingrese denominador = 0

//Teniendo en cuenta las pruebas realizadas y el análisis del programa anterior, ¿Cuáles son los métodos que están manejando las excepciones 
//que se producen, y si están estan propagandose o no?. Justifique su respuesta.

//yo creo que el catch maneja las excepciones, ya que es en esta parte del codigo donde se indica que error es el que se puede producir 
// y nos da un espacio para manejarlo con instrucciones en caso se produzca





