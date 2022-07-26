package Exercise_3;

public class StudentA extends People{
	private float markMath;
	private float markChemistry;
	private float markPhysic;
	
	public StudentA() {
		super();
	}

	public StudentA(int id, String name, String address, int priority, float markMath, float markChemistry, float markPhysic) {
		super(id, name, address, priority);
		this.markChemistry = markChemistry;
		this.markMath = markMath;
		this.markPhysic = markPhysic;
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

	public float getMarkPhysic() {
		return markPhysic;
	}

	public void setMarkPhysic(float markPhysic) {
		this.markPhysic = markPhysic;
	}

	@Override
	public String toString() {
		return "StudentA [markMath= " + markMath + ", markChemistry= " + markChemistry + ", markPhysic= " + markPhysic
				+ ", Id= " + getId() + ", Name= " + getName() + ", Address= " + getAddress()
				+ ", Priority= " + getPriority() + "]";
	}
	
	
	
}
