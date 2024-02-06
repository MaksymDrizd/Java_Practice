package day04_practice_tasks;

public class NestedIfStatementsTask01 {

    public static void main(String[] args) {

        int num1 = 9;
        int num2 = 9;

        if (num1 != num2){
            System.out.println("The numbers are not equal");
            if (num1 > num2){
                System.out.println("Num1 is bigger than Num2");
            } else if (num2 > num1) {
                System.out.println("The num2 is bigger than num1");
            }
        }else {
            System.out.println("The numbers are equal");
        }
    }
}
