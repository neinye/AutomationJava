package theory.introduction;

import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {
       int[] myIntArray1;
       myIntArray1 = new int[10];

       myIntArray1[0] = 100;
       myIntArray1[1] = 90;
        System.out.println("0 index: " + myIntArray1[0]);
        System.out.println("1st index: " + myIntArray1[1]);
        System.out.println("2nd index: " + myIntArray1[2]);
        System.out.println("3rd index: " + myIntArray1[3]);

        String[] myStringArray1 = {"bmw", "audi", "honda"};
        System.out.println("0 index: " + myStringArray1[0]);
        System.out.println("1st index: " + myStringArray1[1]);
        System.out.println("2nd index: " + myStringArray1[2]);

        int len1 = myIntArray1.length;
        int len2 = myStringArray1.length;

        System.out.println("The length of the int array is: " + len1 + " and the length of the String array is: " + len2);



        for (int i = 0; i<2; i++){
            System.out.println(myIntArray1[i]);
        }
        Arrays.sort(myIntArray1);
        for (int i = 0; i<2; i++){
            System.out.println(myIntArray1[i]);
        }

    }
}
