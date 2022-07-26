package Exercise_3;

public class StudentC extends People{
	private float markLiterature;
	private float markHistory;
	private float markGeography;
	public StudentC() {
		super();
	}
	public StudentC(int id, String name, String address, int priority, float markLiterature, float markHistory, float markGeography) {
		super(id, name, address, priority);
		this.markGeography = markGeography;
		this.markLiterature = markLiterature;
		this.markHistory = markHistory;
	}
	public float getMarkLiterature() {
		return markLiterature;
	}
	public void setMarkLiterature(float markLiterature) {
		this.markLiterature = markLiterature;
	}
	public float getMarkHistory() {
		return markHistory;
	}
	public void setMarkHistory(float markHistory) {
		this.markHistory = markHistory;
	}
	public float getMarkGeography() {
		return markGeography;
	}
	public void setMarkGeography(float markGeography) {
		this.markGeography = markGeography;
	}
	@Override
	public String toString() {
		return "StudentC [markLiterature=" + markLiterature + ", markHistory=" + markHistory + ", markGeography="
				+ markGeography + ", Id= " + getId() + ", Name= " + getName() + ", Address= " + getAddress()
				+ ", Priority= " + getPriority() + "]";
	}	
}
