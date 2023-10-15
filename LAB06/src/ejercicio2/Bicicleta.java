package ejercicio2;

class Bicicleta implements ImpactoEcologico {
    private boolean esElectrica;
    private int distanciaRecorrida;
    
    public Bicicleta(boolean esElectrica, int distancia) {
        this.esElectrica = esElectrica;
        this.distanciaRecorrida= distancia;
    }
    
    @Override
    public double obtenerImpactoEcologico() {
    	double DATO_ACTIVIDAD;
        if (esElectrica) {
            DATO_ACTIVIDAD = 0.5 * distanciaRecorrida;
        } else {
            DATO_ACTIVIDAD = 0.1 * distanciaRecorrida;
        }
        double FACTOR_DE_EMISION = 0.05;
        return DATO_ACTIVIDAD * FACTOR_DE_EMISION;
    }
}