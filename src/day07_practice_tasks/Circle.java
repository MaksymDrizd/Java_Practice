package day07_practice_tasks;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        double radius, area, perimeter;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the Circle:");

        radius = input.nextDouble();
        perimeter = 2 * 3.14 * radius;
        area = radius * radius * 3.14;
        
        System.out.println("The area of Circle is " + area + "\nThe perimeter of the Circle is " + perimeter);

        input.close();

    }
}
