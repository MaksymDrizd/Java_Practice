package day16_practice_tasks;

import java.util.*;

public class MergeList {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(Arrays.asList(10,20,30,40,50,60,70));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(30,40,50,60,70,80,90,100));
        Set<Integer> list3 = new LinkedHashSet<>();
        list3.addAll(list1);
        list3.addAll(list2);

        //removeDuplicates(list3);
        System.out.println(list3);

    }
    public static void removeDuplicates(List<Integer>list3){
        List<Integer> uniqueElements = new ArrayList<>();
        for (Integer each : list3) {
            if (uniqueElements.contains(each)){
                continue;
            }
            uniqueElements.add(each);
        }
        list3.clear();
        list3.addAll(uniqueElements);
        Collections.sort(list3);
    }

}
