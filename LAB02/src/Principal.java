import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		//inciso A
		Perro Fido = new Perro("chihuahua","marron");
		Perro Pelusa = new Perro("pequines", "blanco");
		Fido.increEdad(1);
		Pelusa.increEdad(4);
		System.out.println("Edad de fido");
		System.out.println(Fido.getEdad());
		System.out.println("Edad de Pelusa");
		System.out.println(Pelusa.getEdad());
		//inciso B
		Diagnostico d1 = new Diagnostico();
		System.out.println("Diagnostico A : Fido");
		d1.aptoVacunaA(Fido);
		System.out.println("Diagnostico B : Fido");
		d1.aptoVacunaB(Fido.getEdad(), Fido.peso,Fido.getTemp());
		System.out.println("Diagnostico A : Pelusa");
		d1.aptoVacunaA(Pelusa);
		System.out.println("Diagnostico A : Pelusa");
		d1.aptoVacunaB(Pelusa.getEdad(), Pelusa.peso,Pelusa.getTemp());
		//inciso C
		Perro p3 = new Perro();
		Scanner s1 = new Scanner(System.in);
		System.out.println("A continuacion ingrese SOLO datos numericos ");
		System.out.println("ingrese la temperatura del perro: ");
		p3.setTemp(s1.nextDouble());
		System.out.println("ingrese la edad del perro en años: ");
		p3.setEdad((s1.nextInt()));
		System.out.println("ingrese el peso del perro: ");
		p3.peso = s1.nextDouble();
		d1.aptoVacunaA(p3);	
	}
}
