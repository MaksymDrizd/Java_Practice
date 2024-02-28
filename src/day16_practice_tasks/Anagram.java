package day16_practice_tasks;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "abcd",
                str2 = "ccddabaa";

        System.out.println("isAnagram(str1,str2) = " + isAnagram(str1, str2));

        System.out.println(isAnagram("xyze", "xyzd"));


    }
    public static boolean isAnagram(String str1,String str2){
        Set<Character> set1 = new HashSet<>();
        for (char each : str1.toCharArray()) {
            set1.add(each);
        }
        Set<Character> set2 = new HashSet<>();
        for (char each : str2.toCharArray()) {
            set2.add(each);
        }
        return set1.equals(set2);
    }

}
