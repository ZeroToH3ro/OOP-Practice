package ATMProgram;

public class Entry {
	public static void main(String[] args) {
		OptionMenu optionMenu = new OptionMenu();
		introduction();
		optionMenu.mainMenu();
	}
	public static void introduction() {
		System.out.println("Welcome to the ATM Project!");
	}
}
