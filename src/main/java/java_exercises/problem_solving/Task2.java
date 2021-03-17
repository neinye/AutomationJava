package java_exercises.problem_solving;

import java.util.Scanner;

/*
Drawing a staircase structure - given the required height, output a staircase as shown in the example
Given n = 6, the output should be:
#
##
###
####
#####
######
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please provide the staircase height: ");
        int height = input.nextInt();
        for(int i = 1; i <= height; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
