package day06_practice_tasks;

public class MathUtility {

    public static void main(String[] args) {

        System.out.println(calculate(100,'/', 49));
        System.out.println(calculate(12.5, '/', 4.3));
        System.out.println(square(5));
        System.out.println(square(2.5));
        System.out.println(cube(3));
        System.out.println(cube(3.5));
    }
    public static int calculate(int a, char operator, int b) {


        if (operator == '+') {
            return a + b;
        } else if (operator == '-') {
            return a - b;
        } else if (operator == '*') {
            return a * b;
        } else if (operator == '/') {
            return a / b;
        } else {
            return 0;
        }
    }
    public static double calculate(double a, char operator, double b) {

        if (operator == '+') {
            return a + b;
        } else if (operator == '-') {
            return a - b;
        } else if (operator == '*') {
            return a * b;
        } else if (operator == '/') {
            return a / b;
        } else {
            return 0;
        }
    }

    public static int square(int a) {
        return calculate(a, '*', a);

    }
    public static double square(double a) {
        return calculate(a, '*', a);
    }

    public static int cube(int a){
        return square(a) * a;
    }
    public static double cube(double a){
        return square(a) * a;
    }
}
