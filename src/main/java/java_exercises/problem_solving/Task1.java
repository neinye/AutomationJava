package java_exercises.problem_solving;

import java.util.Scanner;

/*
Given a string of characters, determine if it is a palindrome or not
*/
public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please provide the sequence to check if it's a palindrome: ");
        String string = input.next();
        boolean isEqual=false;
        for(int i = 0; i<string.length(); i++){
            if(string.charAt(i)==string.charAt(string.length()-i-1)){
                isEqual = true;
            }else{
                isEqual = false;
                break;
            }
        }
        if(isEqual)
            System.out.println("The provided sequence is a palindrome");
        else
            System.out.println("The provided sequence is not a palindrome");
    }
}
