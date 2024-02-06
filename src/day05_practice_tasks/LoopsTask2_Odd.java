package day05_practice_tasks;

public class LoopsTask2_Odd {

    public static void main(String[] args) {

        System.out.print(1);

        /*
        for (int i = 3; i <= 19; i+=2) {
                System.out.print("-" + i);
        }*/
        for (int i = 3; i <= 19; i++) {
            if ( i % 2 != 0)
            System.out.print("-" + i);
        }
    }
}
