package Actividad4;

class Biscuits extends Goodies {
    private String tipo;

    public Biscuits(int id, String description, float price, String tipo) {
        super(id, description, price);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Galletas{" +
                "tipo='" + tipo + '\'' +
                "} " + super.toString();
    }
}