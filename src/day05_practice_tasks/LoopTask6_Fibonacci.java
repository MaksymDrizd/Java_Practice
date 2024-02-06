package day05_practice_tasks;

public class LoopTask6_Fibonacci {

    public static void main(String[] args) {

        int num1 = 0,
                num2 = 1,
                sum = 0;


        for (int i = 0; i < 8; i++ ) {
            System.out.print(num1 + " ");
            sum = num1 +num2;
            num1 = num2;
            num2 = sum;
        }
    }
}
