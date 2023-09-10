package ejercicio2;

import java.util.Random;
public class EvaluacionCriditicia {
	public static void main(String[] args) {
		int[] sexos = new int[8];
		int[] trabajan = new int[8];
		int[] sueldos = new int[8];
		Random aleatorio = new Random();
		for(int i = 0; i < 8; i++) {
			sexos[i] = aleatorio.nextInt(2) + 1;
			trabajan[i] = aleatorio.nextInt(2) + 1;
			if(trabajan[i] == 1) {
				sueldos[i] = aleatorio.nextInt(3000) + 950;
			}else {
				sueldos[i] = 0;
			}
		}
		int totalHombres = 0;
        int totalMujeres = 0;
        int hombresQueTrabajan = 0;
        int mujeresQueTrabajan = 0;
        int sueldoTotalHombres = 0;
        int sueldoTotalMujeres = 0;
        for(int i = 0; i < 8; i++) {
        	if(sexos[i] == 1) {
        		totalHombres ++;
        		if(trabajan[i] == 1) {
        			hombresQueTrabajan ++;
        			sueldoTotalHombres += sueldos[i];
        		}
        	}else {
        		totalMujeres ++;
        		if(trabajan[i] == 1) {
        			mujeresQueTrabajan ++;
        			sueldoTotalMujeres += sueldos[i];
        		}
        	}
        }
        double porcentajeHombres = (double) totalHombres / 8 * 100;
        double porcentajeMujeres = (double) totalMujeres / 8 * 100;
        double porcentajeHombresQueTrabajan = (double) hombresQueTrabajan / totalHombres * 100;
        double porcentajeMujeresQueTrabajan = (double) mujeresQueTrabajan / totalMujeres * 100;
        double sueldoPromedioHombres = (double) sueldoTotalHombres / hombresQueTrabajan;
        double sueldoPromedioMujeres = (double) sueldoTotalMujeres / mujeresQueTrabajan;
        //Mostrar Resultados
        System.out.println("a) Porcentaje de hombres: " + porcentajeHombres + "%");
        System.out.println("b) Porcentaje de mujeres: " + porcentajeMujeres + "%");
        System.out.println("c) Porcentaje de hombres que trabajan: " + porcentajeHombresQueTrabajan + "%");
        System.out.println("d) Porcentaje de mujeres que trabajan: " + porcentajeMujeresQueTrabajan + "%");
        System.out.println("e) Sueldo promedio de hombres que trabajan: " + sueldoPromedioHombres);
        System.out.println("f) Sueldo promedio de mujeres que trabajan: " + sueldoPromedioMujeres);
	}
}
