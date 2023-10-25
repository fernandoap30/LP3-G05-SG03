package Ejercicio3;

import java.io.IOException;

public class Test {
	private LeerEntrada entrada;
	
	public Test(LeerEntrada entrada) {
		this.entrada = entrada;
	}
	
	public static void main (String [] args) {
		System.out.println("Ingrese e caracter a comparar");
		LeerEntrada entrada = new LeerEntrada(System.in);
		Test procesador = new Test(entrada);
		procesador.procesar();
	}
	
	public void procesar() {
		char caracter;
		try {
			caracter = entrada.getChar();
			if(caracter == ' ') {
				throw new ExcepcionBlanco("Espacio en blanco");
			}else if(Character.isDigit(caracter)){
				throw new ExcepcionNumero("Numero");
			}else if("AEIOUaeiou".indexOf(caracter)>=0){
				throw new ExcepcionVocal("Vocal");
			}else {
				throw new ExcepcionSalida("Ninguna excepcion, saliendo");
			}
		}
		catch(IOException e) {
			System.out.println("error al ingresar caracter");
		}
		catch(ExcepcionBlanco e) {
			System.out.println(e.getMessage());
		}
		catch(ExcepcionNumero e) {
			System.out.println(e.getMessage());
		}
		catch(ExcepcionVocal e) {
			System.out.println(e.getMessage());
		}
		catch(ExcepcionSalida e) {
			System.out.println(e.getMessage());
		}
		
	}
}

