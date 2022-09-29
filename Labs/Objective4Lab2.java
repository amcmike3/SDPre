import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int num1 = 0, num2 = 0, num3 = 0;
    double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;

    //TODO prompt the user to get input for all of the above int variables.
    System.out.println("Please enter the first whole number you would like to add.");
    num1 = scanner.nextInt();
    System.out.println("Please enter the second whole number you would like to add.");
    num2 = scanner.nextInt();
    System.out.println("Please enter the third whole number you would like to add.");
    num3 = scanner.nextInt();
    System.out.println("Please enter the first decimal number you would like to add.");
    dub1 = scanner.nextDouble();
    System.out.println("Please enter the second decimal number you would like to add.");
    dub2 = scanner.nextDouble();
    System.out.println("Please enter the third decimal number you would like to add.");
    dub3 = scanner.nextDouble();
    //TODO prompt the user to get input for all of the above double variables.

    //TODO print the three ints and their sum.
    int intSum = num1 + num2 + num3;
    System.out.println("The sum of " + num1 + " + " + num2 + " + " + num3 + " = " + intSum);
    //TODO print the three doubles and their sum.
    double dubSum = dub1 + dub2 + dub3;
    System.out.println("The sum of " + dub1 + " + " + dub2 + " + " + dub3 + " = " + dubSum);
    scanner.close();
  }
}
