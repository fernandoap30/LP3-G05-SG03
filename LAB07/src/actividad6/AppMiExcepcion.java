package actividad6;

public class AppMiExcepcion {
	public static void main (String []args) {
		validaPropia(6);
	}
	public static void validaPropia(int n) {
		try {
			minimo(n);
			System.out.println(n +" es mayor a 10");
		}
		catch(MiExcepcion e) {
			System.out.println("No me sirve ese numero");
		}
	}
	
	public static void minimo(int n) throws MiExcepcion{
		if(n<=10) {
			throw new MiExcepcion("Necesito un numero mayor a 10");
		}
	}
}
