package ejercicio1;

public class Main {
	public static void main(String[] args) {
		Figura[] figuras = new Figura[6];
	    figuras[0] = new Cuadrado(5);
	    figuras[1] = new Circulo(3);
	    figuras[2] = new Triangulo(4, 7);
	    figuras[3] = new Esfera(4);
	    figuras[4] = new Cubo(4);
	    figuras[5] = new Tetraedro(5);
	    
	    for (Figura figura : figuras) {
            figura.obtenerDescripcion();
            
            if (figura instanceof FiguraBidimensional) {
            	
            	System.out.println("Area: ");
            	System.out.println(((FiguraBidimensional) figura).obtenerArea());
            	if(figura instanceof Circulo ){
            		System.out.println(((Circulo) figura).obtenerColor());
            	}
            } else if (figura instanceof FiguraTridimensional) {
            	System.out.println("Area: ");
            	System.out.println(((FiguraTridimensional) figura).obtenerArea());
            	System.out.println("Volumen: ");
            	System.out.println(((FiguraTridimensional) figura).obtenerVolumen());
            	if(figura instanceof Tetraedro ){
            		System.out.println(((Tetraedro) figura).obtenerAplicacion());
            	}
            }
            System.out.println();
	}
}
}
