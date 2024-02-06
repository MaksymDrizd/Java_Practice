package day05_practice_tasks;

public class DoWhileQuestion4 {

    public static void main(String[] args) {

        int c = 0;
        boolean flag = true;
        for (int i = 0; i < 8; i++) {
            while (flag){
                c++;
                if (i > c || c > 3){
                    flag = false;
                }
            }
        }
        System.out.println(c);
    }
}
