package ejercicio2;

class Edificio implements ImpactoEcologico {
    private double area;
    private int numeroDePersonas;
    private final double emisionXPersona = 0.2; 
    
    public Edificio(double area, int numeroDePersonas) {
        this.area = area;
        this.numeroDePersonas = numeroDePersonas;
    }
    
    @Override
    public double obtenerImpactoEcologico() {
        double DATO_ACTIVIDAD = (area * numeroDePersonas*emisionXPersona);
        double FACTOR_DE_EMISION = 0.5;
        return DATO_ACTIVIDAD * FACTOR_DE_EMISION;
    }
}
