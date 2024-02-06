package practice;

import java.util.Scanner;

public class ContainsName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        input.close();

        if(email.toLowerCase().contains("alejandro") && email.toLowerCase().contains("project")){
            System.out.println("priority");
        }else if(email.toLowerCase().contains("alejandro")){
            System.out.println("read");
        }else{
            System.out.println("don't read");
        }
    }
}
