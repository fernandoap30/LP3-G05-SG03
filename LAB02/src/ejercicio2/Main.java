package ejercicio2;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Ingrese el primer Nombre: ");
		String primerNombre = s1.nextLine();
		System.out.println("Ingrese el Apellido: ");
		String apellido = s1.nextLine();
		System.out.println("Ingrese el sexo: (masculino/femenino) ");
		String sexo = s1.nextLine();
		System.out.println("Ingrese el dia de Nacimiento: ");
		int diaNacimiento = s1.nextInt();
		System.out.println("Ingrese el mes de Nacimiento: ");
		int mesNacimiento = s1.nextInt();
		System.out.println("Ingrese el año de Nacimiento: ");
		int annioNacimiento = s1.nextInt();
		System.out.println("Ingrese la Altura: (cm) ");
		double altura = s1.nextDouble();
		System.out.println("Ingrese el Peso: (kg) ");
		double peso = s1.nextDouble();
		
		PerfilMedico perfil = new PerfilMedico(primerNombre,apellido,sexo,diaNacimiento,mesNacimiento,annioNacimiento,altura,peso);
		perfil.mostrar();
		s1.close();
	}
}
