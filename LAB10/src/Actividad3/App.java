package Actividad3;

public class App {
	 public static void main(String[] args) throws Exception{
		 Persona p1 = new Persona("123","Pedro","magnolias");
		 Persona p2 = new Persona("456","Alonso","ejercito");
		 Persona p3 = new Persona("789","Rosa","goyeneche");
		 Integer[] intArray = {1,2,3,4,5};
		 Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
		 Character[] charArray = {'H', 'O', 'L', 'A'};
		 Float [] floatArray = {(float)2.12,(float)3.4,(float)5.6,(float)3.6};
		 Boolean [] booleanArray = {true,false};
		 Persona [] personaArray = {p1,p2,p3};
		 System.out.printf("Array integerArray contiene:%n");
		 imprimirArray(intArray,1,2);
		 System.out.printf("%nArray doubleArray contiene:%n");
		 imprimirArray(doubleArray,2,4);
		 System.out.printf("%nArray charArray contiene:%n");
		 imprimirArray(charArray,1,3);
		 System.out.printf("%nArray floatArray contiene:%n");
		 imprimirArray(floatArray,1,2);
		 System.out.printf("%nArray booleanArray contiene:%n");
		 imprimirArray(booleanArray,1,3);
		 System.out.printf("%nArray personaArray contiene:%n");
		 imprimirArray(personaArray,1,4);
	}
	  
		 public static <T> int imprimirArray(T[] inputArray, int limiteInferior, int limiteSuperior) throws LimiteInvalidoException {
		        if (limiteInferior < 0 || limiteSuperior >= inputArray.length || limiteInferior > limiteSuperior) {
		            throw new LimiteInvalidoException("Límites inválidos");
		        }

		        int elementosEnRango = 0;
		        for (int i = limiteInferior; i <= limiteSuperior; i++) {
		            System.out.printf("%s ", inputArray[i]);
		            elementosEnRango++;
		        }
		        System.out.println();
		        return elementosEnRango;
		    }
}
