package actividad02;

public class Contador {
	public static int nContadores = 0;
	public static int ultimocontador = 0;
	final static int VALOR_INICIAL = 10;
	private static int acumulador;
	private int valor = 0;
		
	public Contador(int valor) {
		this.valor = valor;
		Contador.acumulador += valor;
		//this.acumulador += valor;
		//Contador.VALOR_INICIAL += valor; 
		nContadores++;
		ultimocontador = valor;
	}
	public static int acumulador() {
		return acumulador;
	}
	public void inc() {
		this.valor++;
		acumulador++;
	};
	public int getValor() {
		return this.valor;
	}
	public Contador() {
		this(Contador.VALOR_INICIAL);
		//new Contador(Contador.VALOR_INICIAL);
		//nContadores++;
		ultimocontador = valor;
	}
	public static void totContadores() {
		System.out.println("total de contadores = " + nContadores);
	}
}
