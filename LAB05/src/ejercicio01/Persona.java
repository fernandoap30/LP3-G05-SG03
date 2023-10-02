package ejercicio01;
public class Persona {  
	private int id;  
	private String nombre;  
	private String apellido;  
	private Cuenta cuenta;  
	
	public Persona(int id, String nombre, String apellido,char tipoCliente) {  
		this.id = id;  
		this.nombre = nombre;  
		this.apellido = apellido;  
		int numeroCuenta = generaNumero(tipoCliente); 
		this.cuenta = new Cuenta(numeroCuenta,50.0,tipoCliente);  
	}  

	public int getId() {  
		return id;  
	}  

	public void setId(int id) {  
		this.id = id;  
	}  

	public String getNombre() {  
		return nombre;  
	}  

	public void setNombre(String nombre) {  
		this.nombre = nombre;  
	}  

	public String getApellido() {  
		return apellido;  
	}  

	public void setApellido(String apellido) {  
		this.apellido = apellido;  
	}  

	public Cuenta getCuenta() { 
		return cuenta; 
	} 

    public void setCuenta(Cuenta cuenta) { 
        this.cuenta = cuenta; 
    } 

    private int generaNumero(char tipoCliente) { 
        int numeroBase; 
        switch (tipoCliente) { 
            case 'B': 
                numeroBase = 5000; 
                break; 
            case 'E': 
                numeroBase = 8000; 
                break; 
            default: 
                numeroBase = 1000; 
                break; 
        } 
        return numeroBase;  
    } 

    @Override 
    public String toString() { 
        return "Cliente: " + id + "\n" + 
               "Tipo: " + cuenta.getTipo() + "\n" + 
               "Nombres: " + nombre + " " + apellido + "\n" + 
               cuenta.toString(); 
    } 
}