import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter First Name");
    String fname = scanner.nextLine();
    System.out.println("Enter Last Name");
    String lname = scanner.nextLine();
    System.out.println("Enter Favorite Animal");
    String favoriteAnimal = scanner.nextLine();
    System.out.println("Enter Favorite Food");
    String favoriteFood = scanner.nextLine();
    System.out.println("Enter Favorite Song");
    String favoriteSong = scanner.nextLine();

    System.out.println("My name is " + fname + " " + lname + ".");
    System.out.println("My favorite animal is the " + favoriteAnimal + ".");
    System.out.println("My favorite food is " + favoriteFood + ".");
    System.out.println("My favorite song is " + favoriteSong + ".");
    //TODO prompt the user to get input for all of the String variables.

    //TODO print the output formatted to look like the expected output using String concatenation.

  }
}
