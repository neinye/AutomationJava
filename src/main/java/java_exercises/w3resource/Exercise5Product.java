package java_exercises.w3resource;

import java.util.Scanner;

/*
Write a Java program that takes two numbers as input and display the product of two numbers.
        Test Data:
        Input first number: 25
        Input second number: 5
        Expected Output :
        25 x 5 = 125
*/
public class Exercise5Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello. This is the multiplication service.");
        System.out.print("Please input the first number to multiply: ");
        int x = input.nextInt();
        System.out.print("Please input the second number to multiply: ");
        int y = input.nextInt();
        System.out.println(x + " x " + y + " = " + (x*y));
    }
}
