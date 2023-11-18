package Actividad1;

public class App {
	 public static void main(String[] args) throws Exception{
		 Persona p1 = new Persona("123","Pedro","magnolias");
		 Persona p2 = new Persona("456","Alonso","ejercito");
		 Integer[] intArray = {1,2,3,4,5};
		 Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
		 Character[] charArray = {'H', 'O', 'L', 'A'};
		 Float [] floatArray = {(float)2.12,(float)3.4,(float)5.6,(float)3.6};
		 Boolean [] booleanArray = {true,false};
		 Persona [] personaArray = {p1,p2};
		 System.out.printf("Array integerArray contiene:%n");
		 imprimirArray(intArray);
		 System.out.printf("%nArray doubleArray contiene:%n");
		 imprimirArray(doubleArray);
		 System.out.printf("%nArray charArray contiene:%n");
		 imprimirArray(charArray);
		 System.out.printf("%nArray floatArray contiene:%n");
		 imprimirArray(floatArray);
		 System.out.printf("%nArray booleanArray contiene:%n");
		 imprimirArray(booleanArray);
		 System.out.printf("%nArray personaArray contiene:%n");
		 imprimirArray(personaArray);
		 }
		 public static <T> void imprimirArray(T[] inputArray) {
		 for(T elemento : inputArray)
		 System.out.printf("%s ",elemento);
		 System.out.println();
	}
}
