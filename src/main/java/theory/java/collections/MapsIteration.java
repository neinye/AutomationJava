package theory.java.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsIteration {

    public static void main(String[] args) {

        Map<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1, "BMW");
        hashMap.put(6, "Honda");
        hashMap.put(4, "Audi");

        //if we have a String value defined outside the for loops scope, we will not be able to define it inside them
//        String value = " ";//***
        System.out.println("-------Iteration 1------");
        for(Map.Entry<Integer,String> entry : hashMap.entrySet()){
            System.out.println(entry);
            int key = entry.getKey();
            String value = entry.getValue(); //***variable value is already defined in the scope
            System.out.println("Key: " + key + ", value: " + value);
        }
        System.out.println("-------Iteration 2------");
        for(Integer key: hashMap.keySet()){
            String value = hashMap.get(key);
            System.out.println("Key: "+key +", value: "+value);
        }
        //maintains the order in which the elements are added
        Map<Integer,String> linkedMap = new LinkedHashMap<>();
        linkedMap.put(1, "BMW");
        linkedMap.put(6, "Honda");
        linkedMap.put(4, "Audi");
        System.out.println("-------Iteration 3------");
        System.out.println("Linked Hash Map");
        for(Integer key: linkedMap.keySet()) {
            String value = linkedMap.get(key);
            System.out.println("Key: " + key + ", value: " + value);
        }
        //maintains natural sorting order
        Map<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(2, "BMW-first added");
        treeMap.put(1, "Honda-second added");
        treeMap.put(6, "Audi-third added");
        System.out.println("-------Iteration 4------");
        System.out.println("Tree Map");
        for(Integer key: treeMap.keySet()){
            String value = treeMap.get(key);
            System.out.println("Key: "+key +", value: "+value);
        }
    }
}

