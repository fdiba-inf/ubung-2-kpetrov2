package exercise2;

public class Circle {

  public static void main (String[] args) {

    Scanner input = new Scanner (System.in);

        System.out.print("Enter the radius: ");
        int number = input.nextInt();
        double C = 2.0*3.14159265359*number;
        double A = 3.14159265359*number*number;

        System.out.println("Circumference: " + C);
        System.out.println("Area: " + A);
  }
}