package Exercise_1;

public class Worker extends People{
	private int level;

	public Worker() {
		super();
	}

	public Worker(String fullName, int age, String sex, String address, int level) {
		super(fullName, age, sex, address);
		this.level = level;
	}

	public int getLevel() {
		return level;
	}
	public boolean checkLevelValid(int level) {
		if(level > 0 || level <= 10) return true;
		return false;
	}
	public void setLevel(int level) {
		if(checkLevelValid(level)){
			this.level = level;
		}
		System.out.println("Level is invalid");
	}

	@Override
	public String toString() {
		return "Worker: level = " + level + ", Name =" + getFullName() + ", Age = " + getAge() + ", Sex = "
				+ getSex() + ", Address = " + getAddress();
	}
	
	
}
