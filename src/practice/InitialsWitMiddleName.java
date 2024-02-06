package practice;
import java.util.Scanner;
public class InitialsWitMiddleName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name   :");
        String name = input.nextLine();
        if (!name.isEmpty()) {
            System.out.print(name.substring(0, 1).toUpperCase() + ".");
            {
                for (int i = 1; i < name.length(); i++) {
                    if (name.charAt(i - 1) == ' ' && name.charAt(i) != ' ') {
                        System.out.print(name.substring(i, i + 1).toUpperCase() + ".");
                    }
                }
            }
        }
    }
}