package day07_practice_tasks;

import java.util.Scanner;

public class MilesToKM {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter miles:");
        double miles, km;

        miles = input.nextDouble();
        km = miles * 1.609;

        System.out.println(miles + " miles is equal to " + km + " kilometers");
    }
}
