package day08_practice_tasks;

import java.util.Scanner;

public class EmailTask1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your email:");

        String email = input.nextLine();

        emailSwap(email);
        input.close();

    }

    public static void emailSwap(String email) {

        int indexOfUnderScore = email.indexOf("_");
        int indexOfAt = email.indexOf("@");

        if (email.contains("_")) {
            String firstName = email.substring(0, indexOfUnderScore);
            String lastName = email.substring(indexOfUnderScore + 1, indexOfAt);
            System.out.println(lastName + "_" + firstName + email.substring(indexOfAt));

        } else {
            System.out.println(email);
        }

    }


}
/*
4. Create a class called EmailTask1. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that can swap the first name with the last name in the email
(separated by an underscore). If the email doesn't contain an underscore, print the given input email.

        Example:
              Input:
                 mike_tyson@gmail.com

              Output:
                  tyson_mike@gmail.com
 */
