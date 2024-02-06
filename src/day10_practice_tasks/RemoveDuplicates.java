package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 7));

        ArrayList<Integer> result = new ArrayList<>(Arrays.asList());
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (!result.contains(num)) {
                result.add(num);
            }
        }
        System.out.println(result);
        /*


8. Create a class called RemoveDuplicates and write a program with the following specifications:
   8.1 Given an ArrayList of integers, remove duplicated numbers.

			Example:
				list = [1,1,2,2,3,3,4,4,5,6,7]

			Output:
				[1,2,3,4,5,6,7]
         */
    }


}
