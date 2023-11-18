package Actividad3;

public class Persona {
    private String nombre;
    private String dni;
    private String direccion;
    public Persona(String dni, String nombre, String direccion) {
    	this.dni = dni;
    	this.nombre = nombre;
    	this.direccion = direccion;
    }
	@Override
	public String toString() {
		return "dni="+dni+"\tnombre=" + nombre + "\tDireccion="+direccion+"\n";
	}
}
