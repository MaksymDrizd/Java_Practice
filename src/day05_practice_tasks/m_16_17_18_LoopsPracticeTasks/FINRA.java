package day05_practice_tasks.m_16_17_18_LoopsPracticeTasks;

public class FINRA {

    public static void main(String[] args) {

        int num = 100,
                i = 1;

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
