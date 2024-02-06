package day07_practice_tasks;

import javax.lang.model.SourceVersion;

public class Rectangle {

    double width, length;
    public void calculateArea(){
        double area = (width * length);
        System.out.println("area = " + area);
    }
    public void calculatePerimeter(){
        double perimeter = (width + length) * 2;
        System.out.println("perimeter = " + perimeter);
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
