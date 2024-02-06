package day05_practice_tasks;

public class ExtraPractice {

        public static void main(String[] args) {

            int hour = 23;


            if (hour > 6 && hour < 12) {
                System.out.println("Good morning");
            } else if (hour > 12 && hour < 15) {
                System.out.println("Good afternoon");
            } else if (hour > 15 && hour < 22) {
                System.out.println("Good evening");
            } else if (hour < 0 && hour > 23) {
                System.out.println("This is not valid number");
            } else {
                System.out.println("Sleeping?");
            }
        }
    }

