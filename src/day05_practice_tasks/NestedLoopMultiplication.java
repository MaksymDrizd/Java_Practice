package day05_practice_tasks;

public class NestedLoopMultiplication {

    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {

            for (int j = 0; j < 10; ++j) {
                int result = i * j;

                System.out.print(i + " x " + j + " = " + result + "\t\t");

            }
            System.out.println();

        }

    }
}
