package day17_practice_task;

import java.util.LinkedHashMap;
import java.util.Map;

public class MergeMaps {

    public static void main(String[] args) {

        Map<Character,Integer> map1 = new LinkedHashMap<>();
        map1.put('A',10);
        map1.put('B',20);
        Map<Character,Integer> map2 = new LinkedHashMap<>();
        map2.put('B',30);
        map2.put('C',40);
        Map<Character,Integer> mergedMaps = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> map1Entry : map1.entrySet()) {
            mergedMaps.put(map1Entry.getKey(),map1Entry.getValue());
        }
        for (Map.Entry<Character, Integer> map2Entry : map2.entrySet()) {
            char key = map2Entry.getKey();
            int value = map2Entry.getValue();
            if (mergedMaps.containsKey(key)){
                mergedMaps.put(key,mergedMaps.get(key) + value);
            }else {
                mergedMaps.put(key,value);

            }
        }
        System.out.println(mergedMaps);

    }

}
