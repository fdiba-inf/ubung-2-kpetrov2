package exercise2;

import java.util.Scanner;

public class QuadraticEquation {
  
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number for the value a: ");
    double a = input.nextInt();
    
    System.out.println("Enter a number for the value b: ");
    double b = input.nextInt();

    System.out.println("Enter a number for the value c: ");
    double c = input.nextInt();


    if (a != 0) {
      
      double D = (b*b) - (4*a*c);

      if (D >= 0) {

        double x1 = ((-b) + (Math.sqrt(D))) / (2*a);
        double x2 = ((-b) - (Math.sqrt(D))) / (2*a);

        System.out.println("The value of x1 is: " + x1);
        System.out.println("The value of x2 is: " + x2);
      }
      else {

        System.out.println("Imaginary values");
      }
    }
    else if (b != 0) {

      double x = (-c) / b;

      System.out.println("The value of x is: " + x);
    }
    else if (c != 0) {
      
      System.out.println("No values");
    }
    else {

      System.out.println("Many values");
    }
  }
}

