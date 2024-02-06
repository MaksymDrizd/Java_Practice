package day08_practice_tasks;

import java.util.Scanner;

public class WithoutFirstChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word");
        String word1 = input.next();
        word1 = word1.substring(1);

        System.out.println("Enter second word");
        String word2 = input.next();
        word2 = word2.substring(1);

        input.close();

        System.out.print(word1 + word2);
    }
}
/*
2. Create a class named WithoutFirstChar. Ask the user to enter two words. Print the first word without its
first character, then print the second word without its first character.

        Example:
              Inputs:
                  apple
                  banana

              Output:
                   ppleanana
 */
