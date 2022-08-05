package Exercise_6;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ManageStudent mnStudent = new ManageStudent();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. Add student");
			System.out.println("2. Print information student");
			System.out.println("3. Print information student 20 years old");
			System.out.println("4. Count the number of student 23 years old and DN town");
			System.out.println("5. Exit");
			String choice = sc.nextLine();
			switch (choice) {
			case "1":
			{
				System.out.println("Enter name: ");
				String name = sc.nextLine();
				System.out.println("Enter age: ");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter country: ");
				String country = sc.nextLine();
				Student newStudent = new Student(name, age, country);
				mnStudent.add(newStudent);
				System.out.println("Print success !!!");
				break;
			}
			case "2":
			{
				mnStudent.printInformation();
				break;
			}
			case "3":
			{
				mnStudent.getStudent20yearOld().forEach(student->System.out.println(student.toString()));
				break;
			}
			case "4":
			{
				System.out.println("The number student 23 years old in DN: " + mnStudent.countStudent23yearOldInDN());
				break;
			}
			case "5":
			{
				return;
			}
			default:
				break;
			}
			
		}
	}
}
