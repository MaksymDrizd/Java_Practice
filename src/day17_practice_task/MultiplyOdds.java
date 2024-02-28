package day17_practice_task;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class MultiplyOdds {

    public static void main(String[] args) {

        Map<Character, Integer> map = new LinkedHashMap<>();
        map.put('a',1);
        map.put('b',2);
        map.put('c',3);
        map.put('d',4);
        map.put('e',5);

        Iterator<Character> itr = map.keySet().iterator();

        while (itr.hasNext()){
            Character key = itr.next();
            if (map.get(key) %2 != 0){
                map.put(key,map.get(key) * 2);
            }
        }
        System.out.println(map);

    }

}
