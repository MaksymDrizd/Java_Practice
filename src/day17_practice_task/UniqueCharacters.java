package day17_practice_task;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacters {

    public static void main(String[] args) {

        String string = "aabcccdeeeef";

        Map<Character,Integer> uniqueChar = new LinkedHashMap<>();
        Integer count = 1;
        for (char each : string.toCharArray()) {
            if (uniqueChar.containsKey(each)){
                uniqueChar.put(each,uniqueChar.get(each) + count);
            }  else {
                uniqueChar.put(each,count);
            }
        }
        Iterator<Character> itr = uniqueChar.keySet().iterator();
        while (itr.hasNext()){
            Character key = itr.next();
            if (uniqueChar.get(key) != 1){
                itr.remove();
            }
        }

        System.out.println(uniqueChar);


    }

}
