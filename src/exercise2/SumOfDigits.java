package exercise2;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type 3 Digits: ");
        
        int number = input.nextInt();
        
        int a = number%10;

        int b = (number/10)%10;

        int c = (number/100)%10;

        int sum = a + b + c;

        System.out.println("Sum of digits: " + sum);
    }

}
