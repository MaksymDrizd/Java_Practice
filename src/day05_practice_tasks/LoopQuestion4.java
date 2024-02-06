package day05_practice_tasks;

public class LoopQuestion4 {

    public static void main(String[] args) {

        int sum = 0;
        int j = 5;
        int i;

        for (i = 0; i < 10 && j > 0; i++, j--) {
            if (i % 3 == 0 || j % 5 == 0){    //Step1 true / true
                sum = sum + i + j;   //
            }
        }
        System.out.println("Sum = " + sum);
        System.out.println("i = " + i);
        System.out.println("j = " + j);

    }
}
