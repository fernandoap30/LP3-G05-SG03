package ejercicio04;


public class TestHerencia {
	
	public static void main (String [] args) {
		Asalariado emplead1 = new Asalariado("Juan Perez", 28339187, 5, 3500);
		EmpleadoProduccion emplead2 = new EmpleadoProduccion("Rocio Fernandez", 35289129,10,3500,"tarde"); //3478.262 para 4000 exacto
		EmpleadoDistribucion emplead3 = new EmpleadoDistribucion("Deny Cruz", 2718935,0,3500,"Centro"); //3454.54545 para 3800 exacto
		
		System.out.println(emplead1.toString() + "\n");
		System.out.println(emplead2.toString()+ "\n");
		System.out.println(emplead3.toString()+ "\n");
	}
}
