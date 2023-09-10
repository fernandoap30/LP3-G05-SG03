package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;
public class principalej1 {
	int i = 0;
	public static void main(String[] args) {
		Contacto c1,c2,c3,c4,c5,c6;
		ArrayList <Contacto> ListaContactos = new ArrayList<>();
		int opcion;
		boolean salir = false;
		Scanner sn = new Scanner(System.in);
		Scanner sn2 = new Scanner(System.in);
        //Menu
        do {
            //Mensajes del menu
            System.out.println("Menu");
            System.out.println("1. Añadir Contacto");
            System.out.println("2. Buscar Contacto");
            System.out.println("3. Modificar Contacto");
            System.out.println("4. Borrar Contacto");
            System.out.println("5. Eliminar Contacto");
            System.out.println("6. Mostrar Contactos");
            System.out.println("7. Salir");
            System.out.println("Elije una opcion");
            opcion = sn.nextInt();
 
            switch (opcion) {
                case 1:
                	System.out.println("Ingrese nombre");
                	String nom=sn2.next();
                	System.out.println("Ingrese nro");
                	String nro=sn2.next();
                	System.out.println("Ingrese correo");
                	String correo=sn2.next();
                	c2 =new Contacto(nom,nro,correo);
                    ListaContactos.add(c2);
                    //Ahora si podemos acceder al resto de opciones
                    break;
                case 2:
                    
                    System.out.println("Ingrese nombre a buscar");
                    String busqueda = sn2.next();
                    boolean encontrado = false;
                	for(int x=0; x < ListaContactos.size();x++) {
                		if((ListaContactos.get(x)).getNombre().equals(busqueda)) {
                			System.out.println(ListaContactos.get(x).getNombre());
                			System.out.println(ListaContactos.get(x).getTelefono());
                			System.out.println(ListaContactos.get(x).getDireccion());
                			encontrado = true;
                			break;
                		}
                	}
                    if (encontrado == false) {
                    	System.out.println("no se encontro al contacto de nombre" + busqueda);
                    }
                        
                    break;
                case 3:
                	System.out.println("Ingrese nombre a buscar");
                    busqueda = sn2.next();
                	for(int x=0; x < ListaContactos.size();x++) {
                		if((ListaContactos.get(x)).getNombre().equals(busqueda)) {
                			System.out.println("Ingrese nuevo nombre: ");
                			String nuevo = sn2.next();
                			ListaContactos.get(x).setNombre(nuevo);
                			System.out.println("Ingrese nuevo numero: ");
                			nuevo = sn2.next();
                			ListaContactos.get(x).setTelefono(nuevo);
                			System.out.println("Ingrese nuevo correo: ");
                			nuevo = sn2.next();
                			ListaContactos.get(x).setDireccion(nuevo);
                			break;
                		}
                	}
                    break;
                case 4: //borrar contacto
                	System.out.println("Ingrese nombre a buscar");
                    busqueda = sn2.next();
                	for(int x=0; x < ListaContactos.size();x++) {
                		if((ListaContactos.get(x)).getNombre().equals(busqueda)) {
                			ListaContactos.remove(x);
                			break;
                		}
                	}
                	break;
                case 5://eliminar
                	ListaContactos.clear();
                	break;
                case 6://mostrar
                	for(int x=0; x < ListaContactos.size();x++) {
                		System.out.println("Contacto: "+(x+1));
                		System.out.println(ListaContactos.get(x).getNombre()+" "+ ListaContactos.get(x).getTelefono()+" "+ListaContactos.get(x).getDireccion());
                	}
                	break;
                case 7:
                    salir = true;
                    break;
                default:
                    System.out.println("Tienes que meter un valor entre 1 y 7");
            	}
        } while (!salir);
 
        System.out.println("FIN");
    }
}

