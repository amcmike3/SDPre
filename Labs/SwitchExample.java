public class SwitchExample {
  public static void main(String[] args) {
    char grade = 'B';

    switch (grade) {
    case 'A':
    case 'a':
      System.out.println("Fantastic work!");
      break;
    case 'B':
    case 'b':
      System.out.println("Good work!");
      break;
    case 'C':
    case 'c':
      System.out.println("Doing alright!");
      break;
    case 'D':
    case 'd':
      System.out.println("You need to try harder");
      break;
    case 'F':
    case 'f':
      System.out.println("Get off your lazy ass, do your work and study.");
      break;
    default:
      System.out.println("Invalid grade talk to your teacher.");

    }
  }
}
