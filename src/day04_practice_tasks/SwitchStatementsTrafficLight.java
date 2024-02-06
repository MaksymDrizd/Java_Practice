package day04_practice_tasks;

public class SwitchStatementsTrafficLight {

    public static void main(String[] args) {

        String lightColor = "y";

        switch (lightColor) {

            case "R":
            case "r":
                System.out.println("Red");
                break;

            case "Y":
            case "y":
                System.out.println("Yellow");
                break;

            case "G":
            case "g":
                System.out.println("Green");
                break;

            default:
                System.out.println("Invalid color");
                break;

        }
    }
}
