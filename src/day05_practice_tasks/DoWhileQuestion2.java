package day05_practice_tasks;

public class DoWhileQuestion2 {

    public static void main(String[] args) {

        int start = 1,
                sum = 0;

        do {
            if (start % 2 == 0){
                start++;
            }
            sum += start;
        }while (++start <= 10);

        System.out.println(sum);
    }
}
