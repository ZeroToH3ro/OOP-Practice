package Exercise_1;

public class Main {
	public static void main(String[] args) {
		Worker worker = new Worker("Anh", 20, "Male", "Q9",11);
		Engineer engineer = new Engineer("Minh", 20, "Male", "QTD", "IT");
		Staff staff = new Staff("Fats", 19, "Female", "QTB", "Web");
		
		System.out.println(worker.toString());
		System.out.println(engineer.toString());
		System.out.println(staff.toString());
	}
}
