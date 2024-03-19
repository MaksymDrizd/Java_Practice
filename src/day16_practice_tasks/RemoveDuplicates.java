package day16_practice_tasks;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(
                20,15,10,20,30,10,20,15,0
        ));

        /*
        Set<Integer> set = new TreeSet<>(list);
        list.clear();
        list.addAll(set);
        System.out.println(list);
         */
        removeDuplicates(list);



    }
    public static void removeDuplicates(List<Integer> list){

        List<Integer> uniqueElements = new ArrayList<>();
        for (Integer each : list) {
            if (uniqueElements.contains(each)){
                continue;
            }
            uniqueElements.add(each);
        }
        list.clear();
        list.addAll(uniqueElements);
        Collections.sort(list);
        System.out.println(list);
    }


}
/*1. Create a class named RemoveDuplicates and write a program that takes a list of integers,
 removes any duplicate values, and returns the elements in sorted order.

         Example:
            {20, 15, 10, 20, 30, 10, 20, 15, 0}

         Output:
            {0, 10, 15, 20, 30}

 */
