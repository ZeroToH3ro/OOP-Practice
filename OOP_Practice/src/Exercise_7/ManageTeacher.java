package Exercise_7;

import java.util.ArrayList;
import java.util.List;

public class ManageTeacher {
	private List<Teacher>listTeacher;
	
	public ManageTeacher() {
		this.listTeacher = new ArrayList<>();
	}
	
	public void addTeacher(Teacher teacher) {
		this.listTeacher.add(teacher);
	}
	public boolean deleteTeacher(String idTeacher) {
		Teacher teacherFind = this.listTeacher.stream()
							.filter(teacher->teacher.getIdTeacher().equals(idTeacher))
							.findFirst().orElse(null);
		//check the id teacher is exist
		if(teacherFind == null) return false;
		this.listTeacher.remove(teacherFind);		
		return true;
	}
	public double getSalary(String id) {
        Teacher teacher = this.listTeacher.stream().filter(t -> t.getIdTeacher().equals(id)).findFirst().orElse(null);
        if (teacher == null) {
            return 0;
        }
        return teacher.getOfficalSalary() + teacher.getBonusSalary() + teacher.getMinusSalary();
    }
}
