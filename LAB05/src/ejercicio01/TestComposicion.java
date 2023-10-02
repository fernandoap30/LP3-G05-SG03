package ejercicio01;

import java.util.Scanner;

public class TestComposicion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cuenta cuenta1 = new Cuenta(1000, 25000.0, 'C');
        Persona persona1 = new Persona(1, "Juan", "Perez", 'C');

        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Ingresar nombre");
            System.out.println("2. Ingresar apellido");
            System.out.println("3. Ingresar tipo de cliente");
            System.out.println("4. Depositar");
            System.out.println("5. Retirar");
            System.out.println("6. Mostrar información");
            System.out.println("7. Salir");
            System.out.print("Ingrese una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();  // Consume la nueva línea después del número

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nuevo nombre: ");
                    String nuevoNombre = scanner.nextLine();
                    persona1.setNombre(nuevoNombre);
                    break;
                case 2:
                    System.out.print("Ingrese el nuevo apellido: ");
                    String nuevoApellido = scanner.nextLine();
                    persona1.setApellido(nuevoApellido);
                    break;
                case 3:
                    System.out.print("Ingrese el nuevo tipo de cliente (B/E/C): ");
                    char nuevoTipoCliente = scanner.nextLine().charAt(0);
                    persona1.getCuenta().setTipo(nuevoTipoCliente);
                    break;
                case 4:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double cantidadDeposito = scanner.nextDouble();
                    persona1.getCuenta().depositar(cantidadDeposito);
                    break;
                case 5:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double cantidadRetiro = scanner.nextDouble();
                    persona1.getCuenta().retirar(cantidadRetiro);
                    break;
                case 6:
                    System.out.println(persona1.toString());
                    break;
                case 7:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
            }
        } while (opcion != 7);

        scanner.close();
    }
}