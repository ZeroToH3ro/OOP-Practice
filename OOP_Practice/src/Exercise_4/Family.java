package Exercise_4;

import java.util.List;

public class Family {
	private List<People> person;
	private String address;
	
	public Family(List<People> person, String address) {
		super();
		this.person = person;
		this.address = address;
	}

	public List<People> getPerson() {
		return person;
	}

	public void setPerson(List<People> person) {
		this.person = person;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Family [person=" + person + ", address=" + address + "]";
	}

}
