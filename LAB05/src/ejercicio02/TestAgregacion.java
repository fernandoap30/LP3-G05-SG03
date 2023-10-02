package ejercicio02;
import java.util.Scanner;

public class TestAgregacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Automovil automovil = null;
        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Ingresar un automóvil con motor");
            System.out.println("2. Ingresar un automóvil sin motor");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    Motor motor = ingresarMotor(scanner);
                    automovil = ingresarAutomovilConMotor(scanner, motor);
                    break;
                case 2:
                    automovil = ingresarAutomovilSinMotor(scanner);
                    break;
                case 3:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
            if (automovil != null) {
                System.out.println("\nInformación del automóvil ingresado:");
                System.out.println(automovil);
            }
        }
    }
    private static Motor ingresarMotor(Scanner scanner) {
        System.out.println("Ingresando los datos del motor:");
        System.out.print("Número de motor: ");
        int numMotor = scanner.nextInt();
        scanner.nextLine();
        System.out.print("RPM del motor: ");
        int rpm = scanner.nextInt();
        scanner.nextLine();
        return new Motor(numMotor, rpm);
    }
    private static Automovil ingresarAutomovilConMotor(Scanner scanner, Motor motor) {
        System.out.println("Ingresando un automóvil con motor:");
        System.out.print("Placa: ");
        String placa = scanner.nextLine();
        System.out.print("Número de puertas: ");
        int numPuertas = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        return new Automovil(placa, numPuertas, marca, modelo, motor);
    }
    private static Automovil ingresarAutomovilSinMotor(Scanner scanner) {
        System.out.println("Ingresando un automóvil sin motor:");
        System.out.print("Placa: ");
        String placa = scanner.nextLine();
        System.out.print("Número de puertas: ");
        int numPuertas = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        return new Automovil(placa, numPuertas, marca, modelo);
    }
}