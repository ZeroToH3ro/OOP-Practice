package Exercise_3;

public class People {
	private int id;
	private String name;
	private String address;
	private int priority;
	
	public People() {
		super();
	}

	public People(int id, String name, String address, int priority) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.priority = priority;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	
}
