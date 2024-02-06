package day04_practice_tasks.m14_15_SelectionStatements_practice_tasks;

public class Task8_AgeGroups {

    public static void main(String[] args) {

        int age = 42;
        String result;

        if (age > 0 && age <= 20){
            result = "Teenager";
        } else if (age > 20 && age < 55) {
            result = "Adult";
        } else if (age > 54 && age < 150) {
            result = "Senior";
        }else {
            result = "Invalid";
        }
        System.out.println("Young Middle-Aged " + result);
    }
}
