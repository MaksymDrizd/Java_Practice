package day16_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovePalindromes {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList(
                "Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                "reviver", "racecar", "madam"
        ));

        removePalindrome(list);
        System.out.println(list);

    }

    public static void removePalindrome(List<String> list) {

        List<String> removePalindrome = new ArrayList<>();

        for (String each : list) {
            boolean palindrome = true;
            for (int i = 0, j = each.length() - 1; i <= j; i++, j--) {
                if (each.toLowerCase().charAt(i) != each.toLowerCase().charAt(j)) {
                    palindrome = false;
                    break;
                }
                }
            if (!palindrome) {
                    if (!removePalindrome.contains(each)) {
                        removePalindrome.add(each);
                    }
            }
        }
        list.clear();
        list.addAll(removePalindrome);
    }

}
