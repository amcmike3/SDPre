
import java.util.Scanner;

public class HiLo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean keepGoing = true;
		int randNum = (int) (Math.random() * 5);

		while (keepGoing) {
			System.out.println("Please enter a number");
			int userInput = scanner.nextInt();
			if (userInput == randNum) {
				System.out.println("You win!");
				System.out.println("Would you like to keep going? [y/n]");
				String choice = scanner.next();
				if (choice.equalsIgnoreCase("y")) {
					randNum = (int) (Math.random() * 5);

				} else {
					keepGoing = false;

				}
			} else if (userInput > randNum) {
				System.out.println("Your guess is too large!");
			} else if (userInput < randNum) {
				System.out.println("Your guess is too small!");
			} else {
				System.err.println("Invalid option.");
			}
		}
		System.out.println("Goodbye");
		// (int) (Math.random() * 20)
		scanner.close();

	}
}