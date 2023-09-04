package ejercicio2;
import java.util.Scanner;

class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
        this.dia =1;
        this.mes = 1;
        this.anio = 1900;
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        valida();
    }

    private void valida() {
        if (dia < 1 || dia > diasMes(mes)) {
            dia = 1;
        }
        if (mes < 1 || mes > 12) {
            mes = 1;
        }
        if (anio < 1900 || anio > 2050) {
            anio = 1900;
        }
    }

    public void leer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el día (1-31): ");
        dia = scanner.nextInt();
        System.out.print("Ingrese el mes (1-12): ");
        mes = scanner.nextInt();
        System.out.print("Ingrese el año (1900-2050): ");
        anio = scanner.nextInt();
        valida();
    }

    public boolean bisiesto() {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    public int diasMes(int mes) {
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (mes == 2 && bisiesto()) {
            return 29;
        }
        return diasPorMes[mes];
    }

    public void corta() {
        System.out.printf("%02d-%02d-%04d\n", dia, mes, anio);
    }

    public int diasTranscurridos() {
        int totalDias = 0;
        for (int i = 1900; i < anio; i++) {
            totalDias += bisiesto() ? 366 : 365;
        }
        for (int i = 1; i < mes; i++) {
            totalDias += diasMes(i);
        }
        totalDias += dia;
        return totalDias;
    }

    public int diaSemana() {
        return (diasTranscurridos() + 1) % 7;
    }

    public void larga() {
        String[] nombresDias = {"domingo", "lunes", "martes", "miércoles", "jueves", "viernes", "sábado"};
        String nombreMes = "enero febrero marzo abril mayo junio julio agosto septiembre octubre noviembre diciembre".split(" ")[mes - 1];
        System.out.printf("%s %d de %s de %d\n", nombresDias[diaSemana()], dia, nombreMes, anio);
    }

    public void fechaTras(long dias) {
        for (long i = 0; i < dias; i++) {
            siguiente();
        }
    }

    public int diasEntre(Fecha otraFecha) {
        return Math.abs(diasTranscurridos() - otraFecha.diasTranscurridos());
    }

    public void siguiente() {
        dia++;
        if (dia > diasMes(mes)) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                anio++;
            }
        }
    }

    public void anterior() {
        dia--;
        if (dia < 1) {
            mes--;
            if (mes < 1) {
                mes = 12;
                anio--;
            }
            dia = diasMes(mes);
        }
    }

    public void fechaFutura(long dias) {
        fechaTras(dias);
    }

    public Fecha copia() {
        return new Fecha(dia, mes, anio);
    }

    public static boolean igualQue(Fecha fecha1, Fecha fecha2) {
        return fecha1.dia == fecha2.dia && fecha1.mes == fecha2.mes && fecha1.anio == fecha2.anio;
    }

    public static boolean menorQue(Fecha fecha1, Fecha fecha2) {
        return fecha1.diasTranscurridos() < fecha2.diasTranscurridos();
    }

    public static boolean mayorQue(Fecha fecha1, Fecha fecha2) {
        return fecha1.diasTranscurridos() > fecha2.diasTranscurridos();
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

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
    
}
