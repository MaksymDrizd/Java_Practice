package day04_practice_tasks.m14_15_SelectionStatements_practice_tasks;

public class Task4_MedianNumber {

    public static void main(String[] args) {

        int a = 12;
        int b = 56;
        int c = 23;
        String  result;

        if (b > a && a > c || b < a && a < c){
            result = (a + " is the median number");
        } else if (a > b && b > c || a < b && b < c) {
            result = (b + " is the median number");
        } else {
            result = (c + " is the median number");
        }
        System.out.println(result);
    }
}
/* 4. Create a class named MedianNumber. Write a program that finds the median number between
three DIFFERENT given integers (Assume that the given three integers are distinct numbers).

			Example:
				   a = 10;
				   b = 15;
				   c = 20;

			Output:
				  15 is the median number

 */
