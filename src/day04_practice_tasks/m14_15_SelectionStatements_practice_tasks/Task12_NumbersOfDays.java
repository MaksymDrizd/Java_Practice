package day04_practice_tasks.m14_15_SelectionStatements_practice_tasks;

public class Task12_NumbersOfDays {

    public static void main(String[] args) {

        int month = 8;

        switch (month){

            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("31 days");
                break;
            case 4, 6, 9, 11:
                System.out.println("30 days");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
