import java.util.Scanner;
public class actividad {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
	 
        //Matriz cuadrada de 4x4
        int matriz[][] = new int[4][4];
 
        //Variables utilizadas
        boolean salir = false;
        int opcion, fila,columna,diagonal;
 
        //Utilizado para indicar si hemos entrado en la 1ª opcion
        boolean rellenado = false;
 
        //Menu
        do {
            //Mensajes del menu
            System.out.println("Menu");
            System.out.println("1. Rellenar Matriz");
            System.out.println("2. Sumar fila");
            System.out.println("3. Sumar columna");
            System.out.println("4. Sumar diagonal principal");
            System.out.println("5. Sumar diagonal inversa");
            System.out.println("6. Sumar media");
            System.out.println("7. mostrar matriz");
            System.out.println("8. Salir");
            System.out.println("Elije una opcion");
            opcion = sn.nextInt();
 
            switch (opcion) {
                case 1:
                    rellenarMatriz(sn, matriz); 
                    //Ahora si podemos acceder al resto de opciones
                    rellenado = true;
                    break;
                case 2:
                    if (rellenado) {
                        //Validamos la fila
                        do {
                            System.out.println("Elige una fila");
                            fila = sn.nextInt();
                        } while (!(fila-1 >= 0 && fila-1 < matriz.length));
                        System.out.println("La suma de los valores de la fila " + fila + " es: " + sumaFila(matriz, fila-1));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 3:
                	if (rellenado) {
                        //Validamos la fila
                        do {
                            System.out.println("Elige una columna");
                            columna = sn.nextInt();
                        } while (!(columna-1 >= 0 && columna-1 < matriz.length));
                        System.out.println("La suma de los valores de la columna " + columna + " es: " + sumaColumna(matriz, columna-1));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 4:
                	if (rellenado) {
                        //Validamos la fila
                        System.out.println("La suma de los valores de la diagonal  es: " + sumaDiagonal(matriz));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                	break;
                case 5:
                	if (rellenado) {
                        //Validamos la fila
                        System.out.println("La suma de los valores de la diagonal inversa  es: " + sumaDiagonalInversa(matriz));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                	break;
                case 6:
                	if (rellenado) {
                        //Validamos la fila
                        System.out.println("La media de los valores de la matriz  es: " + sumaMedia(matriz));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                	break;
                case 7:
                	if (rellenado) {
                        //Validamos la fila
                        System.out.println("La media de los valores de la matriz  es: ");
                        MostrarMatriz(matriz);
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                	break;
                case 8:
                    salir = true;
                    break;
                default:
                    System.out.println("Tienes que meter un valor entre 1 y 7");
            	}
        } while (!salir);
 
        System.out.println("FIN");
    }
 
    /**
     * Rellena la matriz con valores insertados por el usuario
     *
     * @param sn
     * @param matriz
     */
    public static void rellenarMatriz(Scanner sn, int[][] matriz) {
 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Escribe un numero en la posicion " + i + " " + j);
                matriz[i][j] = sn.nextInt();
            }
        }
    }
 
    /**
     * Suma los valores de una determinada fila
     *
     * @param matriz
     * @param fila
     * @return
     */
    public static int sumaFila(int[][] matriz, int fila) {
        int suma = 0;
 
        for (int j = 0; j < matriz.length; j++) {
            suma += matriz[fila][j];
        }
        return suma;
    } 
    //c
    public static int sumaColumna(int[][] matriz, int columna) {
        int suma = 0;
 
        for (int j = 0; j < matriz.length; j++) {
            suma += matriz[j][columna];
        }
        return suma;
    } 
    //d
    public static int sumaDiagonal(int[][] matriz) {
        int suma = 0;
 
        for (int j = 0; j < matriz.length; j++) {
            suma += matriz[j][j];
        }
        return suma;
    } 
    //  e  
    public static int sumaDiagonalInversa(int[][] matriz) {
	    int suma = 0,i = 0;
	    
	    for (int j = matriz.length -1; j > -1; j--) {
	    	System.out.println(matriz[i][j]);
	    	suma += matriz[i][j];
	    	i++;
	    }
	    return suma;
    } 
    //f
    public static double sumaMedia(int[][] matriz) {
	    int suma = 0,contador = 0;
	    double media;
	    
	    for (int i = 0; i < matriz.length; i++) {
	    	for (int j = 0; j < matriz.length; j++) {
	    		contador +=1;
	    		suma += matriz[i][j];
	    	}
        }
	    System.out.println("cantidad de valores de la matriz: " +contador);
	    System.out.println("suma de valores: " +suma);
	    System.out.println("media: (suma/cantidad) ");
	    media = (double) suma/contador;
        return media;
    } 
    public static void MostrarMatriz(int[][] matriz) {
	    for (int i = 0; i < matriz.length; i++) {
	    	for (int j = 0; j < matriz.length; j++) {
	    		System.out.print(matriz[i][j] + "\t");
	    	}
	    	System.out.println("\n");
        }
    } 
}
