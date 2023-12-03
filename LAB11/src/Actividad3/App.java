package Actividad3;

public class App {
    public static void main(String[] args) {
        try {
        	Bag<Integer> integerBag = new Bag<>(5);
            integerBag.add(1);
            integerBag.add(2);
            integerBag.add(3);
            System.out.println(integerBag.getObjects());

            Bag<String> stringBag = new Bag<>(3);
            stringBag.add("Uno");
            stringBag.add("Dos");
            stringBag.add("Tres");
            System.out.println(stringBag);

            Bag<Persona> personaBag = new Bag<>(2);
            personaBag.add(new Persona("Juan", 25));
            personaBag.add(new Persona("Ana", 30));
            System.out.println(personaBag);

            Persona removedPerson = personaBag.remove(new Persona("Juan", 25));
            System.out.println("Persona eliminada: " + removedPerson);
            System.out.println(personaBag);

            System.out.println("Busqueda del termino 'Dos' en la bolsa de strings: " + stringBag.getIndex("Dos"));
        } catch (IsFull | IsEmpty | ObjectNoExist e) {
            e.printStackTrace();
        }
    }
}