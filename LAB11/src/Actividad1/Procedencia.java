package Actividad1;

import java.util.Objects;

class Procedencia {
    String departamento;
    String provincia;

    Procedencia(String departamento, String provincia) {
        this.departamento = departamento;
        this.provincia = provincia;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Procedencia that = (Procedencia) obj;
        return Objects.equals(departamento, that.departamento) &&
               Objects.equals(provincia, that.provincia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departamento, provincia);
    }
}