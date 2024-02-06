package day12_practice_tasks;

import java.util.concurrent.Callable;

public class CircleClients {

    public static void main(String[] args) {

        Circle circle1 = new Circle(4);
        System.out.println(circle1.getRadius());
        System.out.println(circle1);

        Circle circle2 = new Circle(3.5);
        System.out.println(circle2.getRadius());
        System.out.println(circle2);

        Circle circle3 = new Circle(-6);
        System.out.println(circle3.getRadius());
        System.out.println(circle3);

    }

}
