package day04_practice_tasks.m14_15_SelectionStatements_practice_tasks;

public class Task7_CrewAndPassenger {

    public static void main(String[] args) {

        int number = 100;
        String result;

        if (number == 50) {
            result = "20 crew, 30 passengers";
        } else if (number == 75) {
            result = "25 crew, 50 passengers";
        } else if (number == 100) {
            result = "30 crew, 70 passengers";
        } else {
            result = "Number of people is not valid";
        }
        System.out.println(result);
    }
}
