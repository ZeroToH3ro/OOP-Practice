package Exercise_7;

public class Teacher {
	private float officalSalary;
	private float bonusSalary;
	private float minusSalary;
	private String name;
	private int age;
	private String homeTown;
	private String idTeacher;
	
	public Teacher() {
		
	}
	public Teacher(float officalSalary, float bonusSalary, float minusSalary, String name, int age, String homeTown,
			String idTeacher) {
		super();
		this.officalSalary = officalSalary;
		this.bonusSalary = bonusSalary;
		this.minusSalary = minusSalary;
		this.name = name;
		this.age = age;
		this.homeTown = homeTown;
		this.idTeacher = idTeacher;
	}
	public float getOfficalSalary() {
		return officalSalary;
	}
	public void setOfficalSalary(float officalSalary) {
		this.officalSalary = officalSalary;
	}
	public float getBonusSalary() {
		return bonusSalary;
	}
	public void setBonusSalary(float bonusSalary) {
		this.bonusSalary = bonusSalary;
	}
	public float getMinusSalary() {
		return minusSalary;
	}
	public void setMinusSalary(float minusSalary) {
		this.minusSalary = minusSalary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHomeTown() {
		return homeTown;
	}
	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}
	public String getIdTeacher() {
		return idTeacher;
	}
	public void setIdTeacher(String idTeacher) {
		this.idTeacher = idTeacher;
	}

}
