package day05_practice_tasks.m_16_17_18_LoopsPracticeTasks;

public class SumOfNumbers {

    public static void main(String[] args) {

        int num = 50,
                sum = 0;


        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.println("Number = " + sum);
    }
}

        /*
        do {

            sum += i;
            i++;
        }while (i <= num);{

        }
        System.out.println("Number = " + sum);
        */
