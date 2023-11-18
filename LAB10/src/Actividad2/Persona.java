package Actividad2;

public class Persona implements Comparable<Persona> {
    
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
		return nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public int compareTo(Persona otraPersona) {
		return this.nombre.compareTo(otraPersona.getNombre());
	}
}
