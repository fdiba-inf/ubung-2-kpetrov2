package exercise2;

import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {
       
       Scanner input = new Scanner(System.in);

        System.out.print("Type 1 to 7, if you want: ");
       
        int number = input.nextInt();
      
        if (number == 1) {
          System.out.println("Day of Week: Monday");

        }
        
        else if (number == 2) {
          System.out.println("Day of Week: Tuesday");

        }
        else if (number == 3) {
          System.out.println("Day of Week: Wednesday");

        }
        else if (number == 4) {
          System.out.println("Day of Week: Thursday");

        }
        else if (number == 5) {
          System.out.println("Day of Week: Friday");

        }
        else if (number == 6) {
          System.out.println("Day of Week: Saturday");

        }
        else if (number == 7) {
          System.out.println("Day of Week: Sunday");

        }
        else {
          System.out.println("Day of Week: Invalid day");

        }
    }
}