package actividad01;
public class Bicycle {
	static int count; //variable de clase
	private String ownerName; //variable de instancia
	private float distance;//variable de instancia
	private String idByci;//variable de instancia
	
	public Bicycle(String owerName, int distance) {//variable de instancia
		this.ownerName = owerName;
		this.distance = distance;
		counter();
		String tempId = String.valueOf(1000*count);//Variable de clase
		this.idByci = ownerName.substring(0,2)+tempId.substring(1);
	}
	public String getOwnerName() {//metodo de instancia
		return ownerName;
	}
	public float getDistance() {//metodo de instancia
		return distance;
	}
	public void distanceTraveled (int meters) {//metodo de instancia
		this.distance += meters;
	}
	public static void counter() {//metodo de clase
		count++;
	}
	public static Bicycle mostUsed(Bicycle x, Bicycle y) {//metodo de clase
		if(x.distance > y.distance) 
			return x;
		return y;
	}
	@Override
	public String toString() {//metodo de instancia
		String s = String.format("Bicycle: %s\nownerName : %s\tDistance in meters : %10.2f\n",this.idByci,this.ownerName,this.distance);
		//^variable de clase
		return s;
	}
}