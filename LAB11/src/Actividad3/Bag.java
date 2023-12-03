package Actividad3;

public class Bag <T> {
	private T [] list;
	private int count; //Contador de objetos que hay en la bolsa
	public Bag(int n){
		this.list = (T[]) new Object[n];
		this.count = 0;
	}
	public void add(T obj) throws IsFull{
		if (count < list.length) {
			list[count] = obj;
			count ++;
		} else {
			throw new IsFull("La bolsa esta llena");
		}
	}
	public T[] getObjects() throws IsEmpty {
        if (count > 0) {
            return list;
        } else {
            throw new IsEmpty("La bolsa está vacía");
        }
    }
	public T remove(T obj) throws ObjectNoExist {
        int index = getIndex(obj);
        if (index != -1) {
            T removedObj = list[index];
            // Mover los elementos restantes hacia la izquierda para llenar el espacio
            for (int i = index; i < count - 1; i++) {
                list[i] = list[i + 1];
            }
            list[count - 1] = null; // Eliminar la última referencia para evitar duplicados
            count--;
            return removedObj;
        } else {
            throw new ObjectNoExist("El objeto no existe en la bolsa");
        }
    }
	public int getIndex(T obj) {
        for (int i = 0; i < count; i++) {
            if (list[i].equals(obj)) {
                return i;
            }
        }
        return -1; // El objeto no se encontró en la bolsa
    }
	@Override
    public String toString() {
        StringBuilder result = new StringBuilder("Contenido de la bolsa: [");
        for (int i = 0; i < count; i++) {
            result.append(list[i]);
            if (i < count - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}