package ejercicio03;

import java.util.Arrays;

class Banco {
    private String nombreBanco;
    private Persona[] clientes;
    private int capacidad;
    private int numClientes;

    public Banco(String nombreBanco, int capacidad) {
        this.nombreBanco = nombreBanco;
        this.capacidad = capacidad;
        this.clientes = new Persona[capacidad];
        this.numClientes = 0;
    }

    public void agregarCliente(Persona cliente) {
        if (numClientes < capacidad && !clienteExistente(cliente)) {
            clientes[numClientes] = cliente;
            numClientes++;
        }
    }

    public Persona darBajaCliente(String nombreCliente) {
        for (int i = 0; i < numClientes; i++) {
            if (clientes[i].getNombre().equals(nombreCliente)) {
                Persona clienteEliminado = clientes[i];
                clientes[i] = clientes[numClientes - 1];
                clientes[numClientes - 1] = null;
                numClientes--;
                return clienteEliminado;
            }
        }
        return null;
    }

    public void clienteTipo(char tipo) {
        System.out.println("Clientes de tipo " + tipo + ":");
        for (int i = 0; i < numClientes; i++) {
            if (clientes[i].getTipoCuenta() == tipo) {
                System.out.println(clientes[i]);
            }
        }
    }

    public Persona buscarCliente(String nombreCliente) {
        for (int i = 0; i < numClientes; i++) {
            if (clientes[i].getNombre().equals(nombreCliente)) {
                return clientes[i];
            }
        }
        return null;
    }

    private boolean clienteExistente(Persona cliente) {
        for (int i = 0; i < numClientes; i++) {
            if (clientes[i].equals(cliente)) {
                return true;
            }
        }
        return false;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getNumClientes() {
        return numClientes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Banco: ").append(nombreBanco).append("\n");
        sb.append("Clientes:\n");
        for (int i = 0; i < numClientes; i++) {
            sb.append(clientes[i]).append("\n");
        }
        return sb.toString();
    }
}

