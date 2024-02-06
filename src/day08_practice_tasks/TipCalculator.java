package day08_practice_tasks;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numberOfPeople;
        double totalToPay, totalTip, totalPerPerson, tipPerPerson, checkAmount;
        String splitOrNot, serviceQuality;

        System.out.println("Slit Or No Split (Yes or No):");
        splitOrNot = input.next().toLowerCase();
        while (!(splitOrNot.equals("yes") || splitOrNot.equals("no"))){
            System.err.println("Please re-enter your answer: (Yes or No");
            splitOrNot = input.next().toLowerCase();
        }
        numberOfPeople = 1;
        if (splitOrNot.equals("yes")) {
            System.out.println("Enter number of People:");
            numberOfPeople = input.nextInt();
            while (!(numberOfPeople > 0)) {
                System.err.println("Invalid entry, please try again:");
                numberOfPeople = input.nextInt();
            }
        }
        System.out.println("Enter check amount:");
        checkAmount = input.nextDouble();
        while (!(checkAmount > 0)){
            System.err.println("Invalid entry, please try again:");
            checkAmount = input.nextDouble();
        }
        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        serviceQuality = input.next();
        while (!(serviceQuality.equalsIgnoreCase("Excellent")
        || serviceQuality.equalsIgnoreCase("Great")
        || serviceQuality.equalsIgnoreCase("Good")
        || serviceQuality.equalsIgnoreCase("Fair")
        || serviceQuality.equalsIgnoreCase("Poor"))){
            System.err.println("Invalid entry, please try again (Excellent/Great/Good/Fair/Poor):");
            serviceQuality = input.next();
        }
        input.close();
        totalTip = 1;

        if (serviceQuality.equalsIgnoreCase("Excellent")){
            totalTip = checkAmount * 25 / 100;
        } else if (serviceQuality.equalsIgnoreCase("Great")) {
            totalTip = checkAmount * 20 / 100;
        } else if (serviceQuality.equalsIgnoreCase("Good")){
            totalTip = checkAmount * 15 / 100;
        } else if (serviceQuality.equalsIgnoreCase("Fair")) {
            totalTip = checkAmount * 10 / 100;
        } else if (serviceQuality.equalsIgnoreCase("Poor")) {
            totalTip = checkAmount * 5 / 100;
        }
        totalToPay = checkAmount + totalTip;
        totalPerPerson = totalToPay / numberOfPeople;
        tipPerPerson = totalTip / numberOfPeople;
        System.out.println("Number of people entered: " + numberOfPeople);
        System.out.println("Total to pay: " + totalToPay);
        System.out.println("Total tip: " + totalTip);
        System.out.println("Total per person: " + totalPerPerson);
        System.out.println("Tip per person: " + tipPerPerson);

    }
}
/*
7. Create a class called TipCalculator and write a program for a tip calculator. There will be different service
quality benchmarks that will determine the tip given. There will also be the ability to calculate based on the
number of people in the party and whether there is a split of the bill.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

      The program should ask the user to enter:
          - Split or No split (Yes or No),
          - Enter the number of people (number)
          - Enter the check amount (number)
          - Service Quality (String)

      And display the output in the following format:

            Example:
                  Split or No Split (Yes or No)?
                  Input: Yes
                  Enter the number of people:
                  Input: 4
                  Enter the check amount:
                  Input: 476
                  How was the service quality? (Excellent/Great/Good/Fair/Poor)
                  Input: Excellent

            Output:
                 Number of people entered: 4
                 Total to pay: 595.0
                 Total tip: 119.0
                 Total per person: 148.75
                 Tip per person: 29.75
 */
