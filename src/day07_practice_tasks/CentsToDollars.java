package day07_practice_tasks;

import java.util.Scanner;

public class CentsToDollars {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter cents:");

        int dollars, remainder;

        int cents = input.nextInt();

        dollars = cents / 100;
        remainder = cents % 100;

        System.out.println(cents + " cents is equal to " + dollars + " dollars and " + remainder + " cents");

        input.close();

    }
}
