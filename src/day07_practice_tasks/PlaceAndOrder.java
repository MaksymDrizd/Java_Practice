package day07_practice_tasks;

import java.util.Scanner;

public class PlaceAndOrder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the product name:");
        String productName = input.nextLine();
        System.out.println("Enter the price:");
        double price = input.nextDouble();
        System.out.println("Enter quantity:");
        int quantity = input.nextInt();
        System.out.println("Enter your first Name:");
        String firstName = input.next();

        double total = price * quantity;

        System.out.println(firstName + ", your order for " + quantity + " " + productName +
                " has been placed. Your total is $" + total);

    }
}
