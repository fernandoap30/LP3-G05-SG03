package Ejercicio6;

import java.util.Arrays;

public class CopyArrayExample {

    public static <T> T[] copyArray(T[] array1, T[] array2) {
        
        T[] resultArray = Arrays.copyOf(array1, array1.length + array2.length);

        int index = array1.length;  

        for (T element : array2) {
            if (!contains(resultArray, element)) {
                resultArray[index++] = element;
            }
        }

        return Arrays.copyOf(resultArray, index);
    }

    private static <T> boolean contains(T[] array, T element) {
        for (T item : array) {
            if (item != null && item.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        
        String[] arrayString1 = {"uno", "dos", "tres"};
        String[] arrayString2 = {"dos", "tres", "cuatro"};

        String[] resultStringArray = copyArray(arrayString1, arrayString2);
        System.out.println("Array combinado de tipo String: " + Arrays.toString(resultStringArray));

        
        Producto[] arrayProducto1 = {
                new Producto("001", "Producto 1", 10.0),
                new Producto("002", "Producto 2", 15.0),
                new Producto("003", "Producto 3", 20.0)
        };
        Producto[] arrayProducto2 = {
                new Producto("002", "Producto 2", 15.0),
                new Producto("004", "Producto 4", 25.0),
                new Producto("005", "Producto 5", 30.0)
        };

        Producto[] resultProductoArray = copyArray(arrayProducto1, arrayProducto2);
        System.out.println("Array combinado de tipo Producto: " + Arrays.toString(resultProductoArray));

        
        Persona[] arrayPersona1 = {
                new Persona("123", "Juan", "Calle 1"),
                new Persona("456", "Ana", "Calle 2"),
                new Persona("789", "Pedro", "Calle 3")
        };
        Persona[] arrayPersona2 = {
                new Persona("456", "Ana", "Calle 2"),
                new Persona("101", "María", "Calle 4"),
                new Persona("789", "Pedro", "Calle 3")
        };

        Persona[] resultPersonaArray = copyArray(arrayPersona1, arrayPersona2);
        System.out.println("Array combinado de tipo Persona: " + Arrays.toString(resultPersonaArray));
    }
}

class Producto {
    private String codigo;
    private String descripcion;
    private double precio;

    public Producto(String codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Producto producto = (Producto) obj;
        return codigo.equals(producto.codigo);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }
}

class Persona {
    private String dni;
    private String nombres;
    private String direccion;

    public Persona(String dni, String nombres, String direccion) {
        this.dni = dni;
        this.nombres = nombres;
        this.direccion = direccion;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Persona persona = (Persona) obj;
        return dni.equals(persona.dni);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", nombres='" + nombres + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
