package Ejercicio1;

class Goodie {
    private String nombre;
    private double precio;

    public Goodie(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}

class Bag {
    protected Object[] items;
    protected int size;

    public Bag() {
        this.items = new Object[10]; 
        this.size = 0;
    }

    public void add(Object item) {
        if (size < items.length) {
            items[size++] = item;
        }
    }
}

class CandyBags extends Bag {
    public CandyBags() {
        super();
    }

    @Override
    public void add(Object item) {
        if (item instanceof Goodie && !containsGoodie((Goodie) item)) {
            super.add(item);
        }
    }

    private boolean containsGoodie(Goodie goodie) {
        for (int i = 0; i < size; i++) {
            if (items[i] instanceof Goodie) {
                Goodie GoodieActual = (Goodie) items[i];
                if (GoodieActual.getNombre().equals(goodie.getNombre())) {
                    return true;
                }
            }
        }
        return false;
    }

    public Goodie cheapest() {
        if (size == 0) {
            return null;
        }
        Goodie cheapestGoodie = (Goodie) items[0];
        for (int i = 0; i < size; i++) {
            if (items[i] instanceof Goodie) {
                Goodie currentGoodie = (Goodie) items[i];
                if (currentGoodie.getPrecio() < cheapestGoodie.getPrecio()) {
                    cheapestGoodie = currentGoodie;
                }
            }
        }
        return cheapestGoodie;
    }

    public Goodie[] mostExpensive(int n) {
        if (size == 0) {
            return null;
        }

        Goodie[] sortedGoodies = new Goodie[size];
        System.arraycopy(items, 0, sortedGoodies, 0, size);

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (sortedGoodies[j].getPrecio() < sortedGoodies[j + 1].getPrecio()) {
                    Goodie temp = sortedGoodies[j];
                    sortedGoodies[j] = sortedGoodies[j + 1];
                    sortedGoodies[j + 1] = temp;
                }
            }
        }
        int resultSize = Math.min(n, size);
        Goodie[] result = new Goodie[resultSize];
        System.arraycopy(sortedGoodies, 0, result, 0, resultSize);

        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        CandyBags bag = new CandyBags();

        Goodie goodie1 = new Goodie("Chocolate", 1.0);
        Goodie goodie2 = new Goodie("Gummy Bears", 4.0);
        Goodie goodie3 = new Goodie("Lollipop", 1.0);
        Goodie goodie4 = new Goodie("Menta",1.3);
        Goodie goodie5 = new Goodie("Caramelo",3.2);

        bag.add(goodie1);
        bag.add(goodie2);
        bag.add(goodie3);
        bag.add(goodie1);  
        bag.add(goodie4);
        bag.add(goodie5);
        
        System.out.println("Cheapest Goodie: " + bag.cheapest().getNombre());

        Goodie[] mostExpensiveGoodies = bag.mostExpensive(2);
        System.out.println("Most Expensive Goodies:");
        for (Goodie goodie : mostExpensiveGoodies) {
            System.out.println(goodie.getNombre() + " " + goodie.getPrecio());
        }
    }
}
