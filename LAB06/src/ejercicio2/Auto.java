package ejercicio2;

class Auto implements ImpactoEcologico {
    private double consumoCombustible;
    
    public Auto(double consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }
    
    @Override
    public double obtenerImpactoEcologico() {
        double DATO_ACTIVIDAD = consumoCombustible * 2;   
        double FACTOR_DE_EMISION = 0.3;
        return DATO_ACTIVIDAD * FACTOR_DE_EMISION;
    }
}