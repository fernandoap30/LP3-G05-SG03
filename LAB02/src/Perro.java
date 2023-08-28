public class Perro {
	 private String raza;
	 private String color;
	 private double temp;
	 private int edad;
	 public double peso;
	
public Perro(String raza, String color, double temp, int edad, double peso) {
		super();
		this.raza = raza;
		this.color = color;
		this.temp = temp;
		this.edad = edad;
		this.peso = peso;
	}
public Perro(String raza, String color) {
	 this.raza = raza;
	 this.color = color;
	 this.temp = 37;
	 this.edad = 1;
	 this.peso = 0;
 }
 public Perro() {
	 this.raza = "chusco";
	 this.color = "gris";
	 this.temp = 37;
	 this.edad = 1;
	 this.peso = 0;
 }
 public String getRaza() {
	 return raza;
 }
 public void setRaza(String raza) {
	 this.raza = raza;
 }
 public String getColor() {
	 return color;
 }
 public void setColor(String color) {
	 this.color = color;
 }
 public double getTemp() {
	 return temp;
 }
 public void setTemp(double temp) {
	 this.temp = temp;
	 }
 public int getEdad() {
	 return edad;
 }
 public void setEdad(int edad) {
	 this.edad = edad;
 }
 @Override
 public String toString() {
	 return "Perro{" + "raza=" + raza + ", color=" + color + ", temp=" + temp + ",edad=" + edad + ", peso=" + peso + '}';
 }
 public void ladrar(){
	 System.out.println("Guau Guau");
 }
 public void dormir(){
	 System.out.println("zzz zzzz");
 }
 public void comer(){
	 System.out.println("pka pka");
 }
 public void increEdad(int anios){
	 this.edad = this.edad + anios;
	 cambiarPeso(edad);
 }
 private void cambiarPeso(int anios){
	 this.peso = this.peso + (anios * 1.5);
 }
}

