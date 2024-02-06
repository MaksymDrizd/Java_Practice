package day04_practice_tasks.m14_15_SelectionStatements_practice_tasks;

public class Task5_Grade {

    public static void main(String[] args) {

        char grade = 'B';
        String result;

        if (grade == 'A') {
            result = "Excellent";
        } else if (grade == 'B') {
            result = "Great Job";
        } else if (grade == 'C') {
            result = "Good";
        } else if (grade == 'D') {
            result = "Passed";
        } else if (grade == 'F') {
            result = "Failed";
        }else {
            result = "Invalid grade";
        }
        System.out.println(result);

    }
}
