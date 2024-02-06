package day04_practice_tasks;

public class SelectionStatementsTask02 {

    public static void main(String[] args) {

        int a = 9;
        int b = 5;
        int c = 6;

        if (a < 10){
            b = 1;
        } else if (a > 10) {
            c = 1;
        }else {
            b = 0;
            c = 0;
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);


    }
}
