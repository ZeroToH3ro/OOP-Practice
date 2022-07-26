package Exercise_2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	ManageResources managerDocument = new ManageResources();
	while(true)
	{
		System.out.println("Application Manager Document");
		System.out.println("Enter 1: To insert document");
		System.out.println("Enter 2: To search document by category: ");
		System.out.println("Enter 3: To show information documents");
		System.out.println("Enter 4: To remove document by id");
		System.out.println("Enter 5: To exit:");
		String line = scanner.nextLine();
		switch (line) {
		case "1": {
			System.out.println("Enter a: to insert Book");
			System.out.println("Enter b: to insert Magazine");
			System.out.println("Enter c: to insert Newspaper");
			String type = scanner.nextLine();
			switch (type) {
			case "a": {
				System.out.print("Enter ID: ");
				int id = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enter nxb:");
				String nxb = scanner.nextLine();
				System.out.print("Enter number: ");
				int number = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enter author: ");
				String author = scanner.nextLine();
				System.out.print("Enter page number: ");
				int pageNumber = scanner.nextInt();
				scanner.nextLine();
				Document book = new Book(id, nxb, number, author, pageNumber);
				managerDocument.addDocument(book);
				System.out.println(book.toString());
				scanner.nextLine();
				break;

			}
			case "b": {
				System.out.print("Enter ID: ");
				int id = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enter nxb:");
				String nxb = scanner.nextLine();
				System.out.print("Enter number: ");
				int number = scanner.nextInt();
				System.out.print("Enter Day issue: ");
				int dayIssue = scanner.nextInt();
				scanner.nextLine();
				Document newspaper = new Magazine(id, nxb, number, dayIssue);
				managerDocument.addDocument(newspaper);
				System.out.println(newspaper.toString());
				scanner.nextLine();
				break;
			}
			case "c": {
				System.out.print("Enter ID: ");
				int id = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enter nxb:");
				String nxb = scanner.nextLine();
				System.out.print("Enter number: ");
				int number = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enter issue number : ");
				int issueNumber = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enter issue month : ");
				int issueMonth = scanner.nextInt();
				scanner.nextLine();
				Document journal = new Newspaper(id, nxb, number, issueNumber, issueMonth);
				managerDocument.addDocument(journal);
				System.out.println(journal.toString());
				scanner.nextLine();
				break;
			}
			default:
				break;
			}
			break;
		}
		case "2": {
			System.out.println("Enter a to search book");
			System.out.println("Enter b to search newspaper");
			System.out.println("Enter a to search magazine");
			String choise = scanner.nextLine();
			switch (choise) {
			case "a": {
				managerDocument.searchByBook();
				break;
			}
			case "b": {
				managerDocument.searchByNewsPaper();;
				break;
			}
			case "c":
				managerDocument.searchByMagazine();
				break;
			default:
				System.out.println("Invalid");
				break;
			}
			break;
		}
		case "3": {
			managerDocument.showInformationDocument();;
			break;
		}
		case "4": {
			System.out.print("Enter id to remove: ");
			int id = scanner.nextInt();
			scanner.nextLine();
			System.out.println(managerDocument.deleteDocument(id) ? "Success" : "Fail");
		}
			break;
		case "5": {
			return;
		}
		default:
			System.out.println("Invalid");
			continue;
			}
		}
	}
}
