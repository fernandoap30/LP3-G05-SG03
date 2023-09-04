package ejercicio1;

public class Principal {
	public static void main(String[] args) {
		Coordenada c1,c2,c3,c4;
		Rectangulo r1,r2,r3,r4,r5;
		c1 = new Coordenada(0,0);
		c2 = new Coordenada(2,8);
		c3 = new Coordenada(3,10);
		c4 = new Coordenada(1,9);
		r1 = new Rectangulo(c1,c3);
		r2 = new Rectangulo(c2,c4);
		r3 = new Rectangulo(c1,c4);
		r4 = new Rectangulo(c3,c4);
		r5 = new Rectangulo(c4,c4);
		
		System.out.println(c1.distancia(c2));
		System.out.println(Coordenada.distancia(c2,c3));
		System.out.println(Manejador.area(r1));
		System.out.println(Manejador.perimetro(r1));
		Manejador.moverX(r1);
		System.out.println(c1.getX());
		System.out.println(c3.getX());
		Manejador.moverY(r1);
		System.out.println(c1.getY());
		System.out.println(c3.getY());
		System.out.println(r1.color);
		System.out.println(r2.color);
		System.out.println(r3.color);
		System.out.println(r4.color);
		System.out.println(r5.color);
	}
}
