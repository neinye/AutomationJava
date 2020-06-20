package theory.java.collections;

import java.util.LinkedList;
import java.util.List;

/***
 * ArrayList - {0, 1, 2, 3, 4, 5, 6}
 * LinkedList - [0] > [1] > [2] > [3]
 *                  <     <     <
 * Array List is used when you have to add at the end and to remove from the end. Getting the element is fast
 * Linked List is used when you have to add and remove from the beginning. Getting the element is slow.
 */
public class LinkedLists {

    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>(/*the default is 10*/);
        List<Integer> lList = new LinkedList<>();


        //Adding elements to the Linked List
        cars.add("BMW");
        cars.add("Audi");
        cars.add("BMW");

        //Checking the size of the Linked List
        int size = cars.size();
        System.out.println("The size of the Linked List is: " + size);

        //Getting the value of the element at index i
        System.out.println("The element at index 1 is: " + cars.get(1));

        //Iterating through the Array List
        System.out.println("Iterating through the Linked List:");
        for(int i = 0; i < size; i++){
            System.out.println("The element at index " + i + " has the value: " + cars.get(i));
        }
        System.out.println("\nIterating with for each loop");
        for(String car : cars){
            System.out.println("The value is: " + car);
        }

        //Removing an element from the Linked List (takes some time if the element is in the middle or beggining)
        cars.remove(size-1);//this removes the last element from the Array List
        System.out.println("\nIterating with for each loop after removal of the last element");
        for(String car : cars){
            System.out.println("The value is: " + car);
        }
        lList.add(3, 2);//adding stuff to the 3rd index
    }
}
