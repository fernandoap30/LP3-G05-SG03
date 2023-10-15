package ejercicio2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Edificio edificio1 = new Edificio(600, 10);
        Auto auto1 = new Auto(50);
        Bicicleta bicicleta1 = new Bicicleta(true,1000);
        
        ArrayList<ImpactoEcologico> impactoList = new ArrayList<>();
        impactoList.add(edificio1);
        impactoList.add(auto1);
        impactoList.add(bicicleta1);
        
        for (ImpactoEcologico impactoObj : impactoList) {
            if (impactoObj instanceof Edificio) {
                System.out.println("Tipo: Edificio");
            } else if (impactoObj instanceof Auto) {
                System.out.println("Tipo: Auto");
            } else if (impactoObj instanceof Bicicleta) {
                System.out.println("Tipo: Bicicleta");
            }
            double impacto = impactoObj.obtenerImpactoEcologico();
            System.out.println("Impacto Ecológico: " + impacto + " GEI");
            System.out.println();
        }
    }
}