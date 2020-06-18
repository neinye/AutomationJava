package theory.collections;

import java.util.*;

/**
 *  it stores only unique elements
 */
public class SetsDemo {
    public static void main(String[] args) {
        //The HashSet does not maintain the order of elements
        Set<String> set = new HashSet<String>();
        set.add("BMW");
        set.add("Audi");
        set.add("Audi"); //it's not gonna add this element to the set because it is not unique
        set.add("Honda");
        set.add("Honda"); //it's not gonna add this element to the set because it is not unique
        System.out.println("This is the HashSet");

        for(String item:set){
            System.out.println(item);
        }
        //The LinkedHashSet maintans the order in which the elements are added
        Set<String> lHSet = new LinkedHashSet<>();
        lHSet.add("BMW");
        lHSet.add("Audi");
        lHSet.add("Audi"); //it's not gonna add this element to the set because it is not unique
        lHSet.add("Honda");
        lHSet.add("Honda"); //it's not gonna add this element to the set because it is not unique
        System.out.println("This is the LinkedHashSet");
        for(String item:lHSet){
            System.out.println(item);
        }

        //TreeSet maintains the natural sorting (1,2,3) and alphabetical.
        // also it is not as fast as the Linked Hash Set, cause it has to reorder
        Set<String> tSet = new TreeSet<>();
        tSet.add("BMW");
        tSet.add("Audi");
        tSet.add("Honda");
        tSet.add("Audi"); //it's not gonna add this element to the set because it is not unique
        tSet.add("Honda"); //it's not gonna add this element to the set because it is not unique
        System.out.println("This is the TreeSet");
        for(String item:tSet){
            System.out.println(item);
        }
        //ArrayList
        List<String> list = new ArrayList<String>();
        list.add("BMW");
        list.add("Audi");
        list.add("Honda");
        list.add("Honda");
        System.out.println("This is the Array List: " + list);
    }
}
