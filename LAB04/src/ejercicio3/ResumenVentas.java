package ejercicio3;

import java.util.Scanner;
public class ResumenVentas {
	public static void main(String[] args) {
		int numVendedores = 4;
		int numProductos = 5;
		double[][] ventas = new double[numProductos][numVendedores];
		// Leer la Informacion de Ventas
		Scanner entrada = new Scanner(System.in);
		for(int i = 0; i < numProductos; i++) {
			for(int j = 0; j < numVendedores; j++) {
				System.out.println("Ingrese las ventas del vendedor " + (j + 1) + " para el producto " + (i + 1) + ": ");
				ventas[i][j] = entrada.nextDouble();
			}
		}
		double[] ventasTotalVendedor = new double[numVendedores];
		double[] ventasTotalProducto = new double[numProductos];
		for(int i = 0; i < numProductos; i++) {
			for(int j = 0; j < numVendedores; j++) {
				ventasTotalVendedor[j] += ventas[i][j];
				ventasTotalProducto[i] += ventas[i][j];
			}
		}
		System.out.println("Resumen de Ventas:");
        System.out.printf("%-10s", "Producto");
        for (int j = 1; j <= numVendedores; j++) {
            System.out.printf("Vendedor %d\t", j);
        }
        System.out.println("Total Producto");
        for (int i = 0; i < numProductos; i++) {
            System.out.printf("%-10d", (i + 1));
            for (int j = 0; j < numVendedores; j++) {
                System.out.printf("%.2f\t\t", ventas[i][j]);
            }
            System.out.printf("%.2f\n", ventasTotalProducto[i]);
        }

        System.out.print("Total Vendedor\t");
        for (int j = 0; j < numVendedores; j++) {
            System.out.printf("%.2f\t\t", ventasTotalVendedor[j]);
        }
		entrada.close();
	}
}
