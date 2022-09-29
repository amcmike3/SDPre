public class Objective3Lab2 {
  public static void main(String[] args) {
    double side1 = 10;
    double side2 = 8;
    double hypotinuse;
    double side12 = side1 * side1;
    double side22 = side2 * side2;
    hypotinuse = Math.sqrt(side12 + side22);
    System.out.print("The hypotenuse of a triangle with sides ");
    System.out.print(side1);
    System.out.print(" and " + side2 + " is " + hypotinuse);
  }
}
