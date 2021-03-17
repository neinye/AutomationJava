package java_exercises.w3resource;

import java.util.Scanner;
/*
Write a Java program to print the sum of two numbers.
Test Data:
74 + 36
Expected Output :
110
*/
public class Exercise2Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please provide first number: ");
        double num1 = input.nextDouble();
        System.out.print("Please provide second number: ");
        double num2 = input.nextDouble();
        System.out.println("The sum of the numbers provided is: " + num1 +  " + " + num2 + " = " + (num1 + num2));
    }
}
