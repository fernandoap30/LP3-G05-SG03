package avanceClases;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File15 {
	
	public static void main(String[] args) {
	
		File f = new File("C:\\\\Users\\\\DELL\\\\Desktop\\\\ejercicio\\\\otrosdatos.txt");
		int numero, suma = 0, cont =0;
		Scanner entrada = null;
		
		try {
			entrada = new Scanner(f);
			while (entrada.hasNextInt()) {
				numero = entrada.nextInt();
				System.out.println(numero);
				suma = suma + numero;
				cont++;
			}
			System.out.println("Numeros leidos" + cont);
			System.out.println("Suma " + suma);
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}finally {
			entrada.close();
		}
	}
}
				