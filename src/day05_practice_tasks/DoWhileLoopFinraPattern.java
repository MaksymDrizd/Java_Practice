package day05_practice_tasks;

public class DoWhileLoopFinraPattern {

    public static void main(String[] args) {

        int i = 1,
                num = 20;

        do {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FINRA ");
            } else if (i % 3 == 0) {
                System.out.print("FIN ");
            } else if (i % 5 == 0) {
                System.out.print("RA ");
            } else {
                System.out.print(i + " ");
            }
            i++;

        } while (i <= num);

    }
}
