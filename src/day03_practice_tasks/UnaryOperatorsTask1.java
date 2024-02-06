package day03_practice_tasks;

public class UnaryOperatorsTask1 {

    public static void main(String[] args) {

        int x = 2;
        int y = x++;

        System.out.println(y); // y = 2

        x = 2;

        System.out.println(x++); // x = 2
        System.out.println(x); // x = 3

        x = 2;

        System.out.println(--x); // x = 1
        System.out.println(x); // x = 1

        x = 8;
        y = x--;

        System.out.println(y);  // y = 8
        System.out.println(x); // x = 7
    }
}
