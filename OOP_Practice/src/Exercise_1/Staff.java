package Exercise_1;

public class Staff extends People {
	private String job;

	public Staff() {
		super();
	}

	public Staff(String fullName, int age, String sex, String address, String job) {
		super(fullName, age, sex, address);
		this.job = job;
	}

	public String getJob() {
		return job;
	}

	@Override
	public String toString() {
		return "Staff: Job=" + job + ", Name = " + getFullName() + ", Age = " + getAge() + ", Sex = "
				+ getSex() + ", Address = " + getAddress();
	}
}
