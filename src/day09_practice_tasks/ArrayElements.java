package day09_practice_tasks;

import java.util.Arrays;

public class ArrayElements {

    public static void main(String[] args) {

        //1.1 Create an array of integers with a length of 100.
        int[] num = new int[100];
        // 1.2 Assign values from 1 to 100 to the indexes of the array.
        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
            // 1.3 Display the array elements in a single line separated by spaces.
            System.out.print(num[i] + " ");
        }
        System.out.println();
        System.out.println("-------------------------------");

        //1.4 Display the array elements in a single line in reversed order, separated by spaces.
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
        System.out.println("-------------------------------");

        //1.5 Display all evenly divisible elements by 5 in a single line separated by spaces.
        for (int number : num) {
            if (number % 5 == 0) {
                System.out.print(number + " ");
            }
        }
    }
}
