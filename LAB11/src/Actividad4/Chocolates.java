package Actividad4;

class Chocolates extends Goodies {
    private String sabor;

    public Chocolates(int id, String description, float price, String sabor) {
        super(id, description, price);
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    @Override
    public String toString() {
        return "Chocolates{" +
                "sabor='" + sabor + '\'' +
                "} " + super.toString();
    }
}