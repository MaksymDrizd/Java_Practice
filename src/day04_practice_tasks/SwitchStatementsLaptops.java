package day04_practice_tasks;

public class SwitchStatementsLaptops {

    public static void main(String[] args) {

        String laptopModel = "apple";

        switch (laptopModel) {

            case "apple":
                System.out.println("Apple - no virus");
                break;

            case "dell":
                System.out.println("Tough one");
                break;

            case "hp":
                System.out.println("Not recommended");
                break;

            default:
                System.out.println("Do not buy that one");
        }

    }
}
