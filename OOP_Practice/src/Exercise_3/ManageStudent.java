package Exercise_3;

import java.util.ArrayList;
import java.util.List;

public class ManageStudent {
	private List<People> listStudent;
	
	public ManageStudent() {
		this.listStudent = new ArrayList<People>();
	}
	
	public void addStudent(People people) {
		this.listStudent.add(people);
	}
	
	public void showInformation() {
		this.listStudent.forEach(student->{
			System.out.println(student.toString());
		});
	}
	
	public People searchStudentByID(int id) {
		return this.listStudent.stream()
					.filter(student -> student.getId() == id)
					.findFirst().orElse(null);
	}
}
