package Exercise_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManageStaff {
	private List<People> listStaff;
	
	public ManageStaff() {
		this.listStaff = new ArrayList<>();
	}
	
	public void addStaff(People people) {
		this.listStaff.add(people);
	}
	
	public List<People>searchStaffByName(String name){
		return this.listStaff.stream().filter(staff->staff.getFullName().contains(name)).collect(Collectors.toList());
	}
	public void showInfoStaff() {	
		this.listStaff.forEach(staff->System.out.println(staff.toString()));
	} 
}

