package day17_practice_task;

import java.util.LinkedHashMap;
import java.util.Map;

public class InvertMap {

    public static void main(String[] args) {

        Map<Integer,String> map = new LinkedHashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");


        Map<String,Integer> invertMap = new LinkedHashMap<>();

        for (Map.Entry<Integer, String> mapEntry : map.entrySet()) {
            invertMap.put(mapEntry.getValue(),mapEntry.getKey());
        }
        System.out.println(map);
        System.out.println(invertMap);

    }

}
