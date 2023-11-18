package Actividad2;

public class App {
	 public static void main(String[] args) throws Exception{
		 Persona p1 = new Persona("123","Pedro","magnolias");
		 Persona p2 = new Persona("456","Alonso","ejercito");
		 Persona p3 = new Persona("789","Gavi","goyeneche");
		 Persona p4 = new Persona("101","Flor","eeuu");
		 System.out.printf("minimo de %d,%d, %d y %d es \n%d%n%n",3, 4, 5,6, minimo(3,4,5,6));
		 System.out.printf("Miniimo de %.1f,%.1f, %.1f y %.1f es \n%.1f%n%n", 6.6, 7.7, 8.8,9.9, minimo(6.6,7.7,8.8,9.9));
		 System.out.printf("Minimo de %s,%s, %s and %s es \n%s%n%n", "zorro", "zanahoria", "uva","naranja", minimo("zorro","zanahoria","uva","naranja"));
		 System.out.printf("Minimo de %s,%s, %s and %s es \n%s%n%n", p1,p2,p3,p4 , minimo(p1,p2,p3,p4));
	 }
	 
	 public static <T extends Comparable<T>> T minimo (T x, T y, T z, T w){
		 T min = x;
		 if(y.compareTo(x) < 0 && y.compareTo(z) <0 && y.compareTo(w) <0)
			 min = y;
		 if(z.compareTo(y) < 0 && z.compareTo(x) < 0 && z.compareTo(w) <0)
			 min = z;
		 if(w.compareTo(y) < 0 && w.compareTo(x) < 0 && w.compareTo(z) <0)
			 min = w;
		 
		 return min;
	}
}