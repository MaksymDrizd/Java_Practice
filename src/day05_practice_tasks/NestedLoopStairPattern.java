package day05_practice_tasks;

public class NestedLoopStairPattern {

    public static void main(String[] args) {

        int number = 6;

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j < i; j++) {

                System.out.print(" ");
            }
            System.out.println("#");
        }

    }
}
