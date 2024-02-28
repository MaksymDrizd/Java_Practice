package day16_practice_tasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CommonElements {

    public static void main(String[] args) {

        Set<Integer> set1 = new TreeSet<>(Arrays.asList(10,8,11,20,5,0));
        Set<Integer> set2 = new TreeSet<>(Arrays.asList(30,0,20,40,50,10,60));

        Set<Integer> set3 = new TreeSet<>(set1);
        set3.retainAll(set2);

        /*for (Integer each : set1) {
            for (Integer each1 : set2) {
                if (each == each1){
                    set3.add(each);
                }
            }
        }
         */

        System.out.println(set3);


    }


}
