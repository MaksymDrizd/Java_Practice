package practice;

import java.util.Scanner;

public class output {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE HERE
        String firstLetter = word.substring(0, 1);
        String lastLetter = word.substring(word.length()-1);


        if (firstLetter.equalsIgnoreCase("x") && lastLetter.equalsIgnoreCase("x")){
            System.out.println(word.substring(1, word.length()-1));
        }else if (firstLetter.equalsIgnoreCase("x")){
            System.out.println(word.substring(1));
        }else if (lastLetter.equalsIgnoreCase("x")){
            System.out.println(word.substring(0, word.length()-1));
        }else{
            System.out.println(word);
        }
    }
}
