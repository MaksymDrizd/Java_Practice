package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLetters {

    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>(Arrays.asList('$', 'A', 'B', '1', '2', 'c', 'd', '@', '!', '3', '4'));

       for (int i = 0; i < list.size(); i++) {
            char element = list.get(i);
            if (Character.isLetter(element)) {
                list.remove(i);
                i--;
            }
        }System.out.println(list);

    }

}
/*
10. Create a class called RemoveLetters and write a program with the following steps:
    10.1 Given an ArrayList of characters, remove all the letters.

			Example:
				list = {'$', A', 'B', '1', '2', 'c', 'd', '@', '!', '3', '4'}

			output:
				['$',  '1', '2', '@', '!', '3', '4']
 */
