package day05_practice_tasks;

public class WhileLoopSum {

    public static void main(String[] args) {

        int i = 0;
        int sumEven = 0;


        while(i < 11){
            if (i % 2 == 0){
                sumEven += i;
            }
            i++;
        }
        System.out.print("Sum of even numbers = " + sumEven);

    }
}
