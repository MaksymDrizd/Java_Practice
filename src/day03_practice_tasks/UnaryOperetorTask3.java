package day03_practice_tasks;

public class UnaryOperetorTask3 {

    public static void main(String[] args) {

        int x = 4;
        int y = --x * 4 - x++;

        System.out.println("x = " + x); // x = 4
        System.out.println("y = " + y); // y = 9
    }
}
