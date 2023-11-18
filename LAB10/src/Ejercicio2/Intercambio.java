package Ejercicio2;

public class Intercambio {

    public static <T> void intercambiarElementos(T[] array, int indice1, int indice2) {
        if (indice1 < 0 || indice1 >= array.length || indice2 < 0 || indice2 >= array.length) {
            System.out.println("Índices fuera de rango. No se puede intercambiar.");
            return;
        }
        T temp = array[indice1];
        array[indice1] = array[indice2];
        array[indice2] = temp;
    }

    public static void main(String[] args) {
        Integer[] arrayEnteros = {1, 2, 3, 4, 5};
        String[] arrayCadenas = {"Uno", "Dos", "Tres", "Cuatro", "Cinco"};

        System.out.println("Array de enteros original: ");
        for (Integer elemento : arrayEnteros) {
            System.out.print(elemento + " ");
        }
        System.out.println();

        intercambiarElementos(arrayEnteros, 1, 3);
        System.out.println("Array de enteros después del intercambio: ");
        for (Integer elemento : arrayEnteros) {
            System.out.print(elemento + " ");
        }
        System.out.println();

        System.out.println("\nArray de cadenas original: ");
        for (String elemento : arrayCadenas) {
            System.out.print(elemento + " ");
        }
        System.out.println();
        intercambiarElementos(arrayCadenas, 0, 4);

        System.out.println("Array de cadenas después del intercambio: ");
        for (String elemento : arrayCadenas) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}