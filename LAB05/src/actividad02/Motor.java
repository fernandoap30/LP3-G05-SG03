package actividad02;

public class Motor {

	private int numMotor;
	private int revPorMin;
	
	public Motor(int numMotor, int revPorMin) {
		super();
		this.numMotor = numMotor;
		this.revPorMin = revPorMin;
	}

	@Override
	public String toString() {
		return "motor [numMotor=" + numMotor + ", revPorMin=" + revPorMin + "]";
	}

	public int getNumMotor() {
		return numMotor;
	}

	public void setNumMotor(int numMotor) {
		this.numMotor = numMotor;
	}

	public int getRevPorMin() {
		return revPorMin;
	}

	public void setRevPorMin(int revPorMin) {
		this.revPorMin = revPorMin;
	}
	
	
	
}
