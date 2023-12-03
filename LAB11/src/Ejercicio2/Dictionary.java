package Ejercicio2;

import java.util.ArrayList;

class ObjectNoExist extends Exception {
    public ObjectNoExist(String message) {
        super(message);
    }
}

class Dictionary<K, V> {
    private ArrayList<Pair<K, V>> pairs;

    public Dictionary() {
        this.pairs = new ArrayList<>();
    }

    public void add(K key, V value) {
        Pair<K, V> pair = new Pair<>(key, value);
        pairs.add(pair);
    }

    public boolean delete(K key) {
        for (Pair<K, V> pair : pairs) {
            if (pair.getKey().equals(key)) {
                pairs.remove(pair);
                return true;
            }
        }
        return false;
    }

    public V getValue(K key) throws ObjectNoExist {
        for (Pair<K, V> pair : pairs) {
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }
        throw new ObjectNoExist("No se encontro esa key.");
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Pair<K, V> pair : pairs) {
            result.append(pair.toString()).append("\n");
        }
        return result.toString();
    }

    private static class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "(" + key + ", " + value + ")";
        }
    }

    public static void main(String[] args) {
        Dictionary<Object, Object> dictionary = new Dictionary<>();

        dictionary.add("a", 1);
        dictionary.add("b", 2);
        dictionary.add("c", 3);
        dictionary.add("b", 4);
        
        
        System.out.println("Diccionario:");
        System.out.println(dictionary);

        System.out.println("Borrando:");
        boolean deleted = dictionary.delete("b");
        System.out.println("Borró?: " + deleted);

      
        System.out.println("Diccionario despues de eliminar:");
        System.out.println(dictionary);

        
        try {
            Object value = dictionary.getValue("r");
            System.out.println("Valor para la key 'a': " + value);
        } catch (ObjectNoExist e) {
            System.out.println(e.getMessage());
        }
    }
}
