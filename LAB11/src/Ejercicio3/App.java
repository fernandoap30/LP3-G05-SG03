package Ejercicio3;

import java.util.Scanner;

public class App {
	  public static void main(String[] args) {
		  Contacts contactsManager = new Contacts();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("\nMenú de opciones:");
	            System.out.println("1. Agregar contacto");
	            System.out.println("2. Eliminar contacto");
	            System.out.println("3. Ver contacto");
	            System.out.println("4. Listar contactos");
	            System.out.println("5. Salir");
	            System.out.print("Seleccione una opción: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine();  

	            switch (choice) {
	                case 1:
	                    contactsManager.agregarContacto();
	                    break;
	                case 2:
	                    contactsManager.eliminarContacto();
	                    break;
	                case 3:
	                    contactsManager.verContacto();
	                    break;
	                case 4:
	                    contactsManager.listarContacto();
	                    break;
	                case 5:
	                    System.out.println("Saliendo del programa.");
	                    scanner.close();
	                    System.exit(0);
	                default:
	                    System.out.println("Opción no válida. Inténtelo de nuevo.");
	            }
	        }
	    }
}
