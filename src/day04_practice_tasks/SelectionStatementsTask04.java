package day04_practice_tasks;

public class SelectionStatementsTask04 {

    public static void main(String[] args) {

        double math = 80.0;
        double chemistry = 70.0;
        double biology = 60.0;

        double average = (math + chemistry + biology) / 3;

        if (average >= 90 && average <= 100) {
            System.out.println("Average is " + average);
            System.out.println("Your Average grade is A");
        } else if (average >= 80 && average < 90 ) {
            System.out.println("Average is " + average);
            System.out.println("Your average grade is B");
        } else if (average >= 70 && average < 80) {
            System.out.println("Average is " + average);
            System.out.println("Your Average grade is C");
        } else if (average >= 60 && average < 70) {
            System.out.println("Average is " + average);
            System.out.println("Your Average grade is D");
        }else if (average >= 0 && average < 60) {
            System.out.println("Average is " + average);
            System.out.println("Your Average grade is F");
        }else {
            System.out.println("Invalid Average grade");
        }
    }
}
