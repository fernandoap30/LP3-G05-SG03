package actividad02;

public class TestAgregracion {

	public static void main(String[] args) {
		Automovil a1 = new Automovil("A23P",4,"Toyota","corola");
		System.out.println(a1.getPlaca());
		System.out.println(a1.toString());
		Motor m1 = new Motor(1,100);
		a1.setMotor(m1);
		System.out.println(a1.getMotor());
	}
}
