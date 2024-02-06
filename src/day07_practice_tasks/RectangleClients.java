package day07_practice_tasks;

public class RectangleClients {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.width = 23;
        rectangle1.length = 30;

        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();

        System.out.println(rectangle1);

        System.out.println("--------------------------------");

        Rectangle rectangle2 = new Rectangle();
        rectangle2.width = 6.4;
        rectangle2.length = 9.5;

        rectangle2.calculateArea();
        rectangle2.calculatePerimeter();

        System.out.println(rectangle2);
    }

}
