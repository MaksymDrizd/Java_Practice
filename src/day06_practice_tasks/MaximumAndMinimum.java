package day06_practice_tasks;

public class MaximumAndMinimum {

    public static void main(String[] args) {

        int n = max(100, 200);
        System.out.println(n);
        double m = max(10.5, 30.2);
        System.out.println(m);
        n = min(100, 200);
        System.out.println(n);
        m = min(10.5, 30.2);
        System.out.println(m);
    }
    public static int max(int num1, int num2){

        if (num1 > num2){
            return num1;
        }else
            return num2;
    }
    public static double max(double num1, double num2){

        if (num1 > num2){
            return num1;
        }else
            return num2;
    }
    public static int min(int num1, int num2){

        if (num1 < num2){
            return num1;
        }else
            return num2;
    }
    public static double min(double num1, double num2){

        if (num1 < num2){
            return num1;
        }else
            return num2;
    }
}
