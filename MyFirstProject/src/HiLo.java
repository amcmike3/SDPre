import java.util.Scanner;

public class HiLo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int randNum = (int) (Math.random() * 20);
		boolean keepGoing = true;
		
		while (keepGoing) {
			System.out.println("What is your numerical guess? (0-20)");
			int guess = scanner.nextInt();
			if (guess == randNum) {
				System.out.println("you've won!");
				System.out.println("would you like to play again? (y to continue)");
				String repeat = scanner.next();
				if (repeat.equalsIgnoreCase("y")) {
					randNum = (int) (Math.random() * 21);
					keepGoing = true;
				} else {
					keepGoing = false;
				}
			} else if (guess > randNum){
				System.out.println("your guess is too high");
			} else if (guess < randNum) {
				System.out.println("you guess is too low");
			} else {
				System.out.println("invalid option.");
			}
		}
		scanner.close();
	}
}
