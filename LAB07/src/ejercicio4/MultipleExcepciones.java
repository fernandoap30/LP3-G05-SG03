package ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExcepciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese un número entero positivo: ");
            double numero = scanner.nextInt();

            if (numero < 0) {
                throw new IllegalArgumentException("El número debe ser positivo.");
            }

            double resultado = division(10, numero);
            System.out.println("Resultado de la división: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Ha ingresado un valor no válido. Por favor, ingrese un número entero positivo.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error de división por cero: " + e);
        }
    }

    private static double division(double numerador, double denominador) {
        if (denominador == 0) {
            throw new ArithmeticException("Error de división por cero");
        }
        return numerador / denominador;
    }
}