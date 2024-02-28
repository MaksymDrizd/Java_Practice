package day16_practice_tasks;

import java.util.*;

public class DifferenceBetweenTwoSets {

    public static void main(String[] args) {

        Set<Integer> set1 = new TreeSet<>(Arrays.asList(1,2,3,5));
        Set<Integer> set2 = new TreeSet<>(Arrays.asList(2,3,4));

        //set1.removeIf(p -> set2.contains(p));
        set1.removeAll(set2);
        System.out.println(set1);

    }

}
