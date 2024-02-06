package day03_practice_tasks;

public class LogicalOperatorsTask1 {

    public static void main(String[] args) {

        int b = 2;
        boolean result = (++b == 2 || b == 2) && --b == 2;
        //                (3 ==  2 || 3 == 2) && 2 == 2
        //                   false || false  &&  -----
        //                         false     &&  -----
        //                                 false

        System.out.println(result);  // false
        System.out.println(b);   // 3
    }
}
