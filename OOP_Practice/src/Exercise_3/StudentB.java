package Exercise_3;

public class StudentB extends People{
	private float markMath;
	private float markChemistry;
	private float markBiology;
	
	public StudentB() {
		super();
	}

	public StudentB(int id, String name, String address, int priority, float markMath, float markChemistry, float markBiology) {
		super(id, name, address, priority);
		this.markChemistry = markChemistry;
		this.markMath = markMath;
		this.markBiology = markBiology;
	}

	public float getMarkMath() {
		return markMath;
	}

	public void setMarkMath(float markMath) {
		this.markMath = markMath;
	}

	public float getMarkChemistry() {
		return markChemistry;
	}

	public void setMarkChemistry(float markChemistry) {
		this.markChemistry = markChemistry;
	}

	public float getMarkBiology() {
		return markBiology;
	}

	public void setMarkBiology(float markBiology) {
		this.markBiology = markBiology;
	}

	@Override
	public String toString() {
		return "StudentB [markMath= " + markMath + ", markChemistry= " + markChemistry + ", markBiology= " + markBiology
				+ ", Id= " + getId() + ", Name= " + getName() + ", Address= " + getAddress()
				+ ", Priority= " + getPriority() + "]";
	}
	
	
}
