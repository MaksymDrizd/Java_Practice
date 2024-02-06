package day03_practice_tasks;

public class LogicalOperatorsTask2 {

    public static void main(String[] args) {

        int birthYear = 1957;
        int todayYear = 2024;

        int age = todayYear - birthYear;

        boolean isEligible = age >= 18 && age <= 65;

        System.out.println("Am I eligible to work? " + isEligible);
    }
}
