package day03_practice_tasks;

public class LogicalOperatorsTask3 {

    public static void main(String[] args) {

        int appleCount = 5;
        int orangeCount = 6;
        int strawberryCount = 12;

        boolean result = appleCount < orangeCount || orangeCount >= strawberryCount;

        System.out.println("result = " + result);

    }
}
