package Exercise_6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManageStudent {
	private List<Student>listStudent;
	
	public ManageStudent() {
		this.listStudent = new ArrayList<Student>();
	}
	
	public ManageStudent(List<Student> listStudent) {
		super();
		this.listStudent = listStudent;
	}
	
	public void add(Student student) {
		this.listStudent.add(student);
	}
	
	public void printInformation() {
		this.listStudent.forEach(student -> System.out.println(student.toString()));
	}
	
	public List<Student>getStudent20yearOld(){
		return this.listStudent.stream().filter(student->student.getAge()==20).collect(Collectors.toList());
	}
	
	public int countStudent23yearOldInDN() {
		return (int) this.listStudent.stream()
							.filter(student->student.getAge()==20 &&
							student.getCountry().equals("DN")).count();
	}
}
