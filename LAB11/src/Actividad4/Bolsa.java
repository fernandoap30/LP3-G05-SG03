package Actividad4;

import java.util.ArrayList;
import java.util.List;

class Bolsa<T extends Goodies> {
    private List<T> lista = new ArrayList<>();

    public void agregar(T elemento) {
        lista.add(elemento);
    }

    public void mostrarContenido() {
        for (T elemento : lista) {
            System.out.println(elemento);
        }
    }
}