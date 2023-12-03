package Actividad2;

public class App {
    public static void main(String[] args) {
        
        OrderedPair<Integer, Integer> pair1 = new OrderedPair<>(2, 1);
        System.out.println("Pair 1: " + pair1);

        
        OrderedPair<Integer, String> pair2 = new OrderedPair<>(3, "Hola");
        System.out.println("Pair 2: " + pair2);

      
        Persona persona = new Persona("John", 30); 
        OrderedPair<String, Persona> pair3 = new OrderedPair<>("ID123", persona);
        System.out.println("Pair 3: " + pair3);
    }
}
