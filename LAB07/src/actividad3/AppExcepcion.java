package actividad3;

public class AppExcepcion {
	public static void main(String [] args) {
		try {
			metodo1();
		}
		catch(Exception e) {
			System.out.println("La excepcion se manejo en main");
		}
		metodo2();
	}
	public static void metodo1() throws Exception{
		try {
			System.out.println("Metodo 1");
			throw new Exception();
		}
		catch(Exception e) {
			System.out.println("La excepcion se manejo en metodo1");
			throw e;
		}
		finally {
			System.out.println("Se ejecuto finally en metodo1");	
		}
	}
	public static void metodo2(){
		try {
			System.out.println("Metodo 2");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Se ejecuto finally en metodo2");	
		}
		System.out.println("Fin metodo2");
	}
}

//Explique ¿a qué se debe que los mensajes siguen ese orden?. Cúal es el flujo de la ejecución y porqué?

//el main invoca a metodo 1 por lo que muestra "Metodo1", este metodo arroja una excepcion por lo que entra al catch
//y luego el finally que si o si se llama. Como la excepcion no se maneja en el metodo1 entra al catch del main. Luego se invoca al metodo2
//donde al no haber excepciones pasa de frente del try al finally.
