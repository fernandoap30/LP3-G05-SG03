package Ejercicio4;
public class BusquedaUtil {

    public static <T> int buscarElemento(T[] arreglo, T elemento) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
       
        Producto[] productos = {
            new Producto("001", "Producto1", 10.0),
            new Producto("002", "Producto2", 15.0),
            new Producto("003", "Producto3", 20.0)
        };

        Producto productoABuscar = new Producto("002", "Producto2", 15.0);
        
        Persona[] personas = {
                new Persona("001", "Persona1", "direccion1"),
                new Persona("002", "Persona2", "direccion2"),
                new Persona("003", "Persona3", "direccion3")
            };

        Persona personaABuscar = new Persona("001", "Persona2","direccion2");
            
        Estudiante[] estudiantes = {
                new Estudiante("001", "Estudiante1","direccion1","carrera1"),
                new Estudiante("002", "Estudiante2", "direccion2","carrera2"),
                new Estudiante("003", "Estudiante3", "direccion3","carrera3")
            };

        Estudiante estudianteABuscar = new Estudiante("002", "Estudiante2", "direccion2","carrera2");
            
        
        int posicionProducto = buscarElemento(productos, productoABuscar);
        int posicionPersona = buscarElemento(personas, personaABuscar);
        int posicionEstudiante = buscarElemento(estudiantes, estudianteABuscar);

        if (posicionProducto != -1) {
            System.out.println("El producto se encuentra en la posición: " + posicionProducto);
        } else {
            System.out.println("El producto no fue encontrado (-1)");
        }
        if (posicionPersona != -1) {
            System.out.println("La persona se encuentra en la posición: " + posicionProducto);
        } else {
            System.out.println("La persona no fue encontrada (-1)");
        }
        if (posicionEstudiante != -1) {	
            System.out.println("El estudiante se encuentra en la posición: " + posicionProducto);
        } else {
            System.out.println("El estudiante no fue encontrado (-1)");
        }
       
    }
}




