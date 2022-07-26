package Exercise_3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageStudent ManageStudent = new ManageStudent();
        while (true) {
            System.out.println("Application Manager People");
            System.out.println("Enter 1: To insert People");
            System.out.println("Enter 2: To show information of People: ");
            System.out.println("Enter 3: To search People by id");
            System.out.println("Enter 4: To exit:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Enter a: to insert People A");
                    System.out.println("Enter b: to insert People B");
                    System.out.println("Enter c: to insert People C");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            ManageStudent.addStudent(createCadidate(scanner, "a"));
                            break;

                        }
                        case "b": {
                            ManageStudent.addStudent(createCadidate(scanner, "b"));
                            break;
                        }
                        case "c": {
                            ManageStudent.addStudent(createCadidate(scanner, "c"));
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "2": {
                    ManageStudent.showInformation();
                    break;
                }
                case "3": {
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    People People = ManageStudent.searchStudentByID(id);
                    if (People == null) {
                        System.out.println("Not found");
                    } else {
                        System.out.println(People.toString());
                    }
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }

        }
    }

    public static People createCadidate(Scanner scanner, String cate) {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Priotity: ");
        int priority = scanner.nextInt();
        scanner.nextLine();
        if (cate.equals("a")) {
            return new StudentA(id, name,address,priority, (float) 9, (float) 9, (float) 9);
        } else if (cate.equals("b")) {
            return new StudentB(id, name,address,priority, (float) 9, (float) 9, (float) 9);
        } else {
            return new StudentB(id, name,address,priority, (float) 9, (float) 9, (float) 9);
        }

    }
}
