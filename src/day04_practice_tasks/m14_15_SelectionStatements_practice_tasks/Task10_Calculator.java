package day04_practice_tasks.m14_15_SelectionStatements_practice_tasks;

public class Task10_Calculator {

    public static void main(String[] args) {

        double n1 = 10,
                n2 = 20;
        char mathOperator = '+';

        switch (mathOperator){

            case '+':
                System.out.println("number = " + (n1 + n2));
                break;
            case '-':
                System.out.println("number = " + (n1 - n2));
                break;
            case '*':
                System.out.println("number = " + (n1 * n2));
                break;
            case '/':
                System.out.println("number = " + (n1 / n2));
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}
