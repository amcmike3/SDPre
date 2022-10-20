import java.util.Scanner;

public class RemoteController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean keepGoing = false;
		System.out.println("to Begin, turn on the contoller.");

		if ((scanner.next().equalsIgnoreCase("on"))) {
			System.out.println("Turning on...");
			keepGoing = true;
		} else {
			System.out.println("Still off.");
		}
		while (keepGoing) {
			System.out.println("push a button");
			String button = scanner.next();
			if (button.equalsIgnoreCase("1")) {

				pressButton();
				
			} else if (button.equalsIgnoreCase("2")) {

				pressButton();
				
			} else if (button.equalsIgnoreCase("3")) {
				pressButton();
				
			} else if (button.equalsIgnoreCase("4")) {
				pressButton();
				
			} else if (button.equalsIgnoreCase("5")) {
				pressButton();

			} else if (button.equalsIgnoreCase("6")) {
				pressButton();

			} else if (button.equalsIgnoreCase("7")) {
				pressButton();

			} else if (button.equalsIgnoreCase("8")) {
				pressButton();

			} else if (button.equalsIgnoreCase("9")) {
				pressButton();

			} else if (button.equalsIgnoreCase("off")) {
				pressOff();
				keepGoing = false;
				
			} else {
				System.out.println("button not recognized");
			}
		}

		scanner.close();
	}
	public static void pressButton() {
		System.out.println("Boop");
	}
	public static void pressOff() {
		System.out.println("Turning off...");
	}
}
