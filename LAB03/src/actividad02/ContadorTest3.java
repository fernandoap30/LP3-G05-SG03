package actividad02;

public class ContadorTest3 {

	public static void main(String[] args) {
		Contador c1,c2,c3,c4,c5;
		System.out.println(Contador.acumulador());
		c1 = new Contador(3);
		c2 = new Contador(8);
		c3 = new Contador();
		c4 = new Contador();
		c5 = new Contador (4);
		c1.inc();
		c1.inc();
		c2.inc();
		System.out.println(c1.getValor());
		System.out.println(c2.getValor());
		System.out.println(Contador.acumulador());
		Contador.totContadores();
		System.out.println(Contador.nContadores);
		System.out.println(Contador.ultimocontador);
	}

}
