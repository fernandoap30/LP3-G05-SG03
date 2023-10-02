package actividad03;

import java.util.Scanner;

public class TestAsociacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco("MiBanco", 10);

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Agregar nuevo cliente");
            System.out.println("2. Mostrar información del banco");
            System.out.println("3. Buscar cliente");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombreCliente = scanner.nextLine();
                    Persona nuevoCliente = new Persona(nombreCliente);
                    banco.agregarCliente(nuevoCliente);
                    break;
                case 2:
                    System.out.println(banco);
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del cliente a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    Persona clienteEncontrado = banco.buscarCliente(nombreBuscar);
                    if (clienteEncontrado != null) {
                        System.out.println("Cliente encontrado: " + clienteEncontrado);
                    } else {
                        System.out.println("Cliente no encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
            }
        }
    }
}
