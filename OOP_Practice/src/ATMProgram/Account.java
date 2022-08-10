package ATMProgram;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Account {
	private int customerNumber;
	private int pinCustomer;
	private double checkingBalance = 0;
	private double savingBalance = 0;
	
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	public Account(int customerNumber, int pinCustomer, double checkingBalance, double savingBalance) {
		this.customerNumber = customerNumber;
		this.pinCustomer = pinCustomer;
		this.checkingBalance = checkingBalance;
		this.savingBalance = savingBalance;
	}

	public Account(int customerNumber, int pinCustomer) {
		this.customerNumber = customerNumber;
		this.pinCustomer = pinCustomer;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public int getPinCustomer() {
		return pinCustomer;
	}

	public void setPinCustomer(int pinCustomer) {
		this.pinCustomer = pinCustomer;
	}

	public double getCheckingBalance() {
		return checkingBalance;
	}

	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public double getSavingBalance() {
		return savingBalance;
	}

	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}
	
	public double calcCheckingDeposit(double amount) {
		checkingBalance = checkingBalance + amount;
		return checkingBalance;
	}
	
	public double calcSavingDeposit(double amount) {
		savingBalance = savingBalance + amount;
		return savingBalance;
	}
	
	public double calcCheckingWithDraw(double amount) {
		checkingBalance = checkingBalance - amount;
		return checkingBalance;
	}
	
	public double calcSavingWithDraw(double amount) {
		savingBalance = savingBalance - amount;
		return savingBalance;
	}
	
	public void calcCheckingTransfer(double amount) {
		savingBalance = savingBalance + amount;
		checkingBalance = checkingBalance - amount;
	}
	
	public void calcSavingTransfer(double amount) {
		savingBalance = savingBalance - amount;
		checkingBalance = checkingBalance + amount;
	}
	
	public void getCheckingWithDrawnInput() {
		boolean end = false;
		while(!end) {
			try {
				System.out.println("\nCurrent checking account balance: " + moneyFormat.format(checkingBalance));
				System.out.println("\nInput amount you want to withdrawn from checking account: ");
				double amount = input.nextDouble();
				if(amount >= 0 && (checkingBalance - amount) > 0) {
					calcCheckingWithDraw(amount);
					System.out.println("\nCurrent checking account: " + moneyFormat.format(checkingBalance));
					System.out.println("\nValid");
					end = true;
				} else {
					System.out.println("Your input money is invalid");
				}
			} catch (InputMismatchException e) {
				System.out.println("Input is invalid");
				input.next();
			}
		}
	}
	
	public void getSavingWithDrawnInput() {
		boolean end = false;
		while(!end) {
			try {
				System.out.println("\nCurrent saving account balance: " + moneyFormat.format(savingBalance));
				System.out.println("\nInput amount you want to withdrawn from saving account: ");
				double amount = input.nextDouble();
				if(amount >= 0 && (savingBalance - amount) > 0) {
					calcSavingWithDraw(amount);
					System.out.println("\nCurrent saving account: " + moneyFormat.format(savingBalance));
					System.out.println("\nValid");
					end = true;
				} else {
					System.out.println("Your input money is invalid");
				}
			} catch (InputMismatchException e) {
				System.out.println("Input is invalid");
				input.next();
			}
		}
	}
	
	public void getCheckingWithDepositInput() {
		boolean end = false;
		while(!end) {
			try {
				System.out.println("\nCurrent checking account balance: " + moneyFormat.format(checkingBalance));
				System.out.println("\nInput amount you want to deposit to checking account: ");
				double amount = input.nextDouble();
				if(amount >= 0 && (checkingBalance + amount) > 0) {
					calcCheckingDeposit(amount);
					System.out.println("\nCurrent checking account: " + moneyFormat.format(checkingBalance));
					System.out.println("\nValid");
					end = true;
				} else {
					System.out.println("Your input money is invalid");
				}
			} catch (InputMismatchException e) {
				System.out.println("Input is invalid");
				input.next();
			}
		}
	}
	
	public void getSavingWithDepositInput() {
		boolean end = false;
		while(!end) {
			try {
				System.out.println("\nCurrent checking account balance: " + moneyFormat.format(checkingBalance));
				System.out.println("\nInput amount you want to deposit to checking account: ");
				double amount = input.nextDouble();
				if(amount >= 0 && (checkingBalance + amount) > 0) {
					calcSavingDeposit(amount);
					System.out.println("\nCurrent checking account: " + moneyFormat.format(checkingBalance));
					System.out.println("\nValid");
					end = true;
				} else {
					System.out.println("Money should no be negative");
				}
			} catch (InputMismatchException e) {
				System.out.println("Input is invalid");
				input.next();
			}
		}
	}
	
	public void getTransferInput(String accType) {
		boolean end = false;
		while (!end) {
			try {
				if (accType.equals("Checkings")) {
					System.out.println("\nSelect an account you wish to tranfers funds to:");
					System.out.println("1. Savings");
					System.out.println("2. Exit");
					System.out.print("\nChoice: ");
					int choice = input.nextInt();
					switch (choice) {
					case 1:
						System.out.println("\nCurrent Checkings Account Balance: " + moneyFormat.format(checkingBalance));
						System.out.print("\nAmount you want to deposit into your Savings Account: ");
						double amount = input.nextDouble();
						if ((savingBalance + amount) >= 0 && (checkingBalance - amount) >= 0 && amount >= 0) {
							calcCheckingTransfer(amount);
							System.out.println("\nCurrent Savings Account Balance: " + moneyFormat.format(savingBalance));
							System.out.println(
									"\nCurrent Checkings Account Balance: " + moneyFormat.format(checkingBalance));
							end = true;
						} else {
							System.out.println("\nBalance Cannot Be Negative.");
						}
						break;
					case 2:
						return;
					default:
						System.out.println("\nInvalid Choice.");
						break;
					}
				} else if (accType.equals("Savings")) {
					System.out.println("\nSelect an account you wish to tranfers funds to: ");
					System.out.println("1. Checkings");
					System.out.println("2. Exit");
					System.out.print("\nChoice: ");
					int choice = input.nextInt();
					switch (choice) {
					case 1:
						System.out.println("\nCurrent Savings Account Balance: " + moneyFormat.format(savingBalance));
						System.out.print("\nAmount you want to deposit into your savings account: ");
						double amount = input.nextDouble();
						if ((checkingBalance + amount) >= 0 && (savingBalance - amount) >= 0 && amount >= 0) {
							calcSavingTransfer(amount);
							System.out.println("\nCurrent checkings account balance: " + moneyFormat.format(checkingBalance));
							System.out.println("\nCurrent savings account balance: " + moneyFormat.format(savingBalance));
							end = true;
						} else {
							System.out.println("\nBalance Cannot Be Negative.");
						}
						break;
					case 2:
						return;
					default:
						System.out.println("\nInvalid Choice.");
						break;
					}
				}
			} catch (InputMismatchException e) {
				System.out.println("\nInvalid Choice.");
				input.next();
			}
		}
	}
}
