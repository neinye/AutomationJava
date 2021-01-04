package java_exercises.w3resource;
/*
Write a Java program to print 'Hello' on screen and then print your name on a separate line.

Expected Output :
Hello
Alexandra Abramov
 */

import java.util.Scanner;

public class Exercise1Scan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your first name?");
        String fname=input.next();
        System.out.print("What is your last name?");
        String lname=input.next();
        System.out.println("Hello\n"+fname+" "+lname);
    }

}
