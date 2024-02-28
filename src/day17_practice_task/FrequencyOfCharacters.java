package day17_practice_task;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String string = "bbcccaaaaa";
        Integer count = 1;

        Map<Character,Integer> freqChar = new LinkedHashMap<>();
        for (char each : string.toCharArray()) {
            if (freqChar.containsKey(each)){
                freqChar.put(each,freqChar.get(each) + 1);

            }else {
                freqChar.put(each,count);
            }

        }
        System.out.println(freqChar);

    }

}
