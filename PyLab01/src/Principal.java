import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int vida, rp;
		boolean fl = false;
		vida = 4;
		Scanner sc = new Scanner(System.in);
		do{
			vida--;
			System.out.println("vida: "+ vida + "\t Cual es el numero secreto?");
			rp = sc.nextInt();
			if (rp == 1234)
				fl = true;
		}while(vida > 1 && !fl);
		if (fl ==true)
			System.out.println("Adivinaste!!!!");
		else
			System.out.println("Ups, perdiste...");
	}
}
