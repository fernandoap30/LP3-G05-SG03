package actividad02;

public class ContadorTest {

	public static void main(String[] args) {
		Contador c1,c2;
		System.out.println(Contador.acumulador());
		c1 = new Contador(3);
		c2 = new Contador(10);
		c1.inc();
		c1.inc();
		c2.inc();
		System.out.println(c1.getValor());
		System.out.println(c2.getValor());
		System.out.println(Contador.acumulador());
	}

}

/*
3.a.1  si se puede porque el this solo ayuda al programa a indicar que acumulador estamos usando para la operacion.
3.a.2  si se puede porque el acumulador es una variable de clase.
3.a.3 si se puede, mismo caso que el 3.a.1
3.b imprime 0, 5, 11, 16. el 0 porque el acumulador inicia en 0, al crear elcontador c1 con valor 3 y usar 2 veces c1.inc, aumenta a 5, 
y el c2 aumenta a 11, al final mostramos por pantalla esos valores. El 16 se genera porque el acumulador suma los dos contadores(5+11).
3.c  no, el programa funciona igual, ya que el static hace que dicha variable sea de la propia clase, por ende no hay errores de no acceso.
3.d no sucede error, inicializa automaticamente en 0
3.f incrementa el acumulador
3.h sucede lo mismo
3.i aparece un error puesla variable valor inicial es "final" por lo que su valor no puede ser modificado.

*/