package ejercicio03;

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
            System.out.println("4. Eliminar cliente");
            System.out.println("5. Ver información del cliente (tipo)");
            System.out.println("6. Salir");
            System.out.print("Elija una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después del número

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombreCliente = scanner.nextLine();
                    System.out.print("Ingrese el tipo de cuenta (C/B/E): ");
                    char tipoCuenta = scanner.nextLine().charAt(0);
                    if (tipoCuenta != 'C' && tipoCuenta != 'B' && tipoCuenta != 'E') {
                        tipoCuenta = 'C';
                        System.out.println("Tipo de cuenta no válido. Se asignó automáticamente como 'C'.");
                    }
                    Persona nuevoCliente = new Persona(nombreCliente, tipoCuenta);
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
                    System.out.print("Ingrese el nombre del cliente a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    Persona clienteEliminado = banco.darBajaCliente(nombreEliminar);
                    if (clienteEliminado != null) {
                        System.out.println("Cliente eliminado: " + clienteEliminado);
                    } else {
                        System.out.println("Cliente no encontrado.");
                    }
                    break;
                case 5:
                    System.out.print("Ingrese el nombre del cliente para ver su tipo: ");
                    String nombreVerTipo = scanner.nextLine();
                    Persona clienteTipo = banco.buscarCliente(nombreVerTipo);
                    if (clienteTipo != null) {
                        System.out.println("Tipo de cuenta del cliente: " + clienteTipo.getTipoCuenta());
                    } else {
                        System.out.println("Cliente no encontrado.");
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
            }
        }
    }
}
