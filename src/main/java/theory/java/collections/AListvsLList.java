package theory.java.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/***
 * Array List vs Linked List
 */
public class AListvsLList {

    public static void main(String[] args) {
        List<Integer> aList = new ArrayList<>();
        List<Integer> lList = new LinkedList<>();
        runDuration(aList, "Array List");
        runDuration(lList, "Linked List");

    }
    public static void runDuration(List<Integer> list, String listType){
        System.out.println("\nBeginning of the duration calculation method for " + listType);
        for(int i = 0; i <100000; i++){
            list.add(i); //faster in Array List
        }
        int size = list.size();
        int elementToAdd = size + 100000;
        long startTime = System.currentTimeMillis();

//        for(int i = size; i < elementToAdd; i++){
//            list.add(i);//faster in a Linked List
//        }
//        for(int i = size; i < elementToAdd; i++){
//            list.add(0, i); //much faster in a Linked list
//        }
//        for (int i = 90000; i < 92000; i++){
//            list.remove(i); // much faster in the Array List
//        }
//        for (int i = 0; i < 300; i++){
//            list.remove(i); //faster in the Linked List
//        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("The duration of the methods in the " + listType + " is " + duration + " ms");
    }
}
