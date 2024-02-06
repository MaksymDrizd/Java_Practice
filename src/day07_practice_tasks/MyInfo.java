package day07_practice_tasks;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();

        System.out.println("Enter your gender:");
        String gender = input.next();
        input.nextLine();

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Enter your phone number:");
        long phoneNum = input.nextLong();

        System.out.println("Enter your zip code:");
        int zipCode = input.nextInt();
        input.nextLine();

        System.out.println("Enter your School name:");
        String school = input.nextLine();

        System.out.println("Enter your City name:");
        String city = input.nextLine();

        System.out.println("Enter your state name:");
        String state = input.next();

        System.out.println("Enter your building number:");
        int building = input.nextInt();

        System.out.println("Enter your street name:");
        String street = input.nextLine();

        input.close();

        System.out.println(fullName + "\n" + age + "\n" + gender + "\n" + phoneNum + "\nAddress:\n\t" + building +
                " " + street + "\n\t" + city + ", " + state + " " + zipCode);
    }

}
