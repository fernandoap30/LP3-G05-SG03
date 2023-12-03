package Actividad1;

import java.util.Objects;

class Goodies {
    int id;
    String description;
    float price;

    Goodies(int id, String description, float price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Goodies goodie = (Goodies) obj;
        return id == goodie.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
