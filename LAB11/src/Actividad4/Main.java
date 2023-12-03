package Actividad4;

public class Main {
    public static void main(String[] args) {
        
        Biscuits biscuits = new Biscuits(1, "Galletas de avena", 2.5f, "Saladas");
        Chocolates chocolates = new Chocolates(2, "Chocolate negro", 3.0f, "Amargo");
        Soda soda = new Soda(3, "Galletas Sada", 1.8f, "Saladas");
        Sweet sweet = new Sweet(4, "Galletas Dulces", 2.0f, "Dulces");

        
        Bolsa<Goodies> bolsa = new Bolsa<>();
        bolsa.agregar(biscuits);
        bolsa.agregar(chocolates);
        bolsa.agregar(soda);
        bolsa.agregar(sweet);

        
        bolsa.mostrarContenido();
    }
}
