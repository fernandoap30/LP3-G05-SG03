package avanceClases;

import java.util.Scanner;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Binarios1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		FileOutputStream fos = null;
		DataOutputStream salida = null;
		int n;
		
		try {
			fos = new FileOutputStream("/ficheros/datos.dat");
			salida = new DataOutputStream(fos);
			
			System.out.print ("Introduce número entero. -1 para acabar: ");
			n= sc.nextInt();
			while (n != -1) {
				salida.writeInt(n);
				System.out.print("Introduce número entero. -1 para acabar: ");
				n = sc. nextInt ();
			}
		}catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
				if (salida != null) {
					salida.close();
				} 
			}catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
