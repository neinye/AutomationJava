package theory.collections;

import java.util.ArrayList;
import java.util.List;

/***
 * ArrayList - {0, 1, 2, 3, 4, 5, 6}
 * LinkedList - [0] > [1] > [2] > [3]
 *                  <     <     <
 * Array List is used when you have to add at the end and to remove from the end. Getting the element is fast
 * Linked List is used when you have to add and remove from the beginning. Getting the element is slow.
 */
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>(/*the default is 10*/);
        List<Integer> aList = new ArrayList<Integer>();
        //Adding elements to the Array List
        cars.add("BMW");
        cars.add("Audi");
        cars.add("BMW");

        //Checking the size of the Array List
        int size = cars.size();
        System.out.println("The size of the Array List is: " + size);

        //Getting the value of the element at index i
        System.out.println("The element at index 1 is: " + cars.get(1));

        //Iterating through the Array List
        System.out.println("Iterating through the Array List:");
        for(int i = 0; i < size; i++){
            System.out.println("The element at index " + i + " has the value: " + cars.get(i));
        }
        System.out.println("\nIterating with for each loop");
        for(String car : cars){
            System.out.println("The value is: " + car);
        }

        //Removing an element from the Array List (takes some time if the element is in the middle or beggining)
        cars.remove(size-1);//this removes the last element from the Array List
        System.out.println("\nIterating with for each loop after removal of the last element");
        for(String car : cars){
            System.out.println("The value is: " + car);
        }

        aList.add(2, 10); //add stuff to different indexes
    }
}
