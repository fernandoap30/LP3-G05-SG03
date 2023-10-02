package ejercicio02;

public class Automovil {
    private String placa;
    private int numPuertas;
    private String marca;
    private String modelo;
    private Motor motor;

    public Automovil(String placa, int numPuertas, String marca, String modelo, Motor motor) {
        this.placa = placa;
        this.numPuertas = numPuertas;
        this.marca = marca;
        this.modelo = modelo;
        this.motor  = motor;
    }
    public Automovil(String placa, int numPuertas, String marca, String modelo) {
        this.placa = placa;
        this.numPuertas = numPuertas;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void mostrar() {
    	System.out.println(motor);
    }
    
    @Override
    public String toString() {
        if (motor != null) {
            return "con motor\n" + 
        			"Placa       : " + placa + "\n" +
        			"N. Puertas  : " + numPuertas + "\n" +
        			"Marca       : " + marca + "\n" + 
        			"Modelo      : " + modelo + "\n" +
        			"N. Motor    : " + motor.getNumMotor() + "\n" + 
        			"RPM         : " + motor.getRevolucionesPorMin();
        } else {
            return "sin motor\n" +
            		"Placa       : " + placa + "\n" + 
            		"N. Puertas  : " + numPuertas + "\n" +
            		"Marca       : " + marca + "\n" +
            		"Modelo      : " + modelo;
        }
    }
}