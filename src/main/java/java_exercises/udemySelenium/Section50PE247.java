package java_exercises.udemySelenium;

public class Section50PE247 {

    /****************************************************************
     *
     *
     * Assume you have a string "this is a test string".
     *
     * You need to write a code to reverse the string.
     * The output should be "string test a is this".
     *
     * There is a reverse method by default available in Java,
     * DO NOT USE THAT METHOD
     *
     * Implement the knowledge you learned in previous lectures
     * This challenge will utilize knowledge of strings, if conditions
     * and for loops and some built-in functions also.
     *
     * Try to do some checks for the input string to make sure it is
     * a valid string.
     *
     *
     ******************************************************************/
    public static void main(String[] args) {
        String input = "";
        System.out.println(reverse(input));
    }

    private static String reverse(String input) {
        String reversed = "";

        if(input == null || input.trim().isEmpty()){
            System.out.println("The provided string is empty. Please provide a valid string");
        }else if(input.trim().length() == 1){
            return input;
        }else{
            String[] originalString = input.split("\\s+");
            for(String item : originalString){
                reversed = String.format("%s %s", item, reversed);
            }
        }
        return reversed.trim();
    }
}
//***************************THE STUPIDEST METHOD ONLY THE DUMBEST PERSON COULD THINK OF*************************************//

//    private static char[] reverse(String input) {
//
//        //verify that the string is a letter
//        if(input.trim().isEmpty() || input ==null){
//            String warning = "The string is empty. Please provide a valid string to be reversed";
//            return warning.toCharArray();
//        }else if(input.length()==1 || !input.contains(" ")){
//            return input.toCharArray();
//        }else {
//
//            char[] oldString = input.toCharArray();
//            char[] newString = new char[input.length()];
//            int minLimit = 0, maxLimit = input.length() - 1, i, k;
//            for (i = minLimit; i <= input.lastIndexOf(' '); i++) {
//                if (oldString[i] == ' ') {
//                    for (k = minLimit; k < i; k++) {
//                        newString[maxLimit - i + 1 + k] = oldString[k];
//                    }
//                    newString[input.length() - 1 - i] = oldString[i];
//                    minLimit = i + 1;
//                    maxLimit = input.length() - 1 - minLimit;
//
//                }
//            }
//            int j = 0;
//            for (k = input.lastIndexOf(' ') + 1; k < input.length(); k++) {
//                newString[j] = oldString[k];
//                j++;
//            }
//            return newString;
//        }
//
//    }



