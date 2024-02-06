package day12_practice_tasks;

public class Circle {

    private double radius;
    private static final double PI = 3.14;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0){
            System.err.println("The radius cannot be set to a negative or zero");
            System.exit(1);
        }
        this.radius = radius;
    }
    public double calcArea(){
        double area = radius * radius * PI;
        return area;
    }
    public double calcPerimeter(){
        double perimeter = 2 * radius * PI;
        return perimeter;
    }

    public String toString() {
        return "Circle{" +
                "radius = " + radius +
                " area = " + calcArea() +
                " perimeter = " + calcPerimeter() +
                '}';
    }
}
/*
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
 */
