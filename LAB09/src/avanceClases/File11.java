package avanceClases;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class File11{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		PrintWriter salida = null;
		
		try {
			salida = new PrintWriter("C:\\Users\\DELL\\Desktop\\ejercicio\\otrosdatos.txt"); 
			String cadena;
			System.out.println("Introduce texto. Para acabar Introduce la cadena PIN:");
			cadena = sc.nextLine();
			while (!cadena. equalsIgnoreCase ("FIN")) {
				salida.println(cadena);
				cadena= sc.nextLine();
			}
			salida.flush();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}finally {
			salida.close();
		}
	}
}