package Exercise_1;

public class Engineer extends People{
	private String specializedTraining;

	public Engineer() {
		super();
	}

	public Engineer(String fullName, int age, String sex, String address, String specializedTraining) {
		super(fullName, age, sex, address);
		this.specializedTraining = specializedTraining;
	}

	public String getSpecializedTraining() {
		return specializedTraining;
	}

	public void setSpecializedTraining(String specializedTraining) {
		this.specializedTraining = specializedTraining;
	}

	@Override
	public String toString() {
		return "Engineer: specializedTraining = " + specializedTraining + ", Name = " + getFullName()
				+ ", Age = " + getAge() + ", Sex = " + getSex() + ", Address = " + getAddress();
	}
	
	
}
