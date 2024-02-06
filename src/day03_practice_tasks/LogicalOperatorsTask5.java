package day03_practice_tasks;

public class LogicalOperatorsTask5 {

    public static void main(String[] args) {

        int year = 2024;

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        System.out.println("Is " + year + " is a leap year? " + isLeapYear);
    }
}
