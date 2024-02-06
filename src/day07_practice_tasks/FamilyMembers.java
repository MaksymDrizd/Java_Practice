package day07_practice_tasks;

import java.util.Scanner;

public class FamilyMembers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int amountOfPeople;

        System.out.println("How many people do you live with?");
        amountOfPeople = input.nextInt();
        if (amountOfPeople < 3){
            System.out.println("Lives with less then three people");
        } else if (amountOfPeople <= 6) {
            System.out.println("Lives with 3 - 6 people");
        }else {
            System.out.println("Lives with more than six people");
        }
        input.close();

    }
}
