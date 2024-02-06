package day03_practice_tasks;

public class UnaryOperatorsTask2 {

    public static void main(String[] args) {

        int a = 10;
        a = --a + a++ + a-- + a++;
        System.out.println(a);  //37
    }


}
