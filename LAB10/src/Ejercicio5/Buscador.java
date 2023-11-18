package Ejercicio5;

public class Buscador<T extends Number> {

    public int buscarElemento(T[] arreglo, T elemento) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].equals(elemento)) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
       
        Integer[] enteros = {1, 2, 3, 4, 5};

        Double[] decimales = {1.5, 2.5, 3.5, 4.5, 5.5};
        
        String[] cadena = {"uno","dos","tres","cuatro"};

        Buscador<Integer> buscadorEnteros = new Buscador<>();

        Buscador<Double> buscadorDecimales = new Buscador<>();
        
        //Buscador<String> buscadorCadena = new Buscador<>(); //error xq solo admite numeros, no string

        System.out.println("Posición del número 3 en el arreglo de enteros: " + buscadorEnteros.buscarElemento(enteros, 3));

        System.out.println("Posición del número 4.5 en el arreglo de decimales: " + buscadorDecimales.buscarElemento(decimales, 4.5));
        
        //System.out.println("Posición del número 4.5 en el arreglo de decimales: " + buscadorDecimales.buscarElemento(cadena, "dos"));
    }
}

