package day05_practice_tasks;

public class LoopTask3_Sum {

    public static void main(String[] args) {

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < 10; i++) {

            if ( i % 2 == 0){
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }

        /*for (int i = 0; i < 10; i += 2) {
            sumEven += i;

        }
        for (int i = 1; i <= 10; i += 2) {
            sumOdd += i;
        }*/
        System.out.println("sum of even number " + sumEven);  //20
        System.out.println("sum of even number " + sumOdd); //25

    }
}
