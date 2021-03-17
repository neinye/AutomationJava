package theory.java.introduction;

public class StringMethods {

    public static void main(String[] args) {
        String str = "This is tHe teSt stRinG";

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "";
        String str5 = "  Spaces all around      ";
        String str6 = "Hello";


        System.out.println("Length of the string is: " + str.length());
        System.out.println("Character at index 2 is: " + str.charAt(4)); //space
        System.out.println(str.concat(". This is the appended string."));
        System.out.println("'Contains' check: " + str.contains("testy"));
        System.out.println("'Starts with' check: " + str.startsWith("Thi"));
        System.out.println("'Ends with' check: " + str.endsWith(" string"));
        System.out.println("The string still is: " + str);
        System.out.println("Check if str1 equals str2: " + str1.equals(str2));
        System.out.println("Returns index of 'q': " + str.indexOf('q'));
        System.out.println("Check if str3 is empty: " + str3.isEmpty());
        System.out.println("Replace: " + str6.replace('l', 'k'));
        System.out.println("Substring 1: " + str.substring(5));
        System.out.println("Substring 2: " + str.substring(5, 10)); //primul inclusiv, al doilea exclusiv
        System.out.println("str5 is: " + str5);
        System.out.println("Trimming the leading and trailing spaces: " + str5.trim());

        char[] charArray = str.toCharArray();
        for(int i = 0; i<charArray.length; i++){
            System.out.println("Index " + i + " is: " + charArray[i]);
        }

        System.out.println("Lower case: " + str.toLowerCase());
        System.out.println("Upper case: "  + str.toUpperCase());

    }
}
