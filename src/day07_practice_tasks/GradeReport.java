package day07_practice_tasks;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score:");

        int score = input.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Invalid number");
        } else if (score > 89) {
            System.out.println("Your grade is A");
        } else if (score > 79) {
            System.out.println("Your grade is B");
        } else if (score > 69) {
            System.out.println("Your grade is C");
        } else if (score > 59) {
            System.out.println("Your grade is D");
        } else {
            System.out.println("Your grade is F");
        }
    }
}
