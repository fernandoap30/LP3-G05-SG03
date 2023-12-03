package Actividad1;

import java.util.Objects;

class Estudiante extends Persona {
    String especialidad;
    Procedencia procedencia;

    Estudiante(String nombre, String direccion, String telefono, String especialidad, Procedencia procedencia) {
        super(nombre, direccion, telefono);
        this.especialidad = especialidad;
        this.procedencia = procedencia;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Estudiante estudiante = (Estudiante) obj;
        return Objects.equals(procedencia, estudiante.procedencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), procedencia);
    }
}