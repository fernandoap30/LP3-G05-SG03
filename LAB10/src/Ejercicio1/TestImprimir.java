package Ejercicio1;

public class TestImprimir {

    public static <T> void imprimirArray(T[] array) {
        for (T elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
    
    public static void imprimirArray(String[] array) {
        int columnas = 4;  // ajustar el número de columnas

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
            if ((i + 1) % columnas == 0 || i == array.length - 1) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        String[] arrayCadenas = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho"};
        System.out.println("Array de cadenas contiene:");
        imprimirArray(arrayCadenas);
    }
}