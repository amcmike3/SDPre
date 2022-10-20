import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean keepGoing = true;
		while (keepGoing) {
			System.out.println("Welcome to Calculator would you like to keep going? (true, false)");
			keepGoing = scanner.nextBoolean();
			System.out.println("Please enter first number: ");
			int num1 = scanner.nextInt();
			System.out.println("Please enter second number: ");
			int num2 = scanner.nextInt();
			
			System.out.println("do you want to add, subtract, multiply, or divide? ");
			String operation = scanner.next();
			
			if (operation.equalsIgnoreCase("add") || operation.equals("+")) {
				System.out.println(num1 + num2 + " is the result");
			}
			else if (operation.equalsIgnoreCase("subtract") || operation.equals("-")) {
				System.out.println(num1 - num2 + " is the result");
			}
			else if (operation.equalsIgnoreCase("multiply") || operation.equals("*")) {
				System.out.println(num1 * num2 + " is the result");
			}
			else if (operation.equalsIgnoreCase("divide") || operation.equals("/")) {
				System.out.println(num1 / num2 + " is the result");
				System.out.println(num1 % num2 + "is the remainder");
			} else {
				System.out.println("invalid option");
			}
			
			
		}
		scanner.close();
	}
}
