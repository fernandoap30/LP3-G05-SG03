package ejercicio2;

public class PerfilMedico {
	private String nombre,apellido,sexo;
	private int dia,mes,año;
	private double altura, peso;
	
	
	public PerfilMedico(String nom, String apell, String sexo, int d, int m, int a, double alt, double peso) {
		super();
		this.nombre = nom;
		this.apellido = apell;
		this.sexo = sexo;
		this.dia = d;
		this.mes = m;
		this.año = a;
		this.altura = alt;
		this.peso = peso;
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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int calcularEdad() {
		return 2023 - año;
	}
	public double FCM() {
		return 208-(0.7 * calcularEdad());
	}
	public double IMC() {
		return peso / altura;
	}
	public void mostrar() {
		System.out.println(" Informacion Medica ");
		System.out.println("Nombre Completo: "+ getNombre() + " " + getApellido());
		System.out.println("Sexo: "+getSexo());
		System.out.println("Fecha de Nacimiento: "+getDia()+"/"+getMes()+"/"+getAño());
		System.out.println("Altura: "+getAltura());
		System.out.println("Peso: "+getPeso());
		System.out.println("Edad: "+calcularEdad()+" años");
		System.out.println("Frecuencia Cardiaca Maxima - FCM: "+FCM());
		System.out.println("Indice de Masa Corporal: "+IMC());
	}
}
