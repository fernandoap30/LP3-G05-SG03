package ejercicio01;

public class Cuenta {  
	private int numero;  
	private double saldo;  
	private char tipo; 

	public Cuenta(int numero, double saldo,char tipo) {  
		this.numero = numero;  
		this.saldo = saldo; 
		this.tipo = tipo; 
	}  

	public int getNumero() {  	
		return numero;  
	}  

	public void setNumero(int numero) {  
		this.numero = numero;  
	}  

	public double getSaldo() {  
		return saldo;  
	}  

	public void setSaldo(double saldo) {  
		this.saldo = saldo;  
	}  

	public char getTipo() { 
		return tipo; 
	} 

	public void setTipo(char tipo) { 
		this.tipo = tipo; 
	} 

	public void retirar(double cantidad) { 
		if (cantidad > 0 && saldo - cantidad >= 50.0) { 
			saldo -= cantidad; 
		} else { 
			System.out.println("Error: No se puede retirar esa cantidad."); 
		} 
	} 

	public void depositar(double cantidad) { 
		if (cantidad > 0) { 
			saldo += cantidad; 
		} else { 
			System.out.println("Error: No se puede depositar esa cantidad."); 
        } 
    } 

	@Override 
	public String toString() { 
		return "N.Cuenta: " + tipo + numero + "   Saldo: " + getSaldo(); 
	} 
}