package Exercise_4;

public class People {
	private String name;
	private int age;
	private String job;
	private String idPerson;
	
	public People() {
		super();
	}
	
	public People(String name, int age, String job, String idPerson) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
		this.idPerson = idPerson;
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
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getIdPerson() {
		return idPerson;
	}
	public void setIdPerson(String idPerson) {
		this.idPerson = idPerson;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + ", job=" + job + ", idPerson=" + idPerson + "]";
	}
	
}
