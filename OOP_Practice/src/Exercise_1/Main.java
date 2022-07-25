package Exercise_1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ManageStaff mnStaff = new ManageStaff();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			 System.out.println("Application Manager Officer");
	         System.out.println("Enter 1: To insert officer");
	         System.out.println("Enter 2: To search officer by name: ");
	         System.out.println("Enter 3: To show information officers");
	         System.out.println("Enter 4: To exit:");
	         String line = scanner.nextLine();
	         switch (line) {
			case "1":
			{
				System.out.println("Enter a: to insert Enginner");
                System.out.println("Enter b: to insert Worker");
                System.out.println("Enter c: to insert Staff");
                String type = scanner.nextLine();
                switch (type) {
				case "a":
				{
					System.out.println("Enter name: ");
					String name = scanner.nextLine();
					System.out.println("Enter age: ");
					int age = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Enter sex: ");
					String sex = scanner.nextLine();
					System.out.println("Enter address: ");
					String address = scanner.nextLine();
					System.out.println("Enter special training: ");
					String specialTraining = scanner.nextLine();
					People engineer = new Engineer(name, age, sex , address, specialTraining);
					mnStaff.addStaff(engineer);
					System.out.println("Done");
					System.out.println(engineer.toString());
					break;
				}
				case "b":
				{
					System.out.println("Enter name: ");
					String name = scanner.nextLine();
					System.out.println("Enter age: ");
					int age = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Enter sex: ");
					String sex = scanner.nextLine();
					System.out.println("Enter address: ");
					String address = scanner.nextLine();
					System.out.println("Enter level: ");
					int level = scanner.nextInt();
					People worker = new Worker(name, age, sex , address, level);
					mnStaff.addStaff(worker);
					System.out.println("Done");
					System.out.println(worker.toString());
					break;
				}
				case "c":
				{
					System.out.println("Enter name: ");
					String name = scanner.nextLine();
					System.out.println("Enter age: ");
					int age = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Enter sex: ");
					String sex = scanner.nextLine();
					System.out.println("Enter address: ");
					String address = scanner.nextLine();
					System.out.println("Enter job: ");
					String job = scanner.nextLine();
					People staff = new Staff(name, age, sex , address, job);
					mnStaff.addStaff(staff);
					System.out.println("Done");
					System.out.println(staff.toString());
					break;
				}
				default:
					System.out.println("Your choice is invalid");
					break;
				}
				break;
			}
			case "2":
			{
				System.out.println("Enter name to search: ");
				String name = scanner.nextLine();
				mnStaff.searchStaffByName(name).forEach(staff->{
					System.out.println(staff.toString());
				});
				break;
			}
			case "3": {
                mnStaff.showInfoStaff();
                break;
            }
            case "4": {
                return;
            }
			default:
				break;
			}
		}
	}
}
