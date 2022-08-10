package ATMProgram;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class OptionMenu {	
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	Map<Integer, Account> data = new HashMap<Integer, Account>();
	
	public void getLogin() {
		boolean end = false;
		int customerNumber = 0;
		int pinNumber = 0;
		try {
			while(!end) {
				System.out.println("Enter customer number: ");
				customerNumber = menuInput.nextInt();
				System.out.println("Enter pin number: ");
				pinNumber = menuInput.nextInt();
				Iterator it = data.entrySet().iterator();
				while(it.hasNext()) {
					Map.Entry pair = (Map.Entry) it.next();
					Account account = (Account)pair.getValue();
					if(data.containsKey(customerNumber) && account.getPinCustomer() == pinNumber) {
						getAccountType(account);
						end = true;
						break;
					}
				}
				if (!end) {
					System.out.println("\nWrong Customer Number or Pin Number");
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("\nInvalid character (s)");
		}
	}
	
	public void getAccountType(Account account) {
		boolean end = false;
		while(!end) {
			try {
				System.out.println("\nSelect the account you wnat to access: ");
				System.out.println("Type 1 - Checking account");
				System.out.println("Type 2 - Saving account");
				System.out.println("Type 3 - Exit");
				System.out.println("\nWhat is your choice: ");
				int choice = menuInput.nextInt();
				 
				switch (choice) {
				case 1:
					getChecking(account);
					break;
				case 2:
					getSaving(account);
					break;
				case 3:
					end = true;
					break;
				default:
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("\nInvalid choice");
			}
		}
	}
	
	public void getChecking(Account account) {
		boolean end = false;
		while(!end) {
			try {

				System.out.println("\nCheckings Account: ");
				System.out.println(" Type 1 - View Balance");
				System.out.println(" Type 2 - Withdraw Funds");
				System.out.println(" Type 3 - Deposit Funds");
				System.out.println(" Type 4 - Transfer Funds");
				System.out.println(" Type 5 - Exit");
				System.out.print("\nChoice: ");

				int selection = menuInput.nextInt();
				
				switch (selection) {
				case 1:
					System.out.println("\nChecking account balance: " + moneyFormat.format(account.getCheckingBalance()));
					break;
				case 2:
					account.getCheckingWithDrawnInput();
					break;
				case 3:
					account.getCheckingWithDepositInput();
					break;
				case 4:
					account.getTransferInput("Checkings");
					break;
				case 5:
					end = true;
					break;
				default:
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("\nInvalid choice");
			}
		}
	}
	
	public void getSaving(Account account) {
		boolean end = false;
		while(!end) {
			try {

				System.out.println("\nSavings Account: ");
				System.out.println(" Type 1 - View Balance");
				System.out.println(" Type 2 - Withdraw Funds");
				System.out.println(" Type 3 - Deposit Funds");
				System.out.println(" Type 4 - Transfer Funds");
				System.out.println(" Type 5 - Exit");
				System.out.print("\nChoice: ");

				int selection = menuInput.nextInt();
				
				switch (selection) {
				case 1:
					System.out.println("\nSaving account balance: " + moneyFormat.format(account.getSavingBalance()));
					break;
				case 2:
					account.getSavingWithDrawnInput();
					break;
				case 3:
					account.getSavingWithDepositInput();
					break;
				case 4:
					account.getTransferInput("Savings");
					break;
				case 5:
					end = true;
					break;
				default:
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("\nInvalid choice");
			}
		}
	}
	
	public void createAccount() {
		boolean end = false;
		int cst_no = 0;
		while(!end) {
			try {
				cst_no = menuInput.nextInt();
				Iterator it = data.entrySet().iterator();
				while(it.hasNext()) {
					Map.Entry pair = (Map.Entry) it.next();
					Account account = (Account) pair.getValue();
					if(account.getCustomerNumber() == cst_no) {
						System.out.println("\nAccount already exist, please check your customer number");
					} else {
						end = true;
						break;
					}
				}
				System.out.println("\nStart create account: ");
				System.out.println("\nEnter pin number: ");
				int pinNumber = menuInput.nextInt();
				data.put(cst_no, new Account(cst_no, pinNumber));
				System.out.println("Register successfully");
				System.out.println("Redicting login.........");
				getLogin();
				
			} catch (InputMismatchException e) {
				System.out.println("\nInvalid choice");
			}
		}
	}
	
	public void mainMenu() {
		data.put(952141, new Account(952141, 191904, 1000, 5000));
		data.put(123, new Account(123, 123, 20000, 50000));
		boolean end = false;
		while(!end) {
			try {
				System.out.println("\nType 1 - Login");
				System.out.println("\nType 2 - Create account");
				System.out.println("\nWhat is your choice: ");
				int choice = menuInput.nextInt();
				
				switch (choice) {
				case 1:
					getLogin();
					end = true;
					break;
				case 2:
					createAccount();
					end = true;
					break;
				default:
					break;
				}
				
			} catch (InputMismatchException e) {
				System.out.println("\nInput is invalid");
			}
		}
		System.out.println("\nThank You for using this ATM.\n");
		menuInput.close();
		System.exit(0);
	}
}
