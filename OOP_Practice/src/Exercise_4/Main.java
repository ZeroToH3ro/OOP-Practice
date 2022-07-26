package Exercise_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Town town = new Town();
		System.out.println("Enter n family");
		int numberOfFamily = sc.nextInt();
		//input data family
		for(int i=1; i<=numberOfFamily ;++i) {
			System.out.println("Family "+i);
			System.out.println("Enter address:");
	        sc.nextLine();
	        String address = sc.nextLine();
	        List<People>people = new ArrayList<People>();
			System.out.println("Enter number people: ");
			int numberOfPeople = sc.nextInt();
			for(int j=1; j<=numberOfPeople; ++j) {
				//input data people 
				System.out.println("People "+j);
				sc.nextLine();
				System.out.print("Enter name: ");
				String name = sc.nextLine();
				System.out.print("Enter age: ");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter job: ");
				String job = sc.nextLine();
				System.out.print("Enter id person: ");
				String idPerson = sc.nextLine();
			}
			//take data into family
			town.addFamily(new Family(people, address));
			System.out.println("DONE");
		}
		
		
	}
}
