package day06_practice_tasks;

public class OddAndEven {

    public static void main(String[] args) {

        boolean result = isOdd(41);
        System.out.println(result);
        result = isEven(41);
        System.out.println(result);

    }

    public static boolean isOdd(int a) {

        if (a % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isEven(int b) {

        if (b % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
