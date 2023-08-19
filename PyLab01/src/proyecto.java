import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int vida, rp;
		boolean fl = false;
		vida = 6;
		Scanner sc = new Scanner(System.in);
		do{
			vida--;
			System.out.println("vida: "+ vida + "\t Cual es el numero secreto?");
			rp = sc.nextInt();
			if (rp == 9876)
				fl = true;
		}while(vida > 1 && !fl);
		if (fl ==true)
			System.out.println("Adivinaste!!!!:     Ganaste un Carro!!!!");
		else
			System.out.println("Ups, perdiste...");
	}
}
