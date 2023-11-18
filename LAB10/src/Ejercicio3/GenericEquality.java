package Ejercicio3;

public class GenericEquality {

    
    public static <T> boolean isEqualTo(T obj1, T obj2) {
        return obj1.equals(obj2);
    }

    public static void main(String[] args) {

        String str1 = "Hola";
        String str2 = "Hola";
        boolean resultStr = isEqualTo(str1, str2);
        System.out.println("Strings son iguales: " + resultStr);

        Integer int1 = 42;
        Integer int2 = 41;
        boolean resultInt = isEqualTo(int1, int2);
        System.out.println("Integers son iguales: " + resultInt);

        Double dbl1 = 3.14;
        Double dbl2 = 3.14;
        boolean resultDbl = isEqualTo(dbl1, dbl2);
        System.out.println("Doubles son iguales: " + resultDbl);

        Object obj1 = new Object();
        Object obj2 = new Object();
        boolean resultObj = isEqualTo(obj1, obj2);
        System.out.println("Objetos son iguales: " + resultObj);
    }
}

