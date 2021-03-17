package java_exercises.udemySelenium;

import java.util.Scanner;

public class Section50PE248 {
    /*
    * REVERSE CHARACTERS IN A STRING
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String input = scanner.useDelimiter("\n").next();
        System.out.println("The reversed String method 1: " + reverseCharArray(input));
        System.out.println("The reversed String method 2: " + reverseString(input));
    }

 //------------------------------------------------------------------------------------
    private static String reverseCharArray(String input) {
        char[] reversed = new char[input.length()];
        if (input.trim().isEmpty()) {
            System.out.println("The string is empty!");
        } else if (input.length() == 1) {
            return input;
        } else {
            char[] charInput = input.toCharArray();
            for (int i = 0; i < charInput.length; i++) {
                reversed[charInput.length - 1 - i] = charInput[i];
            }
        }
        return String.valueOf(reversed);
    }
//------------------------------------------------------------------------------------
    private static String reverseString(String input){
        String reversed = "";
        if(input.trim().isEmpty()){
            System.out.println("The string is empty!");
        }else if(input.length()==1){
            return input;
        }else{
            for(int i=input.length()-1; i>-1; i--) {
                reversed = String.format("%s%s", reversed, input.charAt(i));
            }
        }
        return reversed;
    }

}
