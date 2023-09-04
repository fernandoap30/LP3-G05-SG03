package ejercicio2;

public class AplicacionFecha {
    public static void main(String[] args) {
        Fecha fecha = new Fecha();
        fecha.leer();
        System.out.println(fecha.bisiesto());
        System.out.println("\nFecha en formato corto:");
        fecha.corta();

        System.out.println("Número de días transcurridos desde 1-1-1900: " + fecha.diasTranscurridos());

        System.out.println("Día de la semana: " + fecha.diaSemana());

        System.out.println("\nFecha en formato largo:");
        fecha.larga();

        Fecha otraFecha = fecha.copia();
        otraFecha.fechaTras(30);
        System.out.println("\nOtra fecha después de 30 días:");
        otraFecha.corta();

        System.out.println("Días entre las dos fechas: " + fecha.diasEntre(otraFecha));

        System.out.println("\nFecha después de un día:");
        fecha.siguiente();
        fecha.corta();

        System.out.println("\nFecha anterior a un día:");
        fecha.anterior();
        fecha.corta();

        fecha.fechaFutura(365);
        System.out.println("\nFecha futura después de 365 días:");
        fecha.corta();

        System.out.println("\nComparación entre fechas:");
        System.out.println("¿Fecha igual que otraFecha? " + Fecha.igualQue(fecha, otraFecha));
        System.out.println("¿Fecha menor que otraFecha? " + Fecha.menorQue(fecha, otraFecha));
        System.out.println("¿Fecha mayor que otraFecha? " + Fecha.mayorQue(fecha, otraFecha));
    }

}
