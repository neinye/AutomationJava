package java_exercises.w3resource;
/*
Write a Java program to divide two numbers and print on the screen.
        Test Data :
        50/3
        Expected Output :
        16
*/
import java.util.Scanner;

public class Exercise3Division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please provide first number ");
        double num1 = input.nextDouble();
        System.out.print("Please provide second number ");
        double num2 = input.nextDouble();
        System.out.println("The result of the  division is: " + num1 + " / " + num2 + " = " + (num1 / num2));
    }
}
