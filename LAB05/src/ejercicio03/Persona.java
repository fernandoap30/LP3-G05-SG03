package ejercicio03;


class Persona {
    private String nombre;
    private char tipoCuenta; // C (cliente), B (banca exclusiva), E (empresarial)

    public Persona(String nombre, char tipoCuenta) {
        this.nombre = nombre;
        this.tipoCuenta = tipoCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public char getTipoCuenta() {
        return tipoCuenta;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Persona persona = (Persona) obj;
        return nombre.equals(persona.nombre);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Tipo de Cuenta: " + tipoCuenta;
    }
}
